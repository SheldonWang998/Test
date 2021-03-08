package com.rexyn.test.controller;

import com.rexyn.test.entity.User;
import com.rexyn.test.service.UserService;

/**
 * 用户信息表(User)表控制层
 *
 * @author makejava
 * @since 2021-01-15 10:46:07
 */
//@RestController
//@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
//    @Resource
    private UserService userService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
//    @GetMapping("selectOne")
    public User selectOne(Integer id) {
        return this.userService.queryById(id);
    }

}