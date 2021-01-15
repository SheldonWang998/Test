package com.rexyn.test;

import com.rexyn.test.model.Product;
import com.rexyn.test.model.Test_06;
import com.rexyn.test.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * @ClassName: Demo_06
 * @Author: sheldon
 * @Date: 2020/12/8
 * @Description:
 */
public class Demo_06 {
    private static Logger logger = Logger.getGlobal();
    public static void main(String[] args) {
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
        String s= "sheldon";
        if(s.equals(user.getUsername())){
            System.out.println(s);
        }
        logger.info(value);

    }
}
