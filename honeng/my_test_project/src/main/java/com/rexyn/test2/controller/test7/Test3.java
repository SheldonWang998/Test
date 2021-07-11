package com.rexyn.test2.controller.test7;

import java.util.stream.Stream;

/**
 * @author sheldon
 * 描述：线程之间通信 3、多个线程生产，多个线程消费
 * @date 2021/7/10 19:54
 */
public class Test3 {
    private int i = 0;
    private boolean flag = false;
    final private Object LOCK = new Object();

    public void produce() {
        synchronized (LOCK) {
           while (flag) {
               i++;
                System.out.println(Thread.currentThread().getName() + "=>" + i);
                flag = false;
                LOCK.notifyAll();
            }
            try {
                LOCK.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public void consumer() {
        synchronized (LOCK) {
           while (flag) {
                try {
                    LOCK.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + "=>" + i);
            flag=true;
            LOCK.notifyAll();

        }
    }


    public static void main(String[] args) {
        Test3 test3 = new Test3();
        Stream.of("p1","p2","p3").forEach(n->
        new Thread(n) {
            @Override
            public void run() {
               while (true){
                   test3.produce();
               }
            }
        }.start());
        Stream.of("c1","c2","c3").forEach(n->
        new Thread(n) {
            @Override
            public void run() {
                while (true){
                    test3.consumer();
                }
            }
        }.start());
    }

}