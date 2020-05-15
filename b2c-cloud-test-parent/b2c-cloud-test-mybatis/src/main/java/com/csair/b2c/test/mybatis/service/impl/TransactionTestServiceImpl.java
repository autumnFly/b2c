package com.csair.b2c.test.mybatis.service.impl;

import com.csair.b2c.test.mybatis.enums.DelFlagEnum;
import com.csair.b2c.test.mybatis.enums.ExamStatusEnum;
import com.csair.b2c.test.mybatis.enums.ExamTypeEnum;
import com.csair.b2c.test.mybatis.mapper.mysql.ExamMapper;
import com.csair.b2c.test.mybatis.mapper.mysql.StudentMapper;
import com.csair.b2c.test.mybatis.model.Exam;
import com.csair.b2c.test.mybatis.model.Gender;
import com.csair.b2c.test.mybatis.model.PhoneNumber;
import com.csair.b2c.test.mybatis.model.Student;
import com.csair.b2c.test.mybatis.service.StudentService;
import com.csair.b2c.test.mybatis.service.TransactionTestService;
import com.csair.b2c.test.mybatis.service.helper.TransactionHelper;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * Created on 2019/4/26.
 *
 * @author yudong
 */
@SuppressWarnings("ALL")
@Service
public class TransactionTestServiceImpl implements TransactionTestService {

    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private StudentService studentService;
    @Autowired
    private ExamMapper examMapper;
    @Autowired
    private TransactionHelper transactionHelper;

    @Override
    @Transactional
    public int handlerRecord() {
        Student student = new Student();
        student.setName("梁煜东");
        student.setEmail("728066532@qq.com");
        student.setDob(new Date());
        student.setPhone(new PhoneNumber("86-020-84256254"));
        student.setGender(Gender.FEMALE);
        int res = studentMapper.insertStudent(student);
        transactionHelper.handler();
        if (true) {
            throw new RuntimeException();
        }
        return res;
    }

    @Override
    @Transactional
    public int transactionResearch() {
        Exam exam = new Exam();
        exam.setExamId(RandomUtils.nextLong());
        exam.setExamCode(RandomStringUtils.randomAlphabetic(6));
        exam.setExamName(RandomStringUtils.randomAlphabetic(19));
        exam.setExamType(ExamTypeEnum.EXAM_COURSE_SUITE);
        exam.setExamStatus(ExamStatusEnum.FINISH_EXAM);
        exam.setPublishStartTime(new Date());
        exam.setPublishEndTime(new Date());
        exam.setScorePoint(0);
        exam.setDelFlag(DelFlagEnum.ORDINARY);
        exam.setExamExplain(RandomStringUtils.randomAlphabetic(16));
        exam.setToken("");
        int i = examMapper.insert(exam);
        Student student = studentService.findById(1);
        return i;
    }

}
