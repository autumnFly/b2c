package cn.com.bluemoon.common.customizingwash.mapper;

import cn.com.bluemoon.common.customizingwash.po.MallWashGoodsServiceConfig;
import cn.com.bluemoon.common.customizingwash.po.MallWashGoodsServiceConfigExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MallWashGoodsServiceConfigMapper {
    int countByExample(MallWashGoodsServiceConfigExample example);

    int deleteByExample(MallWashGoodsServiceConfigExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MallWashGoodsServiceConfig record);

    int insertSelective(MallWashGoodsServiceConfig record);

    List<MallWashGoodsServiceConfig> selectByExample(MallWashGoodsServiceConfigExample example);

    MallWashGoodsServiceConfig selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MallWashGoodsServiceConfig record, @Param("example") MallWashGoodsServiceConfigExample example);

    int updateByExample(@Param("record") MallWashGoodsServiceConfig record, @Param("example") MallWashGoodsServiceConfigExample example);

    int updateByPrimaryKeySelective(MallWashGoodsServiceConfig record);

    int updateByPrimaryKey(MallWashGoodsServiceConfig record);
}