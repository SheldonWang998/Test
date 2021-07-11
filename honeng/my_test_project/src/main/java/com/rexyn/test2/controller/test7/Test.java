package com.rexyn.test2.controller.test7;

import java.util.stream.Stream;

/**
 * @author sheldon
 * 描述：线程之间通信 1、一个线程生产，一个线程消费
 * @date 2021/7/10 19:32
 */
public class Test {
    public static void main(String[] args) {
        ProduceAndConsumer pc = new ProduceAndConsumer();
        Stream.of("p1", "p2", "p3").forEach(n ->
                new Thread() {
                    @Override
                    public void run() {
                        while (true)
                            pc.produce();
                    }
                }.start());
        Stream.of("c1", "c2", "c3").forEach(n ->
                new Thread() {
                    @Override
                    public void run() {
                        while (true)
                            pc.consumer();
                    }
                }.start());
    }
}

class ProduceAndConsumer {
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
