package com.rexyn.test2.controller.test2;

/**
 * @author sheldon
 * 描述：
 * @date 2021/7/8 17:54
 */
public class JiSuanQi {
    private final double gongzi;
    private final double jiangjin;
    private JiSuanFangFa jiSuanFangFa;

    public void setJiSuanFangFa(JiSuanFangFa jiSuanFangFa) {
        this.jiSuanFangFa = jiSuanFangFa;
    }

    public double getGongzi() {
        return gongzi;
    }

    public double getJiangjin() {
        return jiangjin;
    }

    public JiSuanQi(double gongzi, double jiangjin) {
        this.gongzi = gongzi;
        this.jiangjin = jiangjin;
    }
    protected double getResult(){
        return jiSuanFangFa.calcuate(gongzi,jiangjin);
    }
    public double calcuate(){
        return this.getResult();
    }
}
