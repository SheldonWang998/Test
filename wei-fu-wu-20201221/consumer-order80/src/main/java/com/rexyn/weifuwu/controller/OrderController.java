package com.rexyn.weifuwu.controller;

import com.rexyn.weifuwu.entity.CommonResult;
import com.rexyn.weifuwu.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@Slf4j
@RequestMapping("/consumer")
public class OrderController {
//    public static final String PAYMENT_URL="http://localhost:8001";
    public static final String PAYMENT_URL="http://PAYMENT-SERVICE";
    @Resource
    private RestTemplate restTemplate;
    @GetMapping("/payment/create")
    public CommonResult<Payment> create(Payment payment){
        log.info("消费端进来的请求");
        return restTemplate.postForObject(PAYMENT_URL+"/payment/create",payment,CommonResult.class);
    }
    @GetMapping("/payment/getById")
    public CommonResult<Payment> getById(Long id){
        log.info("消费端进来的请求");
        return restTemplate.getForObject(PAYMENT_URL+"/payment/getById?id=" + id,CommonResult.class);
    }
    @GetMapping("/payment/list")
    public CommonResult<Payment> list(){
        log.info("消费端进来的请求");
        return restTemplate.getForObject(PAYMENT_URL+"/payment/list",CommonResult.class);
    }
}
