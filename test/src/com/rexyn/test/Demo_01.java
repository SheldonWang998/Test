package com.rexyn.test;

/**
 * @ClassName: Demo_01
 * @Author: sheldon
 * @Date: 2020/11/30
 * @Description:
 */
public class Demo_01 {
    public static void main(String[] args) {
        String[] strings = new String[8];
        System.out.println(strings.length);
        String s = "qweqwqwqgetwasdgwasge";
        strings = s.split("w");

        System.out.println(strings.length);
        System.out.println("hello world!!");
    }
}
