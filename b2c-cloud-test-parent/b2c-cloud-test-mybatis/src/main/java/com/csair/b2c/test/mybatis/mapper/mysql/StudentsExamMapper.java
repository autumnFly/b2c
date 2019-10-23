package com.csair.b2c.test.mybatis.mapper.mysql;

import com.csair.b2c.test.mybatis.model.StudentsExam;
import java.util.List;

public interface StudentsExamMapper {
    int deleteByPrimaryKey(Long studExamId);

    int insert(StudentsExam record);

    StudentsExam selectByPrimaryKey(Long studExamId);

    List<StudentsExam> selectAll();

    int updateByPrimaryKey(StudentsExam record);
}