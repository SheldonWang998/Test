package com.rexyn.dao;

import com.rexyn.entity.QdLeaseSzsj;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 苏州租赁房源数据(QdLeaseSzsj)表数据库访问层
 *
 * @author makejava
 * @since 2021-03-08 14:23:41
 */
public interface QdLeaseSzsjDao {

    /**
     * 通过ID查询单条数据
     *
     * @param fwId 主键
     * @return 实例对象
     */
    QdLeaseSzsj queryById(String fwId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<QdLeaseSzsj> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param qdLeaseSzsj 实例对象
     * @return 对象列表
     */
    List<QdLeaseSzsj> queryAll(QdLeaseSzsj qdLeaseSzsj);

    /**
     * 新增数据
     *
     * @param qdLeaseSzsj 实例对象
     * @return 影响行数
     */
    int insert(QdLeaseSzsj qdLeaseSzsj);

    /**
     * 修改数据
     *
     * @param qdLeaseSzsj 实例对象
     * @return 影响行数
     */
    int update(QdLeaseSzsj qdLeaseSzsj);

    /**
     * 通过主键删除数据
     *
     * @param fwId 主键
     * @return 影响行数
     */
    int deleteById(String fwId);

}