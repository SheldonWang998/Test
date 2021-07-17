package com.rexyn.test2.controller.singleton;

/**
 * @author sheldon
 * 描述：
 * @date 2021/7/15 19:32
 */
public class SingletonObjectThree {
    private static SingletonObjectThree singletonObjectThree;
    private SingletonObjectThree(){}
    public static synchronized SingletonObjectThree getInstance(){
        if(null == singletonObjectThree){
            singletonObjectThree =new SingletonObjectThree();
        }
        return SingletonObjectThree.singletonObjectThree;
    }
}
