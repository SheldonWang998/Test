package com.rexyn.test2.controller.test5;

/**
 * @author sheldon
 * 描述：
 * @date 2021/7/10 4:59
 */
public class Test2 {
    public static void main(String[] args) {
        Lock lock = new Lock();
        new Thread("我是一号线程"){
            @Override
            public void run() {
                lock.m1();
            }
        }.start();
        new Thread("我是二号线程"){
            @Override
            public void run() {
                lock.m2();
            }
        }.start();
    }
}
class Lock {
    public synchronized void m1(){
        System.out.println("我是m1方法");
        String name = Thread.currentThread().getName();
        System.out.println(name);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public synchronized void m2(){
        System.out.println("我是m2方法");
        String name = Thread.currentThread().getName();
        System.out.println(name);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
