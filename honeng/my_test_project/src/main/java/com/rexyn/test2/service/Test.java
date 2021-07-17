package com.rexyn.test2.service;

/**
 * @author sheldon
 * 描述：
 * @date 2021/5/6 13:59
 */
public class Test {
    public static void main(String[] args) {
        Runtime.getRuntime().addShutdownHook(new Thread(
                ()->{
                    System.out.println("程序将要退出");
                    //执行保存方法
                }
        ));
    }
}
