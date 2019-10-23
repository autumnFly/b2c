package com.csair.b2c.test.mybatis.mapper.mysql;

import com.csair.b2c.test.mybatis.model.ExamPaper;
import java.util.List;

public interface ExamPaperMapper {
    int deleteByPrimaryKey(Long examPaperId);

    int insert(ExamPaper record);

    ExamPaper selectByPrimaryKey(Long examPaperId);

    List<ExamPaper> selectAll();

    int updateByPrimaryKey(ExamPaper record);
}