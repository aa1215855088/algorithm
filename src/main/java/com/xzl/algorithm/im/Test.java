package com.xzl.algorithm.im;

import java.io.IOException;

/**
 * @author xzl
 * @date 2021-06-18 14:47
 **/
public class Test {

    public static void main(String[] args) throws IOException {
        ImClient client = new ImClient();
        client.start();
        client.login("xzl");
        client.toChatWith();
    }
}
