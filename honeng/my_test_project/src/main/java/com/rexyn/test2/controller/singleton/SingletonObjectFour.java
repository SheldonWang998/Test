package com.rexyn.test2.controller.singleton;

/**
 * @author sheldon
 * 描述：
 * @date 2021/7/15 19:35
 */
public class SingletonObjectFour {
    private static SingletonObjectFour singletonObjectFour;
    private SingletonObjectFour(){}
    public static SingletonObjectFour getInstance(){
        if(null == singletonObjectFour){
            synchronized (SingletonObjectFour.class){
                if(null == singletonObjectFour){
                    singletonObjectFour = new SingletonObjectFour();
                }
            }
        }
        return SingletonObjectFour.singletonObjectFour;
    }
}
