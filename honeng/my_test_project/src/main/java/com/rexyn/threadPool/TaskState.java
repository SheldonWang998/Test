package com.rexyn.threadPool;

/**
 * @author sheldon
 * 描述： 线程池状态
 * @date 2021/7/13 19:36
 *
 */
public enum TaskState {
    FREE,
    RUNNING,
    BLOCKED,
    DEAD
}
