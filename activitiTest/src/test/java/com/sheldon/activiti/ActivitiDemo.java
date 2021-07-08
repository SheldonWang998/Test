package com.sheldon.activiti;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.engine.ProcessEngines;
import org.junit.Test;

/**
 * @author sheldon
 * 描述：创建activiti需要使用的表
 * @date 2021/6/24 20:35
 */

public class ActivitiDemo {
    @Test
    public void createActivitiDB(){

        //使用默认的方法 默认读取名字为activiti.cfg.xml的文件
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        System.out.println(processEngine);
    }
    @Test
    public void testGenTable() {
        //创建ProcessEngineProcessEngine
        ProcessEngineConfiguration processEngineConfigurationFromResource = ProcessEngineConfiguration.createProcessEngineConfigurationFromResource("activiti.cfg.xml");

        //创建processEngine
        ProcessEngine processEngine = processEngineConfigurationFromResource.buildProcessEngine();

        System.out.println(processEngine);

    }
}
