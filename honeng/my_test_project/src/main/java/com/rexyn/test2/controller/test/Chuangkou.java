package com.rexyn.test2.controller.test;

/**
 * @author sheldon
 * 描述：
 * @date 2021/7/8 17:14
 */
public class Chuangkou extends Thread{
    private static final int max = 50;
    private static volatile int index = 1;
    private final String name;

    public Chuangkou(String name) {
        this.name = name;
    }


    @Override
    public void run() {
       while (index < max){
           System.out.println(name +"当前号码为：" + index++);
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
    }
}
