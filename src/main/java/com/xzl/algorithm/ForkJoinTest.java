package com.xzl.algorithm;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/**
 * @author xzl
 * @date 2021-06-22 21:11
 **/
public class ForkJoinTest {

    public static void main(String[] args) throws InterruptedException {
        ForkJoinPool pool = new ForkJoinPool(1);
        pool.shutdown();
        new Thread();
        pool.awaitTermination(1, TimeUnit.MILLISECONDS);
    }
}
