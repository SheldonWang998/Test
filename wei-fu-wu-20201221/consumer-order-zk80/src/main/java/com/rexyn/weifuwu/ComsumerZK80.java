package com.rexyn.weifuwu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 创建时间：2020/12/31 10:49
 * 创建人：sheldon
 * 描述：
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ComsumerZK80 {
    public static void main(String[] args) {
        SpringApplication.run(ComsumerZK80.class,args);
    }
}
