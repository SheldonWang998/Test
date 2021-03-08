package com.rexyn.service.impl;

import com.rexyn.entity.User;
import com.rexyn.service.Test2;
import com.rexyn.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author sheldon
 * 描述：测试日志输出
 * @date 2021/3/4 14:29
 */
@Service
public class Test2Impl implements Test2 {

    private static Logger log = LoggerFactory.getLogger(Test2Impl.class);

    @Resource
    private UserService userService;

    @Override
    public User testLog(Integer id) {
        log.info("info 日志打印：:[{}]",id);
        User user = userService.queryById(id);
        log.info("是否开启了debug：[{}]",log.isDebugEnabled());
        if(log.isDebugEnabled()){
            log.debug("debug 日志打印:[{}],[{}]",id,user);
        }
        return user;
    }
}
