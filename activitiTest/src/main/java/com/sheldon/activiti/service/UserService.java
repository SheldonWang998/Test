package com.sheldon.activiti.service;

import org.springframework.stereotype.Service;

/**
 * @author sheldon
 * 描述：
 * @date 2021/6/29 21:07
 */
@Service
public class UserService {
    public void insertUser() {
        System.out.println("插入用户成功");
    }

    public boolean updateUser() {
        System.out.println("更新用户成功");
        return true;
    }
}
