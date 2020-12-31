package com.rexyn.weifuwu.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * 创建时间：2020/12/31 10:10
 * 创建人：sheldon
 * 描述：
 */
@RestController
@Slf4j
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/payment/zk")
    public String paymentForZK() {
        return "spring cloud with zookeeper" + serverPort + "\t" + UUID.randomUUID().toString();
    }

}
