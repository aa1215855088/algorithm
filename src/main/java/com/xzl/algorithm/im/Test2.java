package com.xzl.algorithm.im;

import java.io.IOException;

/**
 * @author xzl
 * @date 2021-06-18 14:47
 **/
public class Test2 {

    public static void main(String[] args) throws IOException {
        ImClient client = new ImClient();
        client.start();
        client.login("xzy");
        client.toChatWith();
    }
}
