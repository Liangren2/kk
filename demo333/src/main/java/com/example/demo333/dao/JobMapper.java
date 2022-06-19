package com.example.demo333.dao;
/*
* 兼职工作dao
* @auther ke
* @version 1.0
* @data 2022-6-18
* */


import com.example.demo333.module.dto.JobDTO;
import com.example.demo333.module.entity.Job;
import com.example.demo333.module.vo.JobVO;

import java.util.List;

public interface JobMapper {
    /**
     *
     *插入数据
     * @param job
     * @throws Exception
     */
    void insert(Job job) throws Exception;

    /**
     * 动态插入
     * @param job
     * @throws Exception
     */
    void insertSelective(Job job) throws Exception;

    /**
     * 批量插入
     * @param jobList
     * @throws Exception
     */
    void insertBatch(List<Job> jobList) throws Exception;

    /**
     * 修改
     * @param job
     * @throws Exception
     */
    void update(Job job) throws Exception;
    void updateSelective(Job job) throws Exception;
    void updateBatch(List<Job> job) throws Exception;

    void delete(Integer id) throws Exception;
    void deleteBatch(Integer[] ids) throws Exception;

    JobDTO selectByPrimaryKey(Integer id) throws Exception;
    JobDTO selectBySelective(JobVO jobVO);

}
