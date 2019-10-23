package com.csair.b2c.test.mybatis.service.impl;

import com.csair.b2c.test.mybatis.mapper.mysql.StudentMapper;
import com.csair.b2c.test.mybatis.model.Gender;
import com.csair.b2c.test.mybatis.model.PhoneNumber;
import com.csair.b2c.test.mybatis.model.Student;
import com.csair.b2c.test.mybatis.service.TransactionTestService;
import com.csair.b2c.test.mybatis.service.helper.TransactionHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * Created on 2019/4/26.
 *
 * @author yudong
 */
@Service
@Transactional(readOnly = true, rollbackFor = Exception.class)
public class TransactionTestServiceImpl implements TransactionTestService {

    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private TransactionHelper transactionHelper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int handlerRecord() {
        Student student = new Student();
        student.setName("梁煜东");
        student.setEmail("728066532@qq.com");
        student.setDob(new Date());
        student.setPhone(new PhoneNumber("86-020-84256254"));
        student.setGender(Gender.FEMALE);
        int res = studentMapper.insertStudent(student);
        transactionHelper.handler();
        // int a = 1;
        // if (a == 1) {
        //     throw new RuntimeException();
        // }
        return res;
    }
}
