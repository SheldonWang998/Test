package com.rexyn.test2.controller.test4;

import java.util.stream.IntStream;

/**
 * @author sheldon
 * 描述：打断线程
 * @date 2021/7/9 19:21
 */
public class Test3 {
    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        worker.interrupt();
    }

    private static class Worker extends Thread {
        @Override
        public void run() {
            while (true) {
                if (Thread.currentThread().isInterrupted()) {
                    System.out.println("接收到中断信号");
                    break;
                }
                IntStream.range(1, 10).forEach(i -> {
                    System.out.println(Thread.currentThread().getName() + "=>" + i);
                });
            }
        }
    }
}
