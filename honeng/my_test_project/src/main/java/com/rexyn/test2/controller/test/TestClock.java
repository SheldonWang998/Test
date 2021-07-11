package com.rexyn.test2.controller.test;

import java.util.stream.Stream;

/**
 * @author sheldon
 * 描述：
 * @date 2021/7/11 16:14
 */
public class TestClock {
    static final BooleanLock booleanLock = new BooleanLock();
    public static void main(String[] args) {
        Stream.of("t1","t2","t3","t4").forEach(n->
                new Thread(n){
                    @Override
                    public void run() {
                        try {
                            booleanLock.lock(100);
                            System.out.println(Thread.currentThread().getName() + "锁");
                            work();
                        } catch (Exception e) {
                            e.printStackTrace();
                        } finally {
                             booleanLock.unlock();
                        }
                    }
                }.start());
    }

    /**
     * 线程的工作
     */
    public static void work(){
        System.out.println(Thread.currentThread().getName() + "获取到锁，开始工作");
        try {
            Thread.sleep(90);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
