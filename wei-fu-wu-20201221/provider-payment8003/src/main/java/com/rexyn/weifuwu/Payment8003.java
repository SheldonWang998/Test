package com.rexyn.weifuwu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 创建时间：2020/12/31 10:07
 * 创建人：sheldon
 * 描述：
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Payment8003 {
    public static void main(String[] args) {
        SpringApplication.run(Payment8003.class,args);
    }

}
