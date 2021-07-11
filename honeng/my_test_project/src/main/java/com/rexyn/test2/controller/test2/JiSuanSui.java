package com.rexyn.test2.controller.test2;

/**
 * @author sheldon
 * 描述：
 * @date 2021/7/8 17:56
 */
public class JiSuanSui {
    public static void main(String[] args) {
        // JiSuanQi jsq= new JiSuanQi(10000,3000){
        //     @Override
        //     public double calcuate(){
        //        return getGongzi()*0.1 +getJiangjin()*0.15;
        //     }
        // };
        // double result = jsq.calcuate();
        // System.out.println(result);
        JiSuanQi jsq= new JiSuanQi(10000,3000);
        JiSuanFangFa sf = new JiSuanFangFaImpl();
        jsq.setJiSuanFangFa(sf);
        double result = jsq.getResult();
        System.out.println(result);
    }
}
