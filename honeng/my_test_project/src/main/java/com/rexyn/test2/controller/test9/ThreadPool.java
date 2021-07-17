package com.rexyn.test2.controller.test9;

import java.util.LinkedList;

/**
 * @author sheldon
 * 描述：自定义线程池
 * @date 2021/7/13 21:29
 */
public class ThreadPool {
    /**
     * 定义线程池大小
     */
    private final int size;
    private static final int DEFAULT_SIZE = 10;

    public ThreadPool() {
        this(DEFAULT_SIZE);
    }

    public ThreadPool(int size) {
        this.size = size;
        init();
    }

    /**
     * 定义线程队列
     */
    private static final LinkedList<Thread> thread_queue = new LinkedList<>();
    /**
     * 定义任务队列
     */
    private static final LinkedList<Runnable> task_queue = new LinkedList<>();

    /**
     * 初始化线程池
     */
    private void init() {
        //根据线程池的大小，创建线程
        for (int i = 0; i < size; i++) {
            createTask();
        }
    }

    private void createTask() {
        //创建线程，并且把线程放入到队列
        ThreadTask wt = new ThreadTask();
        wt.setter(task_queue);
        wt.start();
        thread_queue.addLast(wt);

    }

    public void submit(Runnable runnable) {
        synchronized (task_queue) {
            task_queue.addLast(runnable);
            task_queue.notifyAll();
        }
    }
}
