package com.rexyn.test2.controller.test9;

import java.util.stream.IntStream;

/**
 * @author sheldon
 * 描述：
 * @date 2021/7/13 22:35
 */
public class Test {
    public static void main(String[] args) {
        ThreadPool threadPool = new ThreadPool();
        IntStream.range(0,500).forEach(
                i->{
                    threadPool.submit(()->{
                        System.out.println(Thread.currentThread().getName()+"=>" +i);
                        try {
                            Thread.sleep(10000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    });
                }
        );
    }
}
