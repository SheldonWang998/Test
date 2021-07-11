package com.rexyn.test2.controller.test3;

import java.util.stream.IntStream;

/**
 * @author sheldon
 * 描述：
 * @date 2021/7/9 16:55
 */
public class Test {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            // try {
            //     Thread.sleep(1000);
            // } catch (Exception e) {
            //     e.printStackTrace();
            // }
            IntStream.range(1, 1000).forEach(i -> System.out.println(Thread.currentThread().getName() + "=>" + i));

        }, "我是一号线程");
        try {
            t1.setDaemon(true);
            t1.start();
            // t1.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        IntStream.range(1, 100).forEach(i -> System.out.println(Thread.currentThread().getName() + "=>" + i));
    }
}
