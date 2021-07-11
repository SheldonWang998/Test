package com.rexyn.test2.controller.test6;

/**
 * @author sheldon
 * 描述：
 * @date 2021/7/10 5:28
 */
public class OtherService {
    private final Object lock = new Object();
    private DeadLock deadLock;

    public void setDeadLock(DeadLock deadLock) {
        this.deadLock = deadLock;
    }

    public void s1(){
        synchronized (lock){

            System.out.println("我是s1方法");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void s2(){
        synchronized (lock){
            System.out.println("我是s2方法");
            deadLock.d2();
        }
    }
}
