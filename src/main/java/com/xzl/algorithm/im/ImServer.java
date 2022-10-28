package com.xzl.algorithm.im;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * @author xzl
 * @date 2021-06-18 12:30
 **/
public class ImServer {

    Map<String, Socket> userMap = new HashMap<>();

    public static void main(String[] args) {
        new Thread(new ImServer()::start).start();
    }

    public void start() {

        try {
            ServerSocket serverSocket = new ServerSocket(8888);
            while (true) {
                Socket accept = serverSocket.accept();
                new Thread(() -> {
                    try {
                        while (true) {
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(accept.getInputStream()));
                            PrintWriter printWriter = new PrintWriter(accept.getOutputStream(), true);
                            String msg = bufferedReader.readLine();
                            if (msg.startsWith("login")) {
                                String userName = msg.split(":")[1];
                                userMap.put(userName, accept);
                                printWriter.println("登录成功");
                            } else if (msg.startsWith("sendMsg")) {
                                String userName = msg.split(":")[1];
                                Socket socket = userMap.get(userName);
                                if (socket != null && !socket.isClosed()) {
                                    PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
                                    writer.println(msg.split(":")[2]);
                                }
                            }
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
