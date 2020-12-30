package com.rexyn.test.service;

import com.rexyn.test.model.User;

/**
 * @ClassName: TestService
 * @Author: sheldon
 * @Date: 2020/12/11
 * @Description: 练习lambda
 */
@FunctionalInterface
public interface TestService {
    String test(User user);
}
