package com.rexyn.controller;

import com.rexyn.pay.service.PayService;
import com.rexyn.pay.service.PayService2;
import com.rexyn.pay.service.PayService3;
import com.rexyn.pay.service.PayService4;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author sheldon
 * 描述：
 * @date 2021/4/20 8:56
 */
@RestController
@RequestMapping("pay")
public class PayController {
    @Resource
    private PayService payService;
    @Resource
    private PayService2 payService2;
    @Resource
    private PayService3 payService3;
    @Resource
    private PayService4 payService4;

    @GetMapping("payOne")
    public String payOne(String code) {
        return this.payService.toPay(code);
    }

    @GetMapping("payTwo")
    public String payTwo(String code) {
        return this.payService2.toPay(code);
    }

    @GetMapping("payThree")
    public String payThree(String code) {
        return this.payService3.toPay(code);
    }

    @GetMapping("payFour")
    public String payFour(String code) {
        return this.payService4.toPay(code);
    }
}
