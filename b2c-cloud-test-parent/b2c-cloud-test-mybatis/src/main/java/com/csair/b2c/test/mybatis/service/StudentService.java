package com.csair.b2c.test.mybatis.service;

import com.csair.b2c.test.mybatis.model.Student;

/**
 * @author yudong
 * @date 2020/5/14
 */
public interface StudentService {

    Student findById(Integer id);

}
