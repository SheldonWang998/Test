package com.rexyn.test2.controller.test9;

import java.util.LinkedList;

/**
 * @author sheldon
 * 描述：线程任务
 * @date 2021/7/13 21:29
 */
public class ThreadTask extends Thread{
    /**
     * 默认线程是空闲状态
     */
    private volatile ThreadState state = ThreadState.FREE;
    /**
     * 任务队列
     */
    private LinkedList<Runnable> TASK_QUEUE ;
    public void setter(LinkedList<Runnable> TASK_QUEUE){
        this.TASK_QUEUE = TASK_QUEUE;
    }
    @Override
    public void run() {
        OUTER:
        while (this.state != ThreadState.DEAD) {
            Runnable runnable;
            synchronized (TASK_QUEUE) {
                while (TASK_QUEUE.isEmpty()) {
                    try {
                        state = ThreadState.BLOCKED;
                        TASK_QUEUE.wait();
                    } catch (InterruptedException e) {
                        break OUTER;
                    }
                }
                runnable = TASK_QUEUE.removeFirst();
            }
            if (runnable != null) {
                state = ThreadState.RUNNING;
                runnable.run();
                state = ThreadState.FREE;
            }
        }
    }
}
