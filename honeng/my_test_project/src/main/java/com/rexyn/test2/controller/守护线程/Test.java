package com.rexyn.test2.controller.守护线程;

/**
 * @author sheldon
 * 描述： 用守护线程完成一个任务
 * @date 2021/7/16 19:51
 */
public class Test {
    public static void main(String[] args) {
        ThreadService service = new ThreadService();
                service.submit(()->{
                    //模拟执行任务
                    while (true){
                        System.out.println("Thread name is:" + Thread.currentThread().getName());
                    }
                });

        //3秒之后关闭任务
        service.shutdown(3000L);
    }
}
