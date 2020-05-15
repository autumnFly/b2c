package com.csair.b2c.test.mybatis.service.impl;

import com.csair.b2c.test.mybatis.mapper.mysql.StudentMapper;
import com.csair.b2c.test.mybatis.model.Student;
import com.csair.b2c.test.mybatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author yudong
 * @date 2020/5/14
 */
@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    @Transactional(readOnly = true)
    public Student findById(Integer id) {
        return studentMapper.findStudentById(id);
    }

}
