package com.rexyn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 创建时间：2021/1/19 13:54
 * 创建人：sheldon
 * 描述：
 * @author sheldon
 */
@SpringBootApplication
@MapperScan("com.rexyn.dao")
@EnableScheduling
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
