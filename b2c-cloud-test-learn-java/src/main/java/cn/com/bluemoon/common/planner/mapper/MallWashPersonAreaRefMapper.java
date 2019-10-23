package cn.com.bluemoon.common.planner.mapper;

import cn.com.bluemoon.common.planner.po.MallWashPersonAreaRef;
import cn.com.bluemoon.common.planner.po.MallWashPersonAreaRefExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MallWashPersonAreaRefMapper {
    int countByExample(MallWashPersonAreaRefExample example);

    int deleteByExample(MallWashPersonAreaRefExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MallWashPersonAreaRef record);

    int insertSelective(MallWashPersonAreaRef record);

    List<MallWashPersonAreaRef> selectByExample(MallWashPersonAreaRefExample example);

    MallWashPersonAreaRef selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MallWashPersonAreaRef record, @Param("example") MallWashPersonAreaRefExample example);

    int updateByExample(@Param("record") MallWashPersonAreaRef record, @Param("example") MallWashPersonAreaRefExample example);

    int updateByPrimaryKeySelective(MallWashPersonAreaRef record);

    int updateByPrimaryKey(MallWashPersonAreaRef record);
}