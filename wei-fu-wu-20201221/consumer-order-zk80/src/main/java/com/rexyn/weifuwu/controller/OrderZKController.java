package com.rexyn.weifuwu.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * 创建时间：2020/12/31 10:54
 * 创建人：sheldon
 * 描述：
 */
@RestController
@Slf4j
public class OrderZKController {
    public static final String PAYMENT_URL="http://payment-service-8003";
    @Resource
    private RestTemplate restTemplate;
    @GetMapping("/consumer/payment/zk")
    public String paymentInfo(){
        log.info("form consumer-zk 80");
        return  restTemplate.getForObject(PAYMENT_URL+"/payment/zk",String.class);
    }
}
