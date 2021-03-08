package com.rexyn.pay.service;

import com.rexyn.pay.IPay;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author sheldon
 * 描述：
 * @date 2021/4/20 9:52
 */
@Service
public class PayService4 implements ApplicationContextAware, InitializingBean {
    private ApplicationContext applicationContext;
    private List<IPay> pays = null;

    @Override
    public void afterPropertiesSet() throws Exception {
        if (pays == null) {
            pays = new ArrayList<>();
            Map<String, IPay> beansOfType = applicationContext.getBeansOfType(IPay.class);
            beansOfType.forEach((key, value) -> {
                pays.add(value);
            });
        }
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
    public String toPay(String code){
        for(IPay pay : pays){
            if(pay.support(code)){
               return pay.pay();
            }
        }
        return "没有找到支付方式";
    }
}
