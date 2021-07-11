package com.rexyn.test2.controller.test4;

/**
 * @author sheldon
 * 描述：关闭线程的第二种方法
 * @date 2021/7/9 19:14
 */
public class Test2 {
    private static class worker extends Thread{
        @Override
        public void run() {
            while (true){
                //模拟线程执行任务
                try {
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    break;
                }
            }
            System.out.println("worker线程捕捉到打断信号，已经跳出循环");
        }
    }
    public static void main(String[] args) {
        worker worker = new worker();
        worker.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //打断worker线程
        worker.interrupt();
        System.out.println("main线程发送打断信号完成");
    }
}
