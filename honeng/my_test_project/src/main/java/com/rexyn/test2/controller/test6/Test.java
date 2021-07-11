package com.rexyn.test2.controller.test6;

/**
 * @author sheldon
 * 描述：
 * @date 2021/7/10 5:28
 */
public class Test {
    public static void main(String[] args) {
        OtherService otherService = new OtherService();
        DeadLock deadLock = new DeadLock(otherService);

        new Thread() {
            @Override
            public void run() {
                while (true) {
                    otherService.s2();
                }
            }
        }.start();


        new Thread("") {
            @Override
            public void run() {
                while (true) {
                    deadLock.d1();
                }
            }
        }.start();

    }
}
