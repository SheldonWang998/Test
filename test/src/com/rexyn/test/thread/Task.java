package com.rexyn.test.thread;

/**
 * @ClassName: Task
 * @Author: sheldon
 * @Date: 2020/12/3
 * @Description:
 */
public class Task implements Runnable {
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + 111);
    }
}
