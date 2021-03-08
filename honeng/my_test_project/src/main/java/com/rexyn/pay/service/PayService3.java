package com.rexyn.pay.service;

import com.rexyn.pay.IPay;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

/**
 * @author sheldon
 * 描述：
 * @date 2021/4/20 9:31
 */
@Service
public class PayService3 implements ApplicationContextAware {
    private ApplicationContext applicationContext;
    private static  final String SUFFIX = "Pay";

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    /**根据code获取bean的名称
     *
     * @param code
     * @return
     */
    public String getBeanName(String code){
        return code + SUFFIX;
    }
    public String toPay(String code){
        String beanName = getBeanName(code);
        IPay pay;
        try {
            pay= (IPay) applicationContext.getBean(beanName);
        }catch (Exception e){
            return "没有找到支付方式";
        }
        return pay.pay();
    }
}
