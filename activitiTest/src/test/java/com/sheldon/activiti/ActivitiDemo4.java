package com.sheldon.activiti;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.repository.Deployment;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sheldon
 * 描述：
 * @date 2021/6/27 16:50
 */
public class ActivitiDemo4 {
    /**
     * 流程部署
     */
    @Test
    public void testDeployment() {
        ProcessEngine defaultProcessEngine = ProcessEngines.getDefaultProcessEngine();
        RepositoryService repositoryService = defaultProcessEngine.getRepositoryService();
        Deployment deploy = repositoryService.createDeployment()
                .name("请假申请")
                .addClasspathResource("bpmn/sheldon-uel.bpmn")
                .addClasspathResource("bpmn/process.jpg")
                .deploy();
        System.out.println("流程部署的id:" + deploy.getId());
        System.out.println("流程部署的名字:" + deploy.getName());
    }
    @Test
    public void startAssigneeUel(){
        //获取引擎
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        //获取runtimeService
        RuntimeService runtimeService = processEngine.getRuntimeService();
        //设定负责人的值，替换流程的表达式
        Map<String,Object> map = new HashMap<>();
        map.put("assignee0","张三");
        map.put("assignee1","李四");
        map.put("assignee2","王五");
        map.put("assignee3","赵六");
        runtimeService.startProcessInstanceByKey("process",map);
    }
}
