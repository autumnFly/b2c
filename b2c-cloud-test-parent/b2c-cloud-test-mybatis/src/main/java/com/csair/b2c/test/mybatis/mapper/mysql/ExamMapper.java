package com.csair.b2c.test.mybatis.mapper.mysql;

import com.csair.b2c.test.mybatis.model.Exam;

import java.util.List;

public interface ExamMapper {
    int deleteByPrimaryKey(Long examId);

    int insert(Exam record);

    List<Exam> select(Exam record);

    Exam selectByPrimaryKey(Long examId);

    List<Exam> selectAll();

    List<Exam> selectAllBackup();

    int updateByPrimaryKey(Exam record);
}