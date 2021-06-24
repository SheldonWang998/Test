package com.rexyn.service;

import com.rexyn.entity.QdLeaseSzsj;
import java.util.List;

/**
 * 苏州租赁房源数据(QdLeaseSzsj)表服务接口
 *
 * @author makejava
 * @since 2021-03-08 14:23:41
 */
public interface QdLeaseSzsjService {

    /**
     * 通过ID查询单条数据
     *
     * @param fwId 主键
     * @return 实例对象
     */
    QdLeaseSzsj queryById(String fwId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<QdLeaseSzsj> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param qdLeaseSzsj 实例对象
     * @return 实例对象
     */
    QdLeaseSzsj insert(QdLeaseSzsj qdLeaseSzsj);

    /**
     * 修改数据
     *
     * @param qdLeaseSzsj 实例对象
     * @return 实例对象
     */
    QdLeaseSzsj update(QdLeaseSzsj qdLeaseSzsj);

    /**
     * 通过主键删除数据
     *
     * @param fwId 主键
     * @return 是否成功
     */
    boolean deleteById(String fwId);

}