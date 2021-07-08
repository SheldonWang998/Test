package com.sheldon.activiti;

import org.activiti.engine.HistoryService;
import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.history.HistoricActivityInstance;
import org.activiti.engine.history.HistoricActivityInstanceQuery;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.DeploymentQuery;
import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.repository.ProcessDefinitionQuery;
import org.activiti.engine.runtime.ProcessInstance;
import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author sheldon
 * 描述：
 * @date 2021/6/24 21:18
 */
public class ActivitiDemo2 {
    /**
     * 流程部署
     */
    @Test
    public void testDeployment() {
        ProcessEngine defaultProcessEngine = ProcessEngines.getDefaultProcessEngine();
        RepositoryService repositoryService = defaultProcessEngine.getRepositoryService();
        Deployment deploy = repositoryService.createDeployment()
                .name("出差申请")
                .addClasspathResource("bpmn/process.bpmn")
                .addClasspathResource("bpmn/process.jpg")
                .deploy();
        System.out.println("流程部署的id:" + deploy.getId());
        System.out.println("流程部署的名字:" + deploy.getName());
    }

    /**
     * 启动流程实例
     */
    @Test
    public void testStartProcess() {
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        RuntimeService runtimeService = processEngine.getRuntimeService();
        ProcessInstance instance = runtimeService.startProcessInstanceByKey("MyProcess");
        System.out.println("流程定义id：" + instance.getProcessDefinitionId());
        System.out.println("流程实例id：" + instance.getId());
        System.out.println("当前活动id：" + instance.getActivityId());
        System.out.println("流程部署id：");
    }

    @Test
    public void queryProcessDefinition() {
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        RepositoryService repositoryService = processEngine.getRepositoryService();
        ProcessDefinitionQuery processDefinitionQuery = repositoryService.createProcessDefinitionQuery();
        List<ProcessDefinition> myProcess = processDefinitionQuery.processDefinitionKey("MyProcess")
                .orderByProcessDefinitionVersion()
                .desc()
                .list();
        for (ProcessDefinition process : myProcess) {
            System.out.println("流程定义id：" + process.getId());
            System.out.println("流程定义名称："+ process.getName());
            System.out.println("流程定义key："+ process.getKey());
            System.out.println("流程定义版本："+ process.getVersion());
            System.out.println("流程部署id："+process.getDeploymentId());
        }
        DeploymentQuery deploymentQuery = repositoryService.createDeploymentQuery();
        List<Deployment> list = deploymentQuery
                .processDefinitionKey("MyProcess")
                .orderByDeploymenTime()
                .desc()
                .list();
        for (Deployment deployment : list) {
            System.out.println(deployment.getId());
        }

    }

    /**
     * 删除流程部署信息
     * 如果要删除的流程有未完成的任务，需要级联删除
     */
    @Test
    public void deleteDeployment() {
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        RepositoryService repositoryService = processEngine.getRepositoryService();
        String deploymentId = "1";
        // repositoryService.deleteDeployment(deploymentId);
        //true：表示级联删除
        repositoryService.deleteDeployment(deploymentId,true);

    }
    /**
     * 下载资源文件
     * 一、使用activiti的api，下载资源文件
     * 二、自己写api用commons-io.jar解决io问题
     */
    @Test
    public void getDeploymentFiles() throws IOException {
        //得到流程引擎
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        //得到activiti提供的api
        RepositoryService repositoryService = processEngine.getRepositoryService();
        //获取查询对象ProcessDefinitionQuery
        ProcessDefinition myProcess = repositoryService.createProcessDefinitionQuery()
                .processDefinitionKey("MyProcess")
                .singleResult();
        //通过流程定义信息，获取部署id
        String deploymentId = myProcess.getDeploymentId();
        //通过repositoryService，传递部署id，读取资源信息（图片和bpmn文件）
           //获取图片的流
        String diagramResourceName = myProcess.getDiagramResourceName();
        InputStream diagramStream = repositoryService.getResourceAsStream(deploymentId, diagramResourceName);
        //获取bpmn文件的流
        String resourceName = myProcess.getResourceName();
        InputStream resourceStream = repositoryService.getResourceAsStream(deploymentId, resourceName);
        //构造outputStream
        File diagramFile = new File("G:/sheldon.jpg");
        File bpmnFile = new File("G:/sheldon.bpmn");
        FileOutputStream f1 = new FileOutputStream(diagramFile);
        FileOutputStream f2 = new FileOutputStream(bpmnFile);
        //输入流，输出流转换
        IOUtils.copy(diagramStream, f1);
        IOUtils.copy(resourceStream, f2);
        //关闭流
        f1.close();
        f2.close();
        diagramStream.close();
        resourceStream.close();
    }

    /**
     * 查看历史信息
     */
    @Test
    public void findHistoryInfo(){
        //获取引擎
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        //获取historyService
        HistoryService historyService = processEngine.getHistoryService();
        //查询  条件：实例id（也可以根据其他条件查询）
        HistoricActivityInstanceQuery instanceQuery = historyService.createHistoricActivityInstanceQuery();
        List<HistoricActivityInstance> list = instanceQuery.processInstanceId("7501")
                //根据开始时间排序
                .orderByHistoricActivityInstanceStartTime()
                //升序
                .asc()
                .list();
        for (HistoricActivityInstance historicActivityInstance : list) {
            System.out.println(historicActivityInstance.getActivityId());
            System.out.println(historicActivityInstance.getProcessInstanceId());
        }
        //输出
    }

}
