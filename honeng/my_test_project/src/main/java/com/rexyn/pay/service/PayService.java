package com.rexyn.pay.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author sheldon
 * 描述：外部调用的支付接口
 * @date 2021/4/20 8:26
 */
@Service
public class PayService {
    @Autowired
    private AliaPay aliaPay;
    @Autowired
    private WeiXinPay weiXinPay;
    @Autowired
    private JingDongPay jingDongPay;
    public String toPay(String code){
        String payResult;
        if("alia".equals(code)){
            payResult = aliaPay.pay();
        }else if("weixin".equals(code)){
            payResult = weiXinPay.pay();
        }else if("jingdong".equals(code)){
            payResult = jingDongPay.pay();
        }else {
            payResult = "没有找到支付方式";
        }
        return payResult;
    }
}
