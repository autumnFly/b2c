package com.csair.b2c.test.mybatis;

import com.alibaba.fastjson.JSONObject;
import com.csair.b2c.test.mybatis.mapper.mysql.ExamMapper;
import com.csair.b2c.test.mybatis.model.Exam;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by yu on 2018/4/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class EnumMySQLTest {

    @Autowired
    private ExamMapper examMapper;


    @Test
    public void test() throws Exception {
        List<Exam> exams = examMapper.selectAllBackup();
        System.out.println(JSONObject.toJSONString(exams, true));
    }

}
