package com.rexyn.threadPool;

import java.util.stream.IntStream;

/**
 * @author sheldon
 * 描述：
 * @date 2021/7/13 18:52
 */
public class ThreadPoolTest {
    public static void main(String[] args) {
        MyThreadPool myThreadPool = new MyThreadPool();
        IntStream.range(0,40).forEach(
                i->{
                    myThreadPool.submit(()->{
                        System.out.println(Thread.currentThread() +"=>" +i+"start");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread() +"=>" +i+"end");
                    });
                }
        );
    }
}
