package com.rexyn.threadPool;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author sheldon
 * 描述：自定义线程池  第一版
 * @date 2021/7/13 19:28
 */
public class MyThreadPool {
    /**
     * 定义线程池的大小
     */
    private final int size;
    /**
     * 线程池默认大小为 10
     */
    private final static int DEFAULT_SIZE = 10;
    /**
     *
     */
    private static final List<WorkTask> THREAD_QUEUE = new ArrayList<>();
    /**
     * 任务队列
     */
    private static final LinkedList<Runnable> TASK_QUEUE = new LinkedList<>();

    /**
     * 线程前缀
     */
    private static final String THREAD_PREFIX = "MY_THREAD_POOL_";
    private static final ThreadGroup group = new ThreadGroup("POOL_GROUP");
    /**
     * 记录线程的个数
     */
    private static volatile int seq = 0;

    public MyThreadPool() {
        this(DEFAULT_SIZE);
    }

    /**
     * 构造线程池的时候，传入大小，如果没有，则默认为10
     *
     * @param size
     */
    public MyThreadPool(int size) {
        this.size = size;
        //线程池初始化
        init();
    }

    public void init() {
        for (int i = 0; i < size; i++) {
            creatWorkTask();
        }
    }

    public void creatWorkTask() {
        WorkTask workTask = new WorkTask(group, THREAD_PREFIX + (seq++));
        workTask.setter(TASK_QUEUE);
        workTask.start();
        THREAD_QUEUE.add(workTask);
    }
    /**
     * 提交任务到队列
     */
    public void submit(Runnable runnable) {
        synchronized (TASK_QUEUE){
            TASK_QUEUE.addLast(runnable);
            TASK_QUEUE.notifyAll();
        }
    }
}
