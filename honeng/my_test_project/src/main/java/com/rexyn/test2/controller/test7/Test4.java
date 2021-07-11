package com.rexyn.test2.controller.test7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author sheldon
 * 描述：线程之间通信，始终保持固定线程数运行
 * @date 2021/7/11 6:54
 */
public class Test4 {
    static LinkedList<controller> linkedList = new LinkedList<>();
    static final int max_work_thread = 5;

    public static void main(String[] args) {
        List<Thread> worker = new ArrayList<>();
        //定义主机
        Arrays.asList("M1", "M2", "M3", "M4", "M5", "M6", "M7", "M8", "M9", "M10", "M11", "M12")
                .stream()
                .map(Test4::createThread)
                .forEach(t -> {
                    t.start();
                    worker.add(t);
                });
        worker.stream().forEach(n -> {
            try {
                n.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        System.out.println("all of the worker thread is fished");
    }

    /**
     * 根据线程名称创建线程的方法
     *
     * @param threadName
     * @return
     */
    public static Thread createThread(String threadName) {
        return new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "线程创建完毕，准备开始工作");
            synchronized (linkedList) {
                //如果工作的线程数大于5个，则等待
                while (linkedList.size() > max_work_thread) {
                    try {
                        linkedList.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                linkedList.addFirst(new controller());
            }
            System.out.println(Thread.currentThread().getName() + "开始工作");
            try {
                Thread.sleep(100000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (linkedList){
                System.out.println(Thread.currentThread().getName()+"工作完成");
                linkedList.removeLast();
                linkedList.notifyAll();
            }
        }, threadName);
    }

    /**
     * 用于控制线程个数
     */
    public static class controller {

    }
}
