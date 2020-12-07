package com.rexyn.test;

import com.rexyn.test.thread.MyThread;
import com.rexyn.test.thread.Task;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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
        Thread thread = new Thread(myThread3, "2号线程");
        thread.start();
        Task task = new Task();
        Thread thread1 = new Thread(task, "3号线程");
        thread1.start();
        // 创建线程池
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        execute();
    }

    private static void execute() {
        //ThreadPoolExecutor.java 中execute（）方法的实现

//        if (command == null)
//            throw new NullPointerException();
//        int c = ctl.get();
//        if (workerCountOf(c) < corePoolSize) {
//            if (addWorker(command, true))
//                return;
//            c = ctl.get();
//        }
//        if (isRunning(c) && workQueue.offer(command)) {
//            int recheck = ctl.get();
//            if (! isRunning(recheck) && remove(command))
//                reject(command);
//            else if (workerCountOf(recheck) == 0)
//                addWorker(null, false);
//        }
//        else if (!addWorker(command, false))
//            reject(command);
//    }
    }
}

