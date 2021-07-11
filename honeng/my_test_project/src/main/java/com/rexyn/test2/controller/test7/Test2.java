package com.rexyn.test2.controller.test7;

/**
 * @author sheldon
 * 描述：线程之间通信 2、一个线程生产，一个线程消费
 * @date 2021/7/10 19:41
 */
public class Test2 {
    static volatile boolean flag = false;
    public static void main(String[] args) {
        ProduceAndConsumer2 pc2 = new ProduceAndConsumer2();

        new Thread("p") {
            @Override
            public void run() {
                while (true) {
                    if (flag) {
                        pc2.produce();
                        flag = false;
                    }
                }
            }
        }.start();
        new Thread("c") {
            @Override
            public void run() {
                while (true) {
                    if (!flag) {
                        pc2.consumer();
                        flag = true;
                    }
                }
            }
        }.start();
    }
}

class ProduceAndConsumer2 {
    private static int i = 1;

    //生产数据
    public void produce() {
        System.out.println(Thread.currentThread().getName() + "  =>  " + i++);
    }

    //消费数据
    public void consumer() {
        System.out.println(Thread.currentThread().getName() + "  =>  " + i);
    }
}