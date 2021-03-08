package com.rexyn.pay.service;

import com.rexyn.pay.IPay;
import com.rexyn.pay.PayCode;
import org.springframework.stereotype.Service;

/**
 * @author sheldon
 * 描述：
 * @date 2021/4/20 8:23
 */
@Service
@PayCode(value = "${pay.weixin.value}",name="${pay.weixin.name}")
public class WeiXinPay implements IPay {
    @Override
    public Boolean support(String code) {
        return "weixin".equals(code);
    }
    @Override
    public String pay() {
        System.out.println("===发起微信支付====");
        return "微信支付成功";
    }
}
