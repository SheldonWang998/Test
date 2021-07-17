package com.rexyn.test2.controller.test9;

/**
 * @author sheldon
 * 描述：线程状态
 * @date 2021/7/13 21:29
 */
public enum ThreadState {
    FREE("空闲", "free"),
    RUNNING("运行", "running"),
    BLOCKED("等待", "blocked"),
    DEAD("死亡", "dead");
    /**
     * 状态名称
     */

    private String name;
    /**
     * 状态值
     */
    private String value;

    ThreadState(String name, String value) {
        this.name = name;
        this.value = value;
    }
}
