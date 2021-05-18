package com.xzl.algorithm;

import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

import static com.xzl.algorithm.NewTimeWheel.State.*;

/**
 * 时间轮 算法
 *
 * @author xuzilou
 * @since 2021/5/12 14:01
 */
public class NewTimeWheel {


    private final List<Task>[] wheel;

    private final ScheduledExecutorService scheduled;

    private final ExecutorService executor;

    private final AtomicInteger curWheel;

    private final AtomicInteger globalPos;

    private volatile State state;

    private final long wheelTime;

    private final ReentrantLock lock = new ReentrantLock();

    private final Object object = new Object();

    private long startTime;

    private final SystemClock systemClock = SystemClock.getInstance();

    public NewTimeWheel(int wheelSize, long wheelTime, TimeUnit unit) {
        this.state = INIT;
        this.wheel = createWheel(wheelSize);
        this.scheduled = Executors.newScheduledThreadPool(1);
        this.wheelTime = unit.toMillis(wheelTime);
        int availProcessors = Runtime.getRuntime().availableProcessors();
        this.executor = Executors.newScheduledThreadPool(availProcessors - 1);
        globalPos = new AtomicInteger(0);
        curWheel = new AtomicInteger(0);
    }

    public void start() {
        if (state == INIT) {
            synchronized (object) {
                if (state == INIT) {
                    state = START;
                    startTime = System.currentTimeMillis();
                    scheduled.scheduleAtFixedRate(new Worker(), 0, wheelTime, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    public void addTask(Runnable run, long timeOut, TimeUnit unit) {
        start();
        long time = unit.toMillis(timeOut);
        int length = wheel.length;
        long curTime = systemClock.now();
        int p = (int) (((curTime + time) - startTime) / wheelTime);
        int pos = p / length;
        try {
            lock.lock();
            wheel[p & (length - 1)].add(new Task(pos, run));
        } finally {
            lock.unlock();
        }
    }

    private static class Task implements Runnable {

        private final int pos;

        private final Runnable run;

        public Task(int pos, Runnable run) {
            this.pos = pos;
            this.run = run;
        }

        @Override
        public void run() {
            run.run();
        }

        public int getPos() {
            return this.pos;
        }
    }

    private final class Worker implements Runnable {
        @Override
        public void run() {
            if (state == START) {
                try {
                    int curIndex = curWheel.get();
                    List<Task> tasks = wheel[curIndex];
                    if (tasks == null) {
                        return;
                    }
                    int pos = globalPos.get();
                    Iterator<Task> taskIterator = tasks.iterator();
                    while (taskIterator.hasNext()) {
                        Task task = taskIterator.next();
                        if (task.getPos() <= pos) {
                            executor.submit(task);
                            try {
                                lock.lock();
                                taskIterator.remove();
                            } finally {
                                lock.unlock();
                            }
                        }
                    }
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
        synchronized (object) {
            state = SHUTDOWN;
            scheduled.shutdown();
        }
    }


    static enum State {
        INIT,
        START,
        SHUTDOWN
    }

    @SuppressWarnings("unchecked")
    private List<Task>[] createWheel(int wheelSize) {
        List<Task>[] wheel = new LinkedList[tableSizeFor(wheelSize)];
        for (int i = 0; i < wheel.length; i++) {
            wheel[i] = new LinkedList<>();
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
