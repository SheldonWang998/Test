package com.rexyn.test2.controller.守护线程;

/**
 * @author sheldon
 * 描述：
 * @date 2021/7/16 19:52
 */
public class ThreadService {
    private Thread zxThread;
    //结束标志
    private boolean flag = false;

    public void submit(Runnable runnable) {
        zxThread = new Thread("执行线程") {
            @Override
            public void run() {
                Thread t2 = new Thread(runnable, "我是守护线程");
                t2.setDaemon(true);
                t2.start();
                try {
                    t2.join();
                    flag = true;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };
        zxThread.start();
    }

    public void shutdown(Long times) {
        long currentTimeMillis = System.currentTimeMillis();
        //任务执行没有结束，关闭任务
        while (!flag) {
            //判断是否超时，如果没有超时，线程休眠等待，如果超时，马上打断执行线程
            if(System.currentTimeMillis()-currentTimeMillis > times){
                zxThread.interrupt();
                break;
            }else {
                try {
                    Thread.sleep(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    break;
                }
            }

        }
    }
}
