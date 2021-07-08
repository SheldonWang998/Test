package com.sheldon.activiti;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RepositoryService;

import static org.activiti.engine.ProcessEngineConfiguration.createProcessEngineConfigurationFromResourceDefault;

/**
 * @author sheldon
 * 描述：
 * @date 2021/6/24 22:51
 */
public class ActivitiApp {
    public static void main(String[] args) {
        // 引擎配置
        // ProcessEngineConfiguration pec=ProcessEngineConfiguration
        //         .createProcessEngineConfigurationFromResource("activiti.cfg.xml");
        // 获取流程引擎对象
        // ProcessEngine processEngine=pec.buildProcessEngine();
        // ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        // System.out.println(processEngine);
        // int a =10; long b = 10L; double c = 10.0;
        // String a = "abcd";
        // String b = new String("abcd");
        // String c = new String(a);
        // System.out.println(a == b);
        // System.out.println(a == c);
        // System.out.println(b == c);
        // System.out.println(a.equals(b));
        // System.out.println(b.equals(c));
        // System.out.println(a.equals(c));
        // int i = a.compareTo(b);
        // System.out.println(i);
        User user1 = new User();
        user1.setAddress("abcd");
        user1.setAge(2);
        user1.setUsername("zs");
        user1.setSex(0);
        User user2 = new User("zs",2,"abcd",0);
        System.out.println(user1 == user2);

        System.out.println(user1.equals(user2));


    }
}
