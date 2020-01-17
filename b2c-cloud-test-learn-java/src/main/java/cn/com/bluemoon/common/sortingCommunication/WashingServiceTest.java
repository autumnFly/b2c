package cn.com.bluemoon.common.sortingCommunication;

import cn.com.bluemoon.common.planner.mapper.MallWashPersonExtMapper;
import cn.com.bluemoon.common.planner.utils.WashingServiceUtils;
import cn.com.bluemoon.common.planner.vo.AddressInfo;
import cn.com.bluemoon.common.planner.vo.GetNeedDispatchOrderListResVo;
import cn.com.bluemoon.common.planner.vo.SearchReceiverAngelResVo;
import com.csair.b2c.cloud.test.learn.java.utils.OMUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.session.SqlSession;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yudong
 * @date 2019/12/23
 */
public class WashingServiceTest {

    static SqlSession sqlSession;

    @BeforeClass
    public static void before() {
        sqlSession = WashingServiceUtils.getSqlSession();
    }

    @AfterClass
    public static void after() {
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test() {
        MallWashPersonExtMapper mapper = sqlSession.getMapper(MallWashPersonExtMapper.class);
        PageHelper.startPage(1, 10);
        List<AddressInfo> addressInfos = new ArrayList<>();
        AddressInfo addressInfo = new AddressInfo();
        addressInfo.setProvince("广东");
        addressInfo.setCity("清远");
        addressInfo.setCounty("英德市");
        addressInfos.add(addressInfo);
        AddressInfo addressInfo1 = new AddressInfo();
        addressInfo1.setProvince("广东");
        addressInfo1.setCity("广州");
        addressInfo1.setCounty("白云区");
        addressInfos.add(addressInfo1);
        List<GetNeedDispatchOrderListResVo> listResVos = mapper.selectNeedAssignOrders(addressInfos);
        PageInfo<GetNeedDispatchOrderListResVo> pageInfo = new PageInfo<>(listResVos);
        System.out.println(pageInfo.getTotal());
        System.out.println(OMUtils.writeValueAsString(pageInfo.getList(), true));
    }

    @Test
    public void test1() {
        MallWashPersonExtMapper mapper = sqlSession.getMapper(MallWashPersonExtMapper.class);
        List<AddressInfo> addressInfos = new ArrayList<>();
        AddressInfo addressInfo = new AddressInfo();
        addressInfo.setProvince("广东");
        addressInfo.setCity("清远");
        addressInfo.setCounty("英德市");
        addressInfos.add(addressInfo);
        AddressInfo addressInfo1 = new AddressInfo();
        addressInfo1.setProvince("广东");
        addressInfo1.setCity("广州");
        addressInfo1.setCounty("白云区");
        addressInfos.add(addressInfo1);
        List<SearchReceiverAngelResVo> angelResVos = mapper.selectReceiverAngels("80546269", "", addressInfos);
        System.out.println(OMUtils.writeValueAsString(angelResVos, true));

    }

}
