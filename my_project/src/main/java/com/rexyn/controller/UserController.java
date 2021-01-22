package com.rexyn.controller;

import com.rexyn.entity.User;
import com.rexyn.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 用户信息表(User)表控制层
 *
 * @author makejava
 * @since 2021-01-19 14:39:51
 */
@RestController
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/selectOne")
    public User selectOne(Integer id) {
        return this.userService.queryById(id);
    }

    /**
     * 添加实例对象
     * @param user 实例对象
     * @return 是否添加成功
     */
    @PostMapping("/insert")
    public String insert(@RequestBody User user) {
        User insert = this.userService.insert(user);
        Integer id = insert.getId();
        if (id > 0) {
            return "成功";
        } else {
            return "失败";
        }
    }
    /**
     * 测试mysql存储过程
     * @param a 参数
     * @param b 参数
     * @return 测试结果
     */
    @GetMapping("/testOne")
    public int testOne(Integer a, Integer b) {
        return this.userService.testOne(a, b);
    }

}