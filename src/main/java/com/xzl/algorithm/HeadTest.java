package com.xzl.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author xzl
 * @date 2021-07-23 16:46
 **/
public class HeadTest {

    public static void main(String[] args) throws InterruptedException {
        List<String[]> stringList = new ArrayList<>();
        test(stringList);
        System.out.println(stringList.size());
        new HeadTest().test1(stringList);
        System.out.println(stringList.size());
        TimeUnit.SECONDS.sleep(10000);
    }

    public void test1(List<String[]> stringList) {
        stringList = new ArrayList<>();
        stringList.add(new String[1024 * 1024]);
    }

    public static void test(List<String[]> stringList) {
        stringList = new ArrayList<>();
        stringList.add(new String[1024 * 1024]);
    }

}
