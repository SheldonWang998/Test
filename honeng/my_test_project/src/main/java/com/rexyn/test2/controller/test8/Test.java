package com.rexyn.test2.controller.test8;

/**
 * @author sheldon
 * 描述：设置线程组
 * @date 2021/7/12 20:50
 */
public class Test {
    public static void main(String[] args) {
        ThreadGroup tg1 = new ThreadGroup("TG1");
        Thread t1= new Thread(tg1,()->{

               System.out.println(Thread.currentThread().getThreadGroup().getName());
               System.out.println(Thread.currentThread().getThreadGroup().getParent());
               try {
                   Thread.sleep(1000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }

        });
        t1.start();
        ThreadGroup tg2 = new ThreadGroup("TG2");
       Thread t2= new Thread(tg2,"t2"){
            @Override
            public void run() {
                ThreadGroup threadGroup = t1.getThreadGroup();
                System.out.println(threadGroup.getName());
            }
        };
       t2.start();
    }
}
