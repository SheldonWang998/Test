package com.rexyn.test2.service;

/**
 * @author sheldon
 * 描述：捕获线程里面的异常
 * @date 2021/7/12 20:22
 */
public class ThreadException {
    private final static int a = 10;
    private final static int b = 0;

    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            //模拟线程工作
            try {
                Thread.sleep(10000);
                int result = a / b;
                System.out.println(result);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t.setUncaughtExceptionHandler((thread,e)->{
            System.out.println(e);
            System.out.println(thread);
        });
        t.start();
    }
}
