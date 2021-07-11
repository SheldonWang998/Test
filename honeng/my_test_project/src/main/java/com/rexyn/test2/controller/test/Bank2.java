package com.rexyn.test2.controller.test;

/**
 * @author sheldon
 * 描述：
 * @date 2021/7/8 17:39
 */
public class Bank2 {
    public static void main(String[] args) {
        final Chuangkou2 c2 = new Chuangkou2();
        Thread t1 = new Thread(c2,"一号窗口");
        Thread t2 = new Thread(c2,"二号窗口");
        Thread t3 = new Thread(c2,"三号窗口");
        t1.start();
        t2.start();
        t3.start();
    }
}
