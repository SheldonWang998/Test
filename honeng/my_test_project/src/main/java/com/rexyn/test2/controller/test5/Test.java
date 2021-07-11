package com.rexyn.test2.controller.test5;

/**
 * @author sheldon
 * 描述：
 * @date 2021/7/9 20:55
 */
public class Test
{
    public static void main(String[] args) {
        MyTask myTask = new MyTask();
        Thread t1= new Thread(myTask,"我是一号线程");
        Thread t2= new Thread(myTask,"我是二号线程");
        Thread t3= new Thread(myTask,"我是三号线程");
        t1.start();
        t2.start();
        t3.start();
    }
}
