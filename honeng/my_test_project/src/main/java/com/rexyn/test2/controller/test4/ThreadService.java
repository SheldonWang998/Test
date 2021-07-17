package com.rexyn.test2.controller.test4;

/**
 * @author sheldon
 * 描述：
 * @date 2021/7/9 19:53
 */
public class ThreadService {
    private Thread zxThread;
    private Boolean js = false;

    public void execute(Runnable runnable) {
        zxThread = new Thread() {
            @Override
            public void run() {
                Thread t = new Thread(runnable);
                t.setDaemon(true);
                t.start();
                try {
                    t.join();
                    js = true;
                    System.out.println("我是正常结束");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        zxThread.setName("我是执行线程");
        zxThread.start();
    }

    public void shutDown(Long time) {
        long currentTimeMillis = System.currentTimeMillis();
        //结束标志一直没有结束，才主动去关闭线程
        while (!js) {
            //没有超时，一直等待，直到超时才结束
            if ((System.currentTimeMillis() - currentTimeMillis) > time) {
                System.out.println("已经超时了，主动结束");
                zxThread.interrupt();
                System.out.println("执行线程被打断");
                break;
            }
            try {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }

    }
}
