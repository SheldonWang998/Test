package com.rexyn.test.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @ClassName: Test_06
 * @Author: sheldon
 * @Date: 2020/12/8
 * @Description:
 */
public class Test_06 {
    public static <E> String getValue(List<E> list){
        for (E e : list) {
            if(e instanceof User){
                System.out.println("我是user对象");
                System.out.println(e);
            }else {
                System.out.println("我不是user对象");
                System.out.println(e);
            }
        }
        StringBuilder value = new StringBuilder();
        Set<E> set = new HashSet<>(list);
        for (E e : set) {
            if(e instanceof User){
                value.append(((User) e).getUsername());
                System.out.println(e);
            }
            if(e instanceof Product){
                value.append(((Product) e).getpName());
                System.out.println(e);
            }
        }
            return value.toString();
    }
}
