package com.rexyn.test2.controller;

/**
 * @author sheldon
 * 描述：
 * @date 2021/7/8 13:36
 */
public class Test {
    public static void main(String[] args) {
        new Thread("other-thread"){
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("task3 => " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
        Thread t1 = new Thread("custom-thread"){
            @Override
            public void run(){
                for (int i = 0; i < 1000; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("task1 => " + i);
                }
            }
        };
        t1.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("task2 => " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
