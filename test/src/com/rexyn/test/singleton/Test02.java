package com.rexyn.test.singleton;

/**
 * @ClassName: Test02
 * @Author: sheldon
 * @Date: 2020/11/30
 * @Description:
 */
public class Test02 {
    private static Test02 test02 = new Test02();
    private Test02(){}
    public static Test02 getInstance(){
        return test02;
    }
    private void say(){
        System.out.println("hello, singleton of class");
    }
}
