package com.rexyn.pay.service;

import com.rexyn.pay.IPay;
import com.rexyn.pay.PayCode;
import org.springframework.stereotype.Service;

/**
 * @author sheldon
 * 描述：
 * @date 2021/4/20 8:21
 */
@Service
@PayCode(value = "${pay.alibaba.value}",name="${pay.alibaba.name}")
public class AliaPay implements IPay {
    @Override
    public Boolean support(String code) {
        return "alia".equals(code);
    }

    @Override
    public String pay() {
        System.out.println("===发起支付宝支付====");
        return "支付宝支付成功";
    }
}
