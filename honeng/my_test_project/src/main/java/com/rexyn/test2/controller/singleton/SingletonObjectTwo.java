package com.rexyn.test2.controller.singleton;

/**
 * @author sheldon
 * 描述：
 * @date 2021/7/15 19:29
 */
public class SingletonObjectTwo {
    private static SingletonObjectTwo singletonObjectTwo;
    private SingletonObjectTwo(){

    }
    public static SingletonObjectTwo getInstance(){
        if(null==singletonObjectTwo){
            singletonObjectTwo = new SingletonObjectTwo();
        }
        return SingletonObjectTwo.singletonObjectTwo;
    }
}
