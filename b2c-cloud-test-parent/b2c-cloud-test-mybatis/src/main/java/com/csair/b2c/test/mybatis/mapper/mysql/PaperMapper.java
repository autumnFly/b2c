package com.csair.b2c.test.mybatis.mapper.mysql;

import com.csair.b2c.test.mybatis.model.Paper;
import java.util.List;

public interface PaperMapper {
    int deleteByPrimaryKey(Long paperId);

    int insert(Paper record);

    Paper selectByPrimaryKey(Long paperId);

    List<Paper> selectAll();

    int updateByPrimaryKey(Paper record);
}