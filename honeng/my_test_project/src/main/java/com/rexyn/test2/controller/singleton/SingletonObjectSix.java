package com.rexyn.test2.controller.singleton;

/**
 * @author sheldon
 * 描述：
 * @date 2021/7/15 19:43
 */
public class SingletonObjectSix {
    private SingletonObjectSix(){}
    private enum SingletonObject{
        /**
         *
         */
        SINGLETON;
        /**
         *
         */
        private final SingletonObjectSix singletonObjectSix;
        SingletonObject(){
            singletonObjectSix = new SingletonObjectSix();
        }
    }
    public static SingletonObjectSix getInstance(){
        return SingletonObject.SINGLETON.singletonObjectSix;
    }
}
