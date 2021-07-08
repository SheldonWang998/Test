package com.sheldon.activiti;

/**
 * @author sheldon
 * 描述：
 * @date 2021/6/26 10:57
 */
public class AbserctImpl extends Abserct{

    @Override
    public String fly() {
        System.out.println(this.getAge());
        return "飞翔成功";
    }
    @Override
    public int getAge(){
        System.out.println("我重新修改了获取年龄的方法");
        System.out.println(super.getAge()%10);
        return 1;
    }
}
