package com.rexyn.test2.controller.test;

/**
 * @author sheldon
 * 描述：
 * @date 2021/7/8 17:15
 */
public class Bank {

    public static void main(String[] args) {
        Chuangkou chuangkou1 = new Chuangkou("一号窗口");
        Chuangkou chuangkou2 = new Chuangkou("二号窗口");
        Chuangkou chuangkou3 = new Chuangkou("三号窗口");
        chuangkou1.start();
        chuangkou2.start();
        chuangkou3.start();
    }
}
