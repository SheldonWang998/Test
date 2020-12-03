package com.rexyn.test.thread;

/**
 * @ClassName: MyThread
 * @Author: sheldon
 * @Date: 2020/12/3
 * @Description:
 */
public class MyThread extends Thread {
    @Override
    public void run(){
        String name = Thread.currentThread().getName();
        System.out.println(name + 111);
    }
}
