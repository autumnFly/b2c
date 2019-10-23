package cn.com.bluemoon.common.planner.mapper;

import cn.com.bluemoon.common.planner.po.MallWashPersonAreaDetail;
import cn.com.bluemoon.common.planner.po.MallWashPersonAreaDetailExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MallWashPersonAreaDetailMapper {
    int countByExample(MallWashPersonAreaDetailExample example);

    int deleteByExample(MallWashPersonAreaDetailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MallWashPersonAreaDetail record);

    int insertSelective(MallWashPersonAreaDetail record);

    List<MallWashPersonAreaDetail> selectByExample(MallWashPersonAreaDetailExample example);

    MallWashPersonAreaDetail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MallWashPersonAreaDetail record, @Param("example") MallWashPersonAreaDetailExample example);

    int updateByExample(@Param("record") MallWashPersonAreaDetail record, @Param("example") MallWashPersonAreaDetailExample example);

    int updateByPrimaryKeySelective(MallWashPersonAreaDetail record);

    int updateByPrimaryKey(MallWashPersonAreaDetail record);
}