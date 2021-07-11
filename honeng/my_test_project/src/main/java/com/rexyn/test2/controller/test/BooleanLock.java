package com.rexyn.test2.controller.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * @author sheldon
 * 描述：
 * @date 2021/7/11 13:37
 */
public class BooleanLock implements Clock {
    /**
     * false:表示可以被抢
     * true：表示已经被用了
     */
    private boolean initValue;
    private Collection<Thread> blockedThreadCollection = new ArrayList<>();
    /**
     * 表记当前线程，谁上锁，谁才能释放
     */
    private Thread currentThread;

    /**
     * 初始化的时候，设置initValue为false；
     */
    public BooleanLock() {
        this.initValue = false;
    }

    @Override
    public synchronized void lock() throws InterruptedException {
        while (initValue) {
            blockedThreadCollection.add(Thread.currentThread());
            this.wait();
        }
        blockedThreadCollection.remove(Thread.currentThread());
        this.initValue = true;
        this.currentThread = Thread.currentThread();
    }

    @Override
    public synchronized void lock(long mills) throws InterruptedException, TimeOutException {
        if (mills <= 0) {
            lock();
        }
        long hasRemaining = mills;
        long endTime = System.currentTimeMillis() + mills;
        while (initValue) {
            if (hasRemaining <= 0) {
                throw new TimeOutException(Thread.currentThread().getName()+"time out");
            }
            blockedThreadCollection.add(Thread.currentThread());
            this.wait(mills);
            hasRemaining = endTime - System.currentTimeMillis();

        }
        this.currentThread = Thread.currentThread();
        this.initValue = true;
    }

    /**
     * 释放锁的时候，唤醒所以被锁住的对象
     */
    @Override
    public synchronized void unlock() {
        if (currentThread == Thread.currentThread()) {
            this.initValue = false;
            System.out.println(Thread.currentThread() + "release the lock monitor");
            this.notifyAll();
        }
    }

    @Override
    public Collection<Thread> getBlockedThread() {
        return Collections.unmodifiableCollection(blockedThreadCollection);
    }

    @Override
    public int getBlockedThreadSize() {
        return blockedThreadCollection.size();
    }
}
