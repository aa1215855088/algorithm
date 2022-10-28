package com.xzl.algorithm;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author xuzilou
 * @since 2021/5/17 16:49
 */
public class SystemClock {


    private final long period;

    private volatile long now;

    public SystemClock(long period) {
        this.period = period;
        this.now = System.currentTimeMillis();
        runTime();
    }


    public void runTime() {
        ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor(runnable -> {
            Thread thread = new Thread(runnable, "System Clock");
            thread.setDaemon(true);
            return thread;
        });
        scheduler.scheduleAtFixedRate(() -> now = System.currentTimeMillis(), period, period, TimeUnit.MILLISECONDS);
    }

    public long now() {
        return this.now;
    }

    private static final SystemClock INSTANCE = new SystemClock(1);

    public static SystemClock getInstance() {
        return INSTANCE;
    }
}
