package com.xzl.algorithm;

import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

import static com.xzl.algorithm.TimeWheel.State.*;

/**
 * 时间轮 算法
 *
 * @author xuzilou
 * @since 2021/5/12 14:01
 */
public class TimeWheel {


    final Map<Integer, Set<Runnable>>[] wheel;

    final ScheduledExecutorService scheduled = Executors.newScheduledThreadPool(1);

    AtomicInteger curWheel = new AtomicInteger(0);

    AtomicInteger globalPos = new AtomicInteger(0);

    volatile State state;

    long wheelTime;

    TimeUnit unit;

    public TimeWheel(int wheelSize, long wheelTime, TimeUnit unit) {
        state = INIT;
        wheel = createWheel(wheelSize);
        this.wheelTime = wheelTime;
        this.unit = unit;
    }

    public void start() {
        if (state == INIT) {
            scheduled.scheduleAtFixedRate(new Worker(), wheelTime, wheelTime, unit);
            state = START;
        }
    }

    public void addTask(Runnable task, long timeOut, TimeUnit unit) {
        long time = this.unit.convert(timeOut, unit);
        int length = wheel.length;
        int p = (int) (time / wheelTime);
        int index = (int) (p - 1) & (length - 1);
        int pos = p / length;
        Map<Integer, Set<Runnable>> maps = wheel[index];
        Set<Runnable> tasks = maps.get(pos);
        if (Objects.isNull(tasks)) {
            tasks = new HashSet<>();
        }
        tasks.add(task);
        maps.put(pos, tasks);
        start();
    }


    private final class Worker implements Runnable {
        @Override
        public void run() {
            if (state == START) {
                try {
                    int curIndex = curWheel.get();
                    Map<Integer, Set<Runnable>> map = wheel[curIndex];
                    Set<Runnable> tasks = map.get(globalPos.get());
                    if (tasks == null) {
                        return;
                    }
                    tasks.forEach(Runnable::run);
                    map.remove(globalPos.get());
                } finally {
                    if (curWheel.incrementAndGet() >= wheel.length) {
                        globalPos.incrementAndGet();
                        curWheel.set(0);
                    }
                }
            }
        }
    }

    public void shutDown() {
        state = SHUTDOWN;
        scheduled.shutdown();
    }


    static enum State {
        INIT,
        START,
        SHUTDOWN
    }

    @SuppressWarnings("unchecked")
    private Map<Integer, Set<Runnable>>[] createWheel(int wheelSize) {
        Map<Integer, Set<Runnable>>[] wheel = new HashMap[tableSizeFor(wheelSize)];
        for (int i = 0; i < wheel.length; i++) {
            wheel[i] = new HashMap<>();
        }
        return wheel;
    }

    final int tableSizeFor(int cap) {
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }

    static final int MAXIMUM_CAPACITY = 1 << 30;
}
