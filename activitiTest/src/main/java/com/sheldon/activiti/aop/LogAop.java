package com.sheldon.activiti.aop;

/**
 * @author sheldon
 * 描述：
 * @date 2021/6/29 21:08
 */
public class LogAop {
    public void beforeAdvice() {
        System.out.println("beforeAdvice");
    }

    public void afterAdvice() {
        System.out.println("afterAdvice");
    }
}
