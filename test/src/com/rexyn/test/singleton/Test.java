package com.rexyn.test.singleton;

/**
 * @ClassName: Test
 * @Author: sheldon
 * @Date: 2020/11/30
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(
                    new Runnable() {
                        @Override
                        public void run() {
                            Test01 test01 = Test01.SINGLETON;
                            Test02 test02 = Test02.getInstance();
                            System.out.println("获取单例test01的hashcode" + test01.hashCode());
//                            System.out.println("获取单例test02的hashcode" + test02.hashCode());
                        }
                    },"测试线程" + i
            );
            thread.start();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(thread.getName());
        }
    }
}
