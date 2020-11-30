package com.rexyn.test.singleton;

/**
 * @ClassName: Test03
 * @Author: sheldon
 * @Date: 2020/11/30
 * @Description:
 */
public class Test03 {
    private static volatile Test03 test03;
    private Test03(){

    }
    public static Test03 getInstance(){
        if(null ==test03){
            synchronized (Test03.class){
                if(null == test03){
                    test03 = new Test03();
                }
            }
        }
        return test03;
    }
    public void say(){
        System.out.println("hello, singleton of class_two");
    }
}
