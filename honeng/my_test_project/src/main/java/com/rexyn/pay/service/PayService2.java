package com.rexyn.pay.service;

import com.rexyn.pay.IPay;
import com.rexyn.pay.PayCode;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sheldon
 * 描述：
 * @date 2021/4/20 8:40
 */
@Service
public class PayService2 implements ApplicationListener<ContextRefreshedEvent> {
    private Map<String, IPay> payMap = null;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        ApplicationContext applicationContext = contextRefreshedEvent.getApplicationContext();
      //根据注解，获取所有添加了@PayCode的bean
        Map<String, Object> beansWithAnnotation = applicationContext.getBeansWithAnnotation(PayCode.class);

        if (beansWithAnnotation != null) {
            payMap = new HashMap<>(8);
            //循环遍历添加了@PayCode的对象，将其添加到payMap中
            beansWithAnnotation.forEach((key, value) -> {
                String bizType = value.getClass().getAnnotation(PayCode.class).value();
                payMap.put(bizType, (IPay) value);
            });
        }
    }

    public String toPay(String code) {
        IPay iPay = payMap.get(code);
        if(iPay == null){
            return "没有找到支付方式";
        }
        return iPay.pay();
    }
}
