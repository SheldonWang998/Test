package com.rexyn.weifuwu.controller;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 创建时间：2021/1/4 14:18
 * 创建人：sheldon
 * 描述：
 */
public class Test {
    private static AtomicInteger atomicInteger = new AtomicInteger(0);
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        int year = atomicInteger.get();
        int moth= year > 2100000000 ? 0 : year + 1;
        boolean b = atomicInteger.compareAndSet(year,moth);
        System.out.println(b);
//        服务降级
//        服务熔断
    }
}
