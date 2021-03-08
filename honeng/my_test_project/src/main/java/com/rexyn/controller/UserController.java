package com.rexyn.controller;

import com.rexyn.entity.User;
import com.rexyn.service.Test2;
import com.rexyn.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户信息表(User)表控制层
 *
 * @author makejava
 * @since 2021-01-19 13:37:39
 */
@RestController
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;
    @Resource
    private Test2 test2;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public User selectOne(Integer id) {
        return this.userService.queryById(id);
    }

    /**
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("testLog")
    public User testLog(Integer id) {
        return this.test2.testLog(id);
    }


    @GetMapping("testOne")
    public List<User> testOne() {
        List<User> testxml = this.userService.testxml();
        System.out.println(testxml);
        return testxml;
    }
}