package com.rexyn.test;

import com.rexyn.test.thread.MyThread;
import com.rexyn.test.thread.Task;

/**
 * @ClassName: Demo_03
 * @Author: sheldon
 * @Date: 2020/12/3
 * @Description:
 */
public class Demo_03 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.setName("1号线程");
        myThread.start();
        MyThread myThread2 = new MyThread();
        myThread2.start();
        MyThread myThread3 = new MyThread();
        Thread thread = new Thread(myThread3,"2号线程");
        thread.start();
        Task task = new Task();
        Thread thread1 = new Thread(task,"3号线程");
        thread1.start();

    }
}
