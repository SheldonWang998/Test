package com.rexyn.test.singleton;

/**
 * @ClassName: Test01
 * @Author: sheldon
 * @Date: 2020/11/30
 * @Description:
 */
public enum  Test01 {
    SINGLETON;
    private void say(){
        System.out.println("hello, singleton of enum");
    }
}
