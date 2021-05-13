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
        TimeWheel timeWheel = new TimeWheel(16, 1, TimeUnit.SECONDS);
        long l = System.currentTimeMillis();
        for (int i = 1; i < 100000; i++) {
            int finalI = i;
            timeWheel.addTask(() -> System.out.println("任务:[" + finalI + "]:" + LocalDateTime.now()), i, TimeUnit.SECONDS);
            timeWheel.addTask(() -> System.out.println("任务:[" + finalI + "]:" + LocalDateTime.now()), i, TimeUnit.SECONDS);
        }
        System.out.println(System.currentTimeMillis() - l);
        TimeUnit.SECONDS.sleep(10000);
    }

    @Test
    public void scheduled() throws InterruptedException {
        final ScheduledExecutorService scheduled = Executors.newScheduledThreadPool(1);
        long l = System.currentTimeMillis();
        for (int i = 1; i < 100000; i++) {
            int finalI = i;
            scheduled.schedule(() -> System.out.println("任务:[" + finalI + "]:" + LocalDateTime.now()), i, TimeUnit.SECONDS);
            scheduled.schedule(() -> System.out.println("任务:[" + finalI + "]:" + LocalDateTime.now()), i, TimeUnit.SECONDS);
        }
        System.out.println(System.currentTimeMillis() - l);
        TimeUnit.SECONDS.sleep(10000);
    }
}
