package cn.com.bluemoon.common.customizingwash.test;

import cn.com.bluemoon.common.customizingwash.mapper.MallWashGoodsServiceConfigMapper;
import cn.com.bluemoon.common.customizingwash.po.ClothesBean;
import cn.com.bluemoon.common.customizingwash.po.MallWashGoodsServiceConfig;
import cn.com.bluemoon.common.customizingwash.po.MallWashGoodsServiceConfigExample;
import cn.com.bluemoon.common.planner.utils.WashingServiceUtils;
import cn.com.bluemoon.handypoi.excel.enums.ExcelType;
import cn.com.bluemoon.handypoi.excel.resolve.ExcelReader;
import com.csair.b2c.cloud.test.learn.java.utils.MybatisUtils;
import com.google.common.collect.Lists;
import org.apache.ibatis.session.SqlSession;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author yudong
 * @date 2019/3/20
 */
public class WashingServiceTest {

    private static SqlSession sqlSession;

    @BeforeClass
    public static void before() {
        sqlSession = WashingServiceUtils.getSqlSession();
    }

    @AfterClass
    public static void after() {
        sqlSession.commit();
        sqlSession.close();
        MybatisUtils.getDatasourceWashingService().close();
    }

    @Test
    public void test() throws Exception {
        MallWashGoodsServiceConfigMapper configMapper = sqlSession.getMapper(MallWashGoodsServiceConfigMapper.class);
        File file = new File("D:\\User\\Tencent Files\\375709770\\FileRecv\\sku附加服务示例-v5.0-20200429.xlsx");
        InputStream inputStream = new FileInputStream(file);
        ExcelReader<ClothesBean> excelReader = new ExcelReader<>(ExcelType.XLSX, inputStream, ClothesBean.class, 2, 0);
        String[] serviceNames = new String[1];
        Integer[] serviceSorts = new Integer[1];
        excelReader.setRowReadListener((clothesBean, excelContext) -> {
            if (!"".equals(clothesBean.getServiceName())) {
                serviceNames[0] = clothesBean.getServiceName();
                serviceSorts[0] = clothesBean.getServiceSort();
            } else {
                clothesBean.setServiceName(serviceNames[0]);
                clothesBean.setServiceSort(serviceSorts[0]);
            }
            System.out.println(clothesBean);
            return true;
        });
        excelReader.read();
        List<ClothesBean> list = excelReader.getResultList();

        Map<String, List<ClothesBean>> map = list.stream()
                // .filter(clothesBean -> clothesBean.getGoodsCode().equals("010109"))
                .collect(Collectors.groupingBy(ClothesBean::getGoodsCode));

        for (Map.Entry<String, List<ClothesBean>> stringListEntry : map.entrySet()) {
            List<ClothesBean> clothesBeans = stringListEntry.getValue();

            Map<Boolean, List<ClothesBean>> map1 = clothesBeans.stream().collect(Collectors.groupingBy(clothesBean -> "-".equals(clothesBean.getAssociateServiceItem())));

            for (ClothesBean clothesBean : map1.getOrDefault(true, Lists.newArrayList())) {
                MallWashGoodsServiceConfig mallWashGoodsServiceRef = new MallWashGoodsServiceConfig();
                mallWashGoodsServiceRef.setGoodsCode(clothesBean.getGoodsCode());
                mallWashGoodsServiceRef.setServiceItemName(clothesBean.getServiceItemName());
                mallWashGoodsServiceRef.setServiceTypeName(clothesBean.getServiceName());
                mallWashGoodsServiceRef.setDefaultServiceFlag("是".equals(clothesBean.getIsDefault()) ? 1 : 0);
                mallWashGoodsServiceRef.setItemRef("");
                mallWashGoodsServiceRef.setServicePrice(clothesBean.getPrice() * 100);
                mallWashGoodsServiceRef.setMutualFlag("非互斥".equals(clothesBean.getMutex()) ? 0 : 1);
                mallWashGoodsServiceRef.setSort(clothesBean.getItemSort());
                mallWashGoodsServiceRef.setServiceTypeSort(clothesBean.getServiceSort());
                mallWashGoodsServiceRef.setDelFlag(0);
                mallWashGoodsServiceRef.setLevel(1);
                mallWashGoodsServiceRef.setPid(0L);
                configMapper.insertSelective(mallWashGoodsServiceRef);
            }

            for (ClothesBean clothesBean : map1.getOrDefault(false, Lists.newArrayList())) {
                MallWashGoodsServiceConfig mallWashGoodsServiceRef = new MallWashGoodsServiceConfig();
                mallWashGoodsServiceRef.setGoodsCode(clothesBean.getGoodsCode());
                mallWashGoodsServiceRef.setServiceItemName(clothesBean.getServiceItemName());
                mallWashGoodsServiceRef.setServiceTypeName(clothesBean.getServiceName());
                mallWashGoodsServiceRef.setDefaultServiceFlag("是".equals(clothesBean.getIsDefault()) ? 1 : 0);
                mallWashGoodsServiceRef.setItemRef("");
                mallWashGoodsServiceRef.setServicePrice(clothesBean.getPrice() * 100);
                mallWashGoodsServiceRef.setMutualFlag("非互斥".equals(clothesBean.getMutex()) ? 0 : 1);
                mallWashGoodsServiceRef.setSort(clothesBean.getItemSort());
                mallWashGoodsServiceRef.setServiceTypeSort(0);
                mallWashGoodsServiceRef.setDelFlag(0);
                mallWashGoodsServiceRef.setLevel(2);

                String[] associates = clothesBean.getAssociateServiceItem().split("-");
                String serviceName = associates[0];
                String serviceItemName = associates[1];
                MallWashGoodsServiceConfigExample refExample = new MallWashGoodsServiceConfigExample();
                refExample.createCriteria()
                        .andServiceTypeNameEqualTo(serviceName)
                        .andServiceItemNameEqualTo(serviceItemName)
                        .andDelFlagEqualTo(0)
                        .andGoodsCodeEqualTo(clothesBean.getGoodsCode());
                MallWashGoodsServiceConfig config = configMapper.selectByExample(refExample).get(0);
                mallWashGoodsServiceRef.setPid(config.getId());

                configMapper.insertSelective(mallWashGoodsServiceRef);
            }

            Map<String, List<ClothesBean>> map2 = map1.getOrDefault(false, Lists.newArrayList()).stream()
                    .collect(Collectors.groupingBy(ClothesBean::getAssociateServiceItem));
            for (Map.Entry<String, List<ClothesBean>> listEntry : map2.entrySet()) {

                String goodsCode = stringListEntry.getKey();
                String[] associates = listEntry.getKey().split("-");
                String serviceName = associates[0];
                String serviceItemName = associates[1];
                MallWashGoodsServiceConfigExample refExample = new MallWashGoodsServiceConfigExample();
                refExample.createCriteria()
                        .andServiceTypeNameEqualTo(serviceName)
                        .andServiceItemNameEqualTo(serviceItemName)
                        .andDelFlagEqualTo(0)
                        .andGoodsCodeEqualTo(goodsCode);
                MallWashGoodsServiceConfig config = configMapper.selectByExample(refExample).get(0);


                String ids = listEntry.getValue().stream().map(clothesBean -> {

                    MallWashGoodsServiceConfigExample example = new MallWashGoodsServiceConfigExample();
                    example.createCriteria()
                            .andPidEqualTo(config.getId())
                            .andServiceTypeNameEqualTo(clothesBean.getServiceName())
                            .andServiceItemNameEqualTo(clothesBean.getServiceItemName())
                            .andDelFlagEqualTo(0)
                            .andGoodsCodeEqualTo(clothesBean.getGoodsCode());

                    MallWashGoodsServiceConfig config1 = configMapper.selectByExample(example).get(0);
                    return String.valueOf(config1.getId());
                }).collect(Collectors.joining(","));


                MallWashGoodsServiceConfig config2 = new MallWashGoodsServiceConfig();
                config2.setItemRef(ids);
                configMapper.updateByExampleSelective(config2, refExample);
            }
        }
    }
}
