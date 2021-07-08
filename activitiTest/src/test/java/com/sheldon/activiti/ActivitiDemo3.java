package com.sheldon.activiti;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.runtime.ProcessInstanceQuery;
import org.activiti.engine.task.Task;
import org.activiti.engine.task.TaskQuery;
import org.junit.Test;

/**
 * @author sheldon
 * 描述：
 * @date 2021/6/27 15:00
 */
public class ActivitiDemo3 {
    /**
     * 添加业务key到activiti的表中
     */
    @Test
    public void addBusinessKey() {
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        RuntimeService runtimeService = processEngine.getRuntimeService();
        // 第一个参数，流程定义的key 第二个参数，businessKey 存 出差申请单的id
        ProcessInstance myProcess = runtimeService.startProcessInstanceByKey("MyProcess", "1001");
        System.out.println("businessKey:" + myProcess.getBusinessKey());
    }

    /**
     * 全部流程实例的挂起和激活
     */
    @Test
    public void suspendAllProcessInstance() {
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        RepositoryService repositoryService = processEngine.getRepositoryService();
        //查询流程定义
        ProcessDefinition singleResult = repositoryService.createProcessDefinitionQuery()
                .processDefinitionKey("MyProcess")
                .singleResult();
        //获取当前流程定义的实例是否都是挂起状态
        boolean suspended = singleResult.isSuspended();
        //获取流程定义的id
        String id = singleResult.getId();
        if (suspended) {
            //如果是挂起状态，改为激活状态
            //参数一：流程id
            //参数二：是否改为激活
            //参数三：激活时间
            repositoryService.activateProcessDefinitionById(id, true, null);
            System.out.println("流程定义id：" + id + "已经激活");
        } else {
            //如果是激活状态，改为挂起状态
            repositoryService.suspendProcessDefinitionById(id, true, null);
            System.out.println("流程定义id：" + id + "已经挂起");
        }
    }

    /**
     * 单个流程实例挂起
     */
    @Test
    public void suspendSingleProcessInstance() {
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        RuntimeService runtimeService = processEngine.getRuntimeService();
        //通过runtimeService获取流程实例对象
        ProcessInstanceQuery processInstanceQuery = runtimeService.createProcessInstanceQuery();
        ProcessInstance instance = processInstanceQuery.processInstanceId("7501").singleResult();
        //得到当前流程实例状态
        boolean suspended = instance.isSuspended();
        //得到当前流程的id
        String id = instance.getId();
        //判断是否已经挂起
        if (suspended) {
            runtimeService.activateProcessInstanceById(id);
            System.out.println("流程定义id：" + id + "已经激活");
        } else {
            runtimeService.suspendProcessInstanceById(id);
            System.out.println("流程定义id：" + id + "已经挂起");
        }
    }

    @Test
    public void completeTask() {
        ProcessEngine defaultProcessEngine = ProcessEngines.getDefaultProcessEngine();
        TaskService taskService = defaultProcessEngine.getTaskService();
        Task task = taskService.createTaskQuery()
                .processInstanceId("7501")
                .taskAssignee("王五")
                .singleResult();
        System.out.println("流程实例的id：" + task.getProcessInstanceId());
        System.out.println("流程任务id：" + task.getId());
        System.out.println("负责人：" + task.getAssignee());
        System.out.println("任务名称：" + task.getName());
        taskService.complete(task.getId());
    }
}
