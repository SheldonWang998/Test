package com.rexyn.weifuwu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 创建时间：2020/12/29 14:04
 * 创建人：sheldon
 * 描述：
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaService7002 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaService7002.class,args);
    }
}
