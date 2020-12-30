package com.rexyn.weifuwu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 创建时间：2020/12/29 12:40
 * 创建人：sheldon
 * 描述：
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaService7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaService7001.class,args);
    }
}
