package com.rexyn.test2.controller.test5;

/**
 * @author sheldon
 * 描述：
 * @date 2021/7/9 20:56
 */
public class MyTask implements Runnable {
    private int index = 1;
    private final static int max = 500;
    private final Object object = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (object) {
                if (index > max) {
                    break;
                }
                System.out.println(Thread.currentThread().getName() + "=>" + index++);

            }
        }
    }
}
