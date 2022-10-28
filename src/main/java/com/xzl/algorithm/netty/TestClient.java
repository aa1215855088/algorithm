package com.xzl.algorithm.netty;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.string.StringEncoder;

import java.util.concurrent.TimeUnit;

/**
 * @author xzl
 * @date 2021-07-06 23:29
 **/
public class TestClient {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            new Thread(() -> {
                try {
                    new TestClient().client(finalI);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            },i+"-").start();
        }
        TimeUnit.SECONDS.sleep(10000);
    }

    public void client(final  Integer id) throws InterruptedException {
        EventLoopGroup group = new NioEventLoopGroup();
        Bootstrap bootstrap = new Bootstrap();
        bootstrap
                .group(group)
                .channel(NioSocketChannel.class)
                .option(ChannelOption.TCP_NODELAY, true)
                .handler(new ChannelInitializer<SocketChannel>() {
                    @Override
                    protected void initChannel(SocketChannel ch) throws Exception {
                        ch.pipeline().addLast(new StringEncoder());
                        ch.pipeline().addLast(new ChannelDuplexHandler() {
                            @Override
                            public void channelActive(ChannelHandlerContext ctx) throws Exception {
                                while (true){
                                    Thread.sleep(1000);
                                    ctx.writeAndFlush(id+"-"+"hello");
                                }
                            }
                        });
                    }
                });
        ChannelFuture future = bootstrap.connect("127.0.0.1", 9999).sync()
                .addListener(new ChannelFutureListener() {
                    @Override
                    public void operationComplete(ChannelFuture future) throws Exception {
                        System.out.println("注册结果:"+future.isSuccess());
                    }
                });
        future.channel().closeFuture().sync();
        group.shutdownGracefully();
    }
}

