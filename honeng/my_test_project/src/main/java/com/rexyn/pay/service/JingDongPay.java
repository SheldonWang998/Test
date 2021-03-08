package com.rexyn.pay.service;

import com.rexyn.pay.IPay;
import com.rexyn.pay.PayCode;
import org.springframework.stereotype.Service;

/**
 * @author sheldon
 * 描述：
 * @date 2021/4/20 8:25
 */
@Service
@PayCode(value = "${pay.jingdong.value}",name="${pay.jingdong.name}")
public class JingDongPay implements IPay {
    @Override
    public Boolean support(String code) {
        return "jingdong".equals(code);
    }
    @Override
    public String pay() {
        System.out.println("===发起京东支付====");
        return "京东支付成功";
    }
}
