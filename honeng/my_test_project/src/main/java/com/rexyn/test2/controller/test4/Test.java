package com.rexyn.test2.controller.test4;

/**
 * @date 2021/7/9 19:02
 * 中断线程的方式1
 */
public class Test {
    private static class worker extends Thread {
        private static volatile boolean flag = true;

        @Override
        public void run() {
            while (flag) {
                //模拟线程执行任务
                try {
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        void shutDown() {
            System.out.println("关闭线程");
            flag = false;
        }
    }


    public static void main(String[] args) {
        worker worker = new worker();
        worker.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        worker.shutDown();
    }
}
