package com.rexyn.test2.controller.test2;

/**
 * @author sheldon
 * 描述：
 * @date 2021/7/8 18:10
 */
public class JiSuanFangFaImpl implements JiSuanFangFa{
    @Override
    public double calcuate(double gongzi, double jiangjin) {
        return gongzi*0.1 +jiangjin*0.15;
    }
}
