package com.xzl.algorithm.netty;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.FixedLengthFrameDecoder;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import io.netty.handler.timeout.IdleStateHandler;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author xzl
 * @date 2021-07-06 23:22
 **/
public class TestServer {

    public static void main(String[] args) throws InterruptedException {
        EventLoopGroup work = new NioEventLoopGroup(new ThreadFactory() {
            final AtomicInteger a = new AtomicInteger(1);

            @Override
            public Thread newThread(Runnable r) {
                return new Thread(r, "work" + "-" + a.getAndIncrement());
            }
        });
        EventLoopGroup boss = new NioEventLoopGroup(new ThreadFactory() {
            final AtomicInteger a = new AtomicInteger(1);

            @Override
            public Thread newThread(Runnable r) {
                return new Thread(r, "boss" + "-" + a.getAndIncrement());
            }
        });
        ServerBootstrap serverBootstrap = new ServerBootstrap();
        serverBootstrap
                .group(boss, work)
                .channel(NioServerSocketChannel.class)
                .option(ChannelOption.SO_BACKLOG, 100)
                .handler(new LoggingHandler(LogLevel.INFO))
                .childHandler(new ChannelInitializer<SocketChannel>() {
                    @Override
                    protected void initChannel(SocketChannel ch) throws Exception {
                        ch.pipeline().addLast(new FixedLengthFrameDecoder(7));
                        ch.pipeline().addLast(new StringDecoder());
                        ch.pipeline().addLast(new IdleStateHandler(10, 10, 10));
                        ch.pipeline().addLast(new ChannelDuplexHandler() {
                            @Override
                            public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
                                System.out.println(msg);
                                ctx.fireChannelRead(msg);
                            }
                        });
                    }
                });
        ChannelFuture future = serverBootstrap.bind(9999).sync()
                .addListener((ChannelFutureListener) future1 -> System.out.println("server启动状态:" + future1.isSuccess()));
        future.channel().closeFuture().sync();
        work.shutdownGracefully();
        boss.shutdownGracefully();
    }
}
