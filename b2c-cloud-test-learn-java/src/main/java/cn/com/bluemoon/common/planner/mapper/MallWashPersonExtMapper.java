package cn.com.bluemoon.common.planner.mapper;

import cn.com.bluemoon.common.planner.po.MallWashPersonAreaDetail;
import cn.com.bluemoon.common.planner.po.MallWashPersonInfo;
import cn.com.bluemoon.common.planner.vo.AddressInfo;
import cn.com.bluemoon.common.planner.vo.GetNeedDispatchOrderListResVo;
import cn.com.bluemoon.common.planner.vo.SearchReceiverAngelResVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author yudong
 * @date 2019/8/20
 */
public interface MallWashPersonExtMapper {

    List<MallWashPersonInfo> selectPlannerByAreaInfo(@Param("province") String province,
                                                     @Param("city") String city,
                                                     @Param("county") String county);

    List<MallWashPersonAreaDetail> selectAreaInfoByAngelCode(@Param("angelCode") String angelCode);


    List<GetNeedDispatchOrderListResVo> selectNeedAssignOrders(@Param("addressInfos") List<AddressInfo> addressInfos);

    List<SearchReceiverAngelResVo> selectReceiverAngels(@Param("angelCode") String angelCode,
                                                        @Param("angelName") String angelName,
                                                        @Param("addressInfos") List<AddressInfo> addressInfos);

    List<MallWashPersonAreaDetail> selectAreaDetail(@Param("id") Long personId);
}