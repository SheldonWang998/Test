package com.rexyn.test2.controller.singleton;

/**
 * @author sheldon
 * 描述：
 * @date 2021/7/15 19:38
 */
public class SingletonObjectFive {
    private SingletonObjectFive(){

    }
    private static class SingletonObject{
        private static final SingletonObjectFive instance = new SingletonObjectFive();
    }
    public static SingletonObjectFive getInstance(){
        return SingletonObject.instance;
    }
}
