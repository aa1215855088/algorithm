package com.xzl.algorithm;

import org.junit.Test;

import java.time.LocalDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author xuzilou
 * @since 2021/5/12 14:03
 */
public class TestAlgorithm {

    @Test
    public void testTimeWheel() throws InterruptedException {
        TimeWheel timeWheel = new TimeWheel(16, 1000, TimeUnit.MILLISECONDS);
        long l = System.currentTimeMillis();
        for (int i = 1; i < 100000; i++) {
            int finalI = i;
            timeWheel.addTask(() -> System.out.println("任务:[" + finalI + "]:" + LocalDateTime.now()), i, TimeUnit.SECONDS);
        }
        System.out.println(System.currentTimeMillis() - l);
        TimeUnit.SECONDS.sleep(5);
//        timeWheel.shutDown();
        TimeUnit.SECONDS.sleep(500000);

    }

    @Test
    public void scheduled() throws InterruptedException {
        final ScheduledExecutorService scheduled = Executors.newScheduledThreadPool(1);
        long l = System.currentTimeMillis();
        for (int i = 1000000; i > 1; i--) {
            int finalI = i;
            scheduled.schedule(() -> System.out.println("任务:[" + finalI + "]:" + LocalDateTime.now()), i, TimeUnit.SECONDS);
        }
        System.out.println(System.currentTimeMillis() - l);
        TimeUnit.SECONDS.sleep(10);
        scheduled.schedule(() -> System.out.println("任务:[ok]:" + LocalDateTime.now()), 1, TimeUnit.SECONDS);
        TimeUnit.SECONDS.sleep(10000);
    }

    @Test
    public void testNewTimeWheel() throws InterruptedException {
        NewTimeWheel timeWheel = new NewTimeWheel(1600, 1000, TimeUnit.MILLISECONDS);
        long l = System.currentTimeMillis();
        for (int i = 1; i < 1000000; i++) {
            int finalI = i;
            timeWheel.addTask(() -> System.out.println("任务:[" + finalI + "]:" + LocalDateTime.now()), i, TimeUnit.SECONDS);
        }
        System.out.println(System.currentTimeMillis() - l);
        TimeUnit.SECONDS.sleep(10);
        timeWheel.addTask(() -> System.out.println("任务:[ok]:" + LocalDateTime.now()), 1, TimeUnit.SECONDS);
        TimeUnit.SECONDS.sleep(100000);
    }

    @Test
    public void hash() {
        int size = 16;
        long l = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            int f = i % 16;
        }
        System.out.println(System.currentTimeMillis() - l);
    }

    @Test
    public void testCurrentTimeMillis() throws InterruptedException {
        long l = System.currentTimeMillis();
        Thread[] threads = new Thread[100000];
        for (int i = 0; i < 100000; i++) {
            Thread thread = new Thread(() -> {
                long timeMillis = System.currentTimeMillis();
            });
            threads[i] = thread;
        }
        for (Thread thread : threads) {
            thread.join();
        }
        System.out.println(System.currentTimeMillis() - l + "ms");
    }

    @Test
    public void testCurrentTimeMillis1() throws InterruptedException {
        SystemClock systemClock = SystemClock.getInstance();
        long l = System.currentTimeMillis();
        Thread[] threads = new Thread[100000];
        for (int i = 0; i < 100000; i++) {
            Thread thread = new Thread(() -> {
                long timeMillis = systemClock.now();
            });
            threads[i] = thread;
        }
        for (Thread thread : threads) {
            thread.join();
        }
        System.out.println(System.currentTimeMillis() - l + "ms");
    }
}
