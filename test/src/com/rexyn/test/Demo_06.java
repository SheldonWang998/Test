package com.rexyn.test;

import com.rexyn.test.model.Product;
import com.rexyn.test.model.Test_06;
import com.rexyn.test.model.User;

import static java.util.stream.IntStream.range;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @ClassName: Demo_06
 * @Author: sheldon
 * @Date: 2020/12/8
 * @Description:
 */
public class Demo_06 {
    public static void main(String[] args) {
//        List<Integer> list = range(1,100).boxed().collect(Collectors.toList());
//        Set<Integer> set = new HashSet<>(list);
//        Iterator<Integer> iterator = set.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
        List<Object> list = new ArrayList<>();
        User user = new User();
        user.setUsername("sheldon");
        user.setPassword("135246");
        user.setUserId(9090);
        Product product = new Product(1,0,"测试产品",new ArrayList<Product>());
        list.add(user);
        list.add(product);
        String value = Test_06.getValue(list);
        System.out.println(value);
    }
}
