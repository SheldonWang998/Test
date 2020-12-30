package com.rexyn.weifuwu.controller;

import com.rexyn.weifuwu.entity.CommonResult;
import com.rexyn.weifuwu.entity.Payment;
import com.rexyn.weifuwu.service.IPaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
public class PaymentController {
    @Resource
    private IPaymentService paymentService;
    @Value("${server.port}")
    private String port;
    @Resource
    private DiscoveryClient discoveryClient;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        Long result = paymentService.create(payment);
        log.info("the result is:" + result);
        if(result > 0){
            return new CommonResult(200,"执行成功",result);
        }else {
            return new CommonResult(444,"执行失败",null);
        }
    }

    @GetMapping("/payment/getById")
    public CommonResult getById(Long id){
        String s = paymentService.getById(id);
        log.info("the result is:" + s);
        return new CommonResult(200,"执行成功",s);
    }
    @GetMapping("/payment/list")
    public CommonResult list(){
        List<Payment> payments = paymentService.list();
        log.info("the result is:" + payments);
        log.info("the port is:" + port);
        return new CommonResult(200,"执行成功,port:" + port,payments);
    }
    @GetMapping("/payment/discovery")
    public void discovery(){
        List<String> services = discoveryClient.getServices();
        for (String element : services) {
            log.info("the element is:" +element);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("PAYMENT-SERVICE");
        for (ServiceInstance instance : instances) {
            log.info("the instances is:" + instance);
        }
    }
}
