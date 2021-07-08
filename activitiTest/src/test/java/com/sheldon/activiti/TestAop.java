package com.sheldon.activiti;

import com.sheldon.activiti.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author sheldon
 * 描述：
 * @date 2021/6/29 21:10
 */
public class TestAop {
    private ClassPathXmlApplicationContext ac;

    @Before
    public void before() {
        ac = new ClassPathXmlApplicationContext("*/applicationContext.xml");
    }
    @Test
    public void test() {
        try {
            UserService userService = (UserService) ac.getBean("userService");
            userService.insertUser();
            userService.updateUser();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
