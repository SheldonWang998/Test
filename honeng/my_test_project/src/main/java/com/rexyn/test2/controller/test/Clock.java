package com.rexyn.test2.controller.test;

import java.util.Collection;

/**
 * @author sheldon
 * 描述：
 * @date 2021/7/11 13:26
 */
public interface Clock {
    class TimeOutException extends Exception{
        public TimeOutException(String msg){
            super(msg);
        }
    }

    /**
     * 锁方法，允许打断
     * @throws InterruptedException
     */
    void lock() throws InterruptedException;

    /**
     * 锁方法，允许打断和超时
     * @param mills
     * @throws InterruptedException
     * @throws TimeOutException
     */
    void lock(long mills)throws InterruptedException,TimeOutException;

    /**
     * 释放锁
     */
    void unlock();

    /**
     * 获取被锁定的线程
     * @return
     */
    Collection<Thread> getBlockedThread();

    /**
     * 获取被锁定的线程个数
     * @return
     */
    int getBlockedThreadSize();
}
