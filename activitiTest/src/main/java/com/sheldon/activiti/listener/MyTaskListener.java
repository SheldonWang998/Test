package com.sheldon.activiti.listener;

import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.TaskListener;

/**
 * @author sheldon
 * 描述：activiti 的监听器
 * @date 2021/6/27 17:11
 */
public class MyTaskListener implements TaskListener {

    /**
     * 指定负责人
     *
     * @param delegateTask
     */
    @Override
    public void notify(DelegateTask delegateTask) {
        //判断当前的任务是 【请假申请】，并且事件的名字是create事件
        if ("请假申请".equals(delegateTask.getName()) && "create".equals(delegateTask.getEventName())) {
            delegateTask.setAssignee("王燏镕");
        }
    }
}
