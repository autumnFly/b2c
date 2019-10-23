package cn.com.bluemoon.common.planner.mapper;

import cn.com.bluemoon.common.planner.po.MallWashPersonInfo;
import cn.com.bluemoon.common.planner.po.MallWashPersonInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MallWashPersonInfoMapper {
    int countByExample(MallWashPersonInfoExample example);

    int deleteByExample(MallWashPersonInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MallWashPersonInfo record);

    int insertSelective(MallWashPersonInfo record);

    List<MallWashPersonInfo> selectByExample(MallWashPersonInfoExample example);

    MallWashPersonInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MallWashPersonInfo record, @Param("example") MallWashPersonInfoExample example);

    int updateByExample(@Param("record") MallWashPersonInfo record, @Param("example") MallWashPersonInfoExample example);

    int updateByPrimaryKeySelective(MallWashPersonInfo record);

    int updateByPrimaryKey(MallWashPersonInfo record);
}