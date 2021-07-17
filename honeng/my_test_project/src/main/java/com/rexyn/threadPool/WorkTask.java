package com.rexyn.threadPool;

import java.util.LinkedList;

/**
 * @author sheldon
 * 描述： 工作任务
 * @date 2021/7/13 19:36
 */
public class WorkTask extends Thread {
    /**
     * 默认状态为空闲状态
     */
    private volatile TaskState taskState = TaskState.FREE;
    /**
     * 任务队列
     */
    private   LinkedList<Runnable> TASK_QUEUE ;
    public void setter(LinkedList<Runnable> TASK_QUEUE){
        this.TASK_QUEUE = TASK_QUEUE;
    }

    public WorkTask(ThreadGroup group, String name) {
        super(group, name);
    }

    public TaskState getTaskState() {
        return this.taskState;
    }

    @Override
    public void run() {
        OUTER:
        while (this.taskState != TaskState.DEAD) {
            Runnable runnable;
            synchronized (TASK_QUEUE) {
                while (TASK_QUEUE.isEmpty()) {
                    try {
                        taskState = TaskState.BLOCKED;
                        TASK_QUEUE.wait();
                    } catch (InterruptedException e) {
                        break OUTER;
                    }
                }
                runnable = TASK_QUEUE.removeFirst();
            }
            if (runnable != null) {
                taskState = TaskState.RUNNING;
                runnable.run();
                taskState = TaskState.FREE;
            }
        }
    }

    public void close() {
        this.taskState = TaskState.DEAD;
    }


}
