package com.rexyn.test2.controller.test;

/**
 * @author sheldon
 * 描述：
 * @date 2021/7/8 17:39
 */
public class Chuangkou2 implements Runnable{
    private static final int max= 50;
    private int index = 1;
    @Override
    public void run() {
        while (index <= max){
            System.out.println(Thread.currentThread() +"当前号码是：" + index++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
