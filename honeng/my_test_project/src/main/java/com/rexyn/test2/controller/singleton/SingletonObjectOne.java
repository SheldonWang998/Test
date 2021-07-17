package com.rexyn.test2.controller.singleton;

/**
 * @author sheldon
 * 描述：单例模式的第一种方法
 * @date 2021/7/15 19:25
 */
public class SingletonObjectOne {
    private static final SingletonObjectOne instance = new SingletonObjectOne();
    private SingletonObjectOne(){
    }

   public static SingletonObjectOne getInstance(){
      return SingletonObjectOne.instance;
   }
   public void whatever(){
       System.out.println("测试单例模式");
   }
}
