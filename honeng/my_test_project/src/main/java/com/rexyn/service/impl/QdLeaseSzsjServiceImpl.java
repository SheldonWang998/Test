package com.rexyn.service.impl;

import com.rexyn.entity.QdLeaseSzsj;
import com.rexyn.dao.QdLeaseSzsjDao;
import com.rexyn.service.QdLeaseSzsjService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 苏州租赁房源数据(QdLeaseSzsj)表服务实现类
 *
 * @author makejava
 * @since 2021-03-08 14:23:42
 */
@Service("qdLeaseSzsjService")
public class QdLeaseSzsjServiceImpl implements QdLeaseSzsjService {
    @Resource
    private QdLeaseSzsjDao qdLeaseSzsjDao;

    /**
     * 通过ID查询单条数据
     *
     * @param fwId 主键
     * @return 实例对象
     */
    @Override
    public QdLeaseSzsj queryById(String fwId) {
        return this.qdLeaseSzsjDao.queryById(fwId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<QdLeaseSzsj> queryAllByLimit(int offset, int limit) {
        return this.qdLeaseSzsjDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param qdLeaseSzsj 实例对象
     * @return 实例对象
     */
    @Override
    public QdLeaseSzsj insert(QdLeaseSzsj qdLeaseSzsj) {
        this.qdLeaseSzsjDao.insert(qdLeaseSzsj);
        return qdLeaseSzsj;
    }

    /**
     * 修改数据
     *
     * @param qdLeaseSzsj 实例对象
     * @return 实例对象
     */
    @Override
    public QdLeaseSzsj update(QdLeaseSzsj qdLeaseSzsj) {
        this.qdLeaseSzsjDao.update(qdLeaseSzsj);
        return this.queryById(qdLeaseSzsj.getFwId());
    }

    /**
     * 通过主键删除数据
     *
     * @param fwId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String fwId) {
        return this.qdLeaseSzsjDao.deleteById(fwId) > 0;
    }
}