package com.xzl.algorithm.im;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * @author xzl
 * @date 2021-06-18 12:46
 **/
public class ImClient {
    Socket socket = null;
    BufferedReader bufferedReader = null;

    public void toChatWith() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入聊天人:");
        String user = sc.next();
        while (true) {
            System.out.print("发送消息:");
            String message = sc.next();
            String sendMsg = String.join(":", "sendMsg", user, message);
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
            printWriter.println(sendMsg);
        }
    }

    public void login(String userName) {
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
            printWriter.println("login:" + userName);
            new Thread(() -> {
                try {
                    while (true) {
                        System.out.println("收到消息:" + bufferedReader.readLine());
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        try {
            socket = new Socket("127.0.0.1", 8888);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
