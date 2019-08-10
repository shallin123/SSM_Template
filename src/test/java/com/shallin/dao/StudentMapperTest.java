package com.shallin.dao;

import com.shallin.entity.Student;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by toutou on 2018/5/10.
 */
public class StudentMapperTest {

    private ApplicationContext applicationContext;

    @Autowired
    private StudentMapper mapper;

    @Before
    public void setUp() throws Exception {
        // 加载spring配置文件
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
        // 导入需要测试的
        mapper = applicationContext.getBean(StudentMapper.class);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void insert() throws Exception {
        Student student = new Student();
        student.setCommand("吃饭");
        student.setContent("睡觉");
        student.setDescription("打豆豆");
        int result = mapper.insert(student);
        System.out.println(result);
        assert (result == 1);
    }
}