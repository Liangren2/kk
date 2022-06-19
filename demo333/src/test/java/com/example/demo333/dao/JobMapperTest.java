package com.example.demo333.dao;

import com.example.demo333.module.entity.Job;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/*
* @
* */
@RunWith(SpringRunner.class)//启动项目
@SpringBootTest//加载配置文件
public class JobMapperTest{
    @Autowired
    private JobMapper jobMapper;
    @Test
    public void insert() throws Exception{
        Job job=new Job();
        job.setTitle("兼职工作");
        job.setJobContent("工作内容");
        job.setSalary(1000.00);
        job.setAddress("南昌");
        jobMapper.insert(job);
    }
    @Test
    public void test1(){

    }
}
