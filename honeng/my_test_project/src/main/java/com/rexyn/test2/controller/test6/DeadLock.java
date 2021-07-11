package com.rexyn.test2.controller.test6;

/**
 * @author sheldon
 * 描述：死锁测试
 * @date 2021/7/10 5:27
 */
public class DeadLock {
    private final Object lock = new Object();
    private OtherService otherService;
    public DeadLock(OtherService otherService){
        this.otherService = otherService;
    }
    public void d1(){
        synchronized (lock){
            System.out.println("我是d1方法");
            String name = Thread.currentThread().getName();
            System.out.println(name);
            otherService.s1();
        }
    }
    public void d2(){
        synchronized (lock){
            System.out.println("我是d2方法");
            String name = Thread.currentThread().getName();
            System.out.println(name);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
