package com.rexyn.service.impl;

import com.rexyn.entity.User;
import com.rexyn.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * @author sheldon
 * 描述：
 * @date 2021/4/19 10:38
 */
@Component
public class ScheduledTask {
    @Autowired
    UserService userService;
    Logger log = LoggerFactory.getLogger(this.getClass());

    @Scheduled(cron = "${scheduled.time}")
    public void cron(){
        try {
            List<User> users = userService.queryAllByLimit(1, 10);
            for (User user : users) {
                System.out.println(user);
            }
            System.out.println("cron 打印时间：" + new Date());
        } catch (Exception e) {
            log.error("定时任务出错",e);
        }
    }
    // @XxlJob("scheduledTaskHandler")
    // public String scheduledTaskHandler(String param){
    //     log.info("start");
    //     cron();
    //     log.info("end");
    //     return "执行成功";
    // }
}
