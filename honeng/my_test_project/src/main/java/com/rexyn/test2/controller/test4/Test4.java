package com.rexyn.test2.controller.test4;

/**
 * @author sheldon
 * 描述：利用守护线程的特性结束线程
 * @date 2021/7/9 19:52
 */
public class Test4 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        ThreadService ts = new ThreadService();
        ts.execute(()->{
            // while (true){
            //     System.out.println("我是一个死循环");
            // }
            System.out.println("我是一个");
        });
        ts.shutDown(3000L);
        System.out.println("关闭线程结束");
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
