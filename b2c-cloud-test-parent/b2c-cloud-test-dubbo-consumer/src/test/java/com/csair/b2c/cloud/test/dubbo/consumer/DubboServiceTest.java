package com.csair.b2c.cloud.test.dubbo.consumer;

import cn.com.bluemoon.admin.api.updatesysuser.dto.SyncCompanyUserDTO;
import cn.com.bluemoon.admin.api.updatesysuser.dubbo.service.CompanyUserDubboService;
import cn.com.bluemoon.logistics.dto.LogisticsModelDto;
import cn.com.bluemoon.logistics.dubbo.LogisticsDubboService;
import cn.com.bluemoon.mall.user.dubbo.dto.UserInfoDto;
import cn.com.bluemoon.mall.user.dubbo.service.UserService;
import cn.com.bluemoon.mall.user.dubbo.service.UserTokenService;
import cn.com.bluemoon.mallwash.order.dubbo.service.WashOrderService;
import cn.com.bluemoon.mallwash.order.dubbo.vo.PayTypeInfoVo;
import cn.com.bluemoon.mallwash.order.dubbo.vo.WashOrderBaseInfoVo;
import cn.com.bluemoon.moonmall.item.dubbo.dto.MallProductDto;
import cn.com.bluemoon.moonmall.item.dubbo.service.MoonMallItemService;
import cn.com.bluemoon.moonmall.order.dubbo.dto.GetSuiteOrderDetailsDto;
import cn.com.bluemoon.moonmall.order.dubbo.dto.MoonMallItemOrderDto;
import cn.com.bluemoon.moonmall.order.dubbo.service.MoonMallOrderService;
import cn.com.bluemoon.moonmall.order.dubbo.vo.MoonMallItemOrderVo;
import cn.com.bluemoon.service.ebusiness.api.OrderDubboService;
import cn.com.bluemoon.service.ebusiness.dto.AppointmentOrderDetailReqDto;
import cn.com.bluemoon.service.ebusiness.dto.AppointmentOrderDetailResDto;
import cn.com.bluemoon.service.ebusiness.dto.OrderListReqDto;
import cn.com.bluemoon.service.ebusiness.dto.OrderListResDto;
import cn.com.bluemoon.service.ebusiness.dto.WashOrderDetailReqDto;
import cn.com.bluemoon.service.ebusiness.dto.WashOrderDetailResDto;
import cn.com.bluemoon.service.hotel.api.HotelContractDubboService;
import cn.com.bluemoon.service.hotel.api.HotelPointsService;
import cn.com.bluemoon.wash.dubbo.dto.BaseOptDto;
import cn.com.bluemoon.wash.dubbo.dto.EnterpriseOrderQueryDto;
import cn.com.bluemoon.wash.dubbo.dto.EnterpriseSuiteDto;
import cn.com.bluemoon.wash.dubbo.service.EnterpriseOrderDubboService;
import cn.com.bluemoon.wash.dubbo.service.EnterpriseSuiteDubboService;
import cn.com.bluemoon.wash.dubbo.service.MallWashEnterpriseDubboService;
import cn.com.bluemoon.wash.dubbo.vo.EnterpriseOrderInfoVo;
import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSONObject;
import com.bluemoon.fastdfs.dubbo.BaseFileService;
import com.bluemoon.fastdfs.dubbo.result.SuperResult;
import com.bluemoon.fastdfs.dubbo.result.UploadResult;
import com.csair.b2c.cloud.test.dubbo.consumer.model.HotelWashCompanyInfo;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.google.common.collect.Lists;
import org.apache.commons.lang3.time.DateUtils;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.StreamUtils;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * Created on 2018/10/29.<br/>
 *
 * @author yudong
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DubboConsumerApplication.class)
public class DubboServiceTest {

    @Reference(version = "1.0.0", timeout = 60000)
    MoonMallItemService service;
    @Reference(version = "1.0.0", timeout = 60000)
    EnterpriseSuiteDubboService suiteDubboService;

    @Reference(version = "1.0.0", timeout = 6000)
    private UserTokenService tokenService;
    @Reference(version = "1.0.0", timeout = 50000)
    private MoonMallOrderService moonMallOrderService;
    @Reference(version = "1.0.0", timeout = 30000)
    private LogisticsDubboService logisticsDubboService;
    @Reference(version = "1.0.0", timeout = 30000)
    private EnterpriseOrderDubboService enterpriseOrderDubboService;
    @Reference(version = "1.0.0", timeout = 30000)
    private MallWashEnterpriseDubboService mallWashEnterpriseDubboService;
    @Reference(version = "1.0.0", timeout = 30000)
    private HotelContractDubboService contractDubboService;
    @Reference(version = "1.0.0", timeout = 30000)
    private CompanyUserDubboService userDubboService;
    @Reference(version = "1.0.0", timeout = 30000)
    private HotelPointsService hotelPointsService;
    @Reference(version = "1.0.0", timeout = 30000)
    private BaseFileService fastDFSClientService;

    @Reference(version = "1.0.0", timeout = 30000)
    private OrderDubboService orderDubboService;

    @Reference(version = "1.0.0", timeout = 30000, url = "dubbo://localhost:21888")
    private WashOrderService washOrderService;

    @Reference(version = "1.0.0", timeout = 30000)
    private UserService userService;


    static ExecutorService executorService = Executors.newCachedThreadPool();
    static ObjectMapper objectMapper = new ObjectMapper();

    static {
        objectMapper.setSerializationInclusion(JsonInclude.Include.ALWAYS);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.configure(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE, false);
        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
    }

    @org.junit.Test
    public void test14() throws Exception {
        List<String> list = Lists.newArrayList();
        list.add("TW17011614402627256032");
        list.add("TW18122716474821533401");
        Map<String, PayTypeInfoVo> map = washOrderService.getPayTypeInfosByOuterCodes(list);
        System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(map));
    }

    @org.junit.Test
    public void test13() throws Exception {
        WashOrderBaseInfoVo baseInfoVo = washOrderService.getWashOrderInfoByOuterCode("TW18122716474821533401");
        System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(baseInfoVo));
        UserInfoDto userInfoDto = userService.getUserInfoByUserId(baseInfoVo.getUserId());
        System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(userInfoDto));
        PayTypeInfoVo payTypeInfoVo = washOrderService.getPayTypeInfoByOuterCode("TW18122716474821533401");
        System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(payTypeInfoVo));

    }

    @org.junit.Test
    public void test123() throws Exception {
        AppointmentOrderDetailReqDto reqDto = new AppointmentOrderDetailReqDto();
        reqDto.setAppointmentOrderCode("Y190116162619685741");
        // reqDto.setWashOrderCode("TW190117090119985611");
        AppointmentOrderDetailResDto resDto = orderDubboService.getAppointmentOrderDetail(reqDto);
        System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(resDto));
    }

    @org.junit.Test
    public void test122() throws Exception {
        WashOrderDetailReqDto reqDto = new WashOrderDetailReqDto();
        reqDto.setWashOrderCode("TW18122716474821533401");

        WashOrderDetailResDto resDto = orderDubboService.getWashOrderDetail(reqDto);
        System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(resDto));

    }

    @org.junit.Test
    public void test121() throws Exception {
        OrderListReqDto orderListReqDto = new OrderListReqDto();
        orderListReqDto.setMobile("18826483964");
        orderListReqDto.setPastTimestamp(DateUtils.addMonths(new Date(), -6).getTime());

        orderListReqDto.setOrderNo("TW18122716474821533401");
        orderListReqDto.setOrderType(1);
        OrderListResDto orderListResDto = orderDubboService.getWashingOrderList(orderListReqDto);
        System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(orderListResDto));
        System.out.println("---");

        orderListReqDto.setOrderNo("Y190111101054527441");
        orderListReqDto.setOrderType(2);
        orderListResDto = orderDubboService.getWashingOrderList(orderListReqDto);
        System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(orderListResDto));
        System.out.println("---");

        orderListReqDto.setOrderNo("W190111132437844582");
        orderListReqDto.setOrderType(3);
        orderListResDto = orderDubboService.getWashingOrderList(orderListReqDto);
        System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(orderListResDto));
        System.out.println("---");

        orderListReqDto.setOrderNo("W190111132437844582");
        orderListReqDto.setOrderType(3);
        orderListResDto = orderDubboService.getWashingOrderList(orderListReqDto);
        System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(orderListResDto));
        System.out.println("---");
    }

    @org.junit.Test
    public void test12() throws Exception {
        OrderListReqDto orderListReqDto = new OrderListReqDto();
        orderListReqDto.setMobile("18826483964");
        orderListReqDto.setPastTimestamp(DateUtils.addMonths(new Date(), -6).getTime());

        OrderListResDto orderListResDto = orderDubboService.getWashingOrderList(orderListReqDto);
        System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(orderListResDto));
        System.out.println("---");

        orderListReqDto.setOrderType(1);
        orderListResDto = orderDubboService.getWashingOrderList(orderListReqDto);
        System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(orderListResDto));
        System.out.println("---");

        orderListReqDto.setOrderType(2);
        orderListResDto = orderDubboService.getWashingOrderList(orderListReqDto);
        System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(orderListResDto));
        System.out.println("---");

        orderListReqDto.setOrderType(3);
        orderListResDto = orderDubboService.getWashingOrderList(orderListReqDto);
        System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(orderListResDto));
    }

    @org.junit.Test
    public void test11() throws Exception {
        SuperResult superResult = fastDFSClientService.delete("group1/M00/5A/5B/wKgwcFw1YmyAfuQIAAKpJ8OhKA0127.jpg");
        System.out.println(JSONObject.toJSONString(superResult));
    }

    @org.junit.Test
    public void test10() throws Exception {

        List<byte[]> list = new ArrayList<>(5);

        for (int i = 1; i <= 5; i++) {
            String s = "C:\\Users\\yu\\Desktop\\测试图片-%s.jpg";
            File file = new File(String.format(s, i));
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] b = StreamUtils.copyToByteArray(fileInputStream);
            list.add(b);
        }
        List<Callable<UploadResult>> tasks = new ArrayList<>(5);
        for (byte[] bytes : list) {
            final byte[] bytes1 = bytes;
            Callable<UploadResult> callable = new Callable<UploadResult>() {
                @Override
                public UploadResult call() {
                    System.out.println(new Date());
                    long time = System.currentTimeMillis();
                    UploadResult result = fastDFSClientService.upload(bytes1, "test.jpg", "washingServiceMana", null);
                    System.out.println(System.currentTimeMillis() - time + "ms " + Thread.currentThread().getId());
                    return result;
                }
            };
            tasks.add(callable);
        }

        long start = System.currentTimeMillis();
        List<Future<UploadResult>> results = executorService.invokeAll(tasks);
        executorService.shutdown();
        executorService.awaitTermination(5, TimeUnit.SECONDS);
        long invocationTime = (System.currentTimeMillis() - start);
        System.out.println("Invocation time is " + invocationTime + " ms");

        for (Future<UploadResult> future : results) {
            UploadResult result = future.get();
            System.out.println(JSONObject.toJSONString(result));
            String s = result.getFileName();
            if (!result.getFileName().startsWith("/")) {
                s = "/" + s;
            }
            String fileName = result.getGroup() + s;
            SuperResult superResult = fastDFSClientService.delete(fileName);
            System.out.println(JSONObject.toJSONString(superResult));
        }

    }

    @org.junit.Test
    public void test9() throws Exception {

        List<byte[]> list = new ArrayList<>(5);

        for (int i = 1; i <= 5; i++) {
            String s = "C:\\Users\\yu\\Desktop\\测试图片-%s.jpg";
            File file = new File(String.format(s, i));
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] b = StreamUtils.copyToByteArray(fileInputStream);
            list.add(b);
        }
        long start = System.currentTimeMillis();
        List<UploadResult> results = new ArrayList<>();
        for (byte[] bytes : list) {
            long time = System.currentTimeMillis();
            results.add(fastDFSClientService.upload(bytes, "test.jpg", "washingServiceMana", null));
            System.out.println(System.currentTimeMillis() - time + "ms");
        }
        long invocationTime = (System.currentTimeMillis() - start);
        System.out.println("Invocation time is " + invocationTime + " ms");

        System.out.println(JSONObject.toJSONString(results));
        for (UploadResult result : results) {
            System.out.println(JSONObject.toJSONString(result));
            String s = result.getFileName();
            if (!result.getFileName().startsWith("/")) {
                s = "/" + s;
            }
            String fileName = result.getGroup() + s;
            SuperResult superResult = fastDFSClientService.delete(fileName);
            System.out.println(JSONObject.toJSONString(superResult));
        }

    }

    @org.junit.Test
    public void test8() throws Exception {
        System.out.println(userDubboService.closeUsers(Arrays.asList("80616269")));
    }

    @org.junit.Test
    public void test7() throws Exception {
        System.out.println(hotelPointsService.selectByPrimaryKey("180720135138756401"));
    }

    @org.junit.Test
    public void test6() throws Exception {

        String s = "{\"po\":{\"companyCode\":\"\",\"opName\":\"sysadmin\",\"opCode\":\"0\",\"opTime\":\"2018-11-27 12:44:07\",\"type\":\"PUBLIC_ENTERPRISE\",\"name\":\"地对地导弹股份公司\",\"shortName\":\"导弹\",\"provinceCode\":\"14\",\"province\":\"山西\",\"cityCode\":\"1402\",\"city\":\"大同\",\"countyCode\":\"140203\",\"county\":\"矿区\",\"address\":\"地对地导弹订单多多多多多多\",\"contactsName\":\"朱丽叶\",\"contactsPhone\":\"\",\"systemUserName\":\"80886269\",\"bankAccountName\":\"朱丽叶\",\"bankName\":\"中国工商银行广州五山分行\",\"bankAccount\":\"6222023602215322214\",\"remark\":\"地对地导弹\",\"headCode\":\"80546269\",\"headName\":\"梁煜东\",\"headPhone\":\"18826483963\"}}";

        HotelWashCompanyInfo po = JSONObject.toJavaObject(JSONObject.parseObject(s).getJSONObject("po"), HotelWashCompanyInfo.class);

        // 同步用户到联盟系统
        SyncCompanyUserDTO syncUserDTO = new SyncCompanyUserDTO();
        syncUserDTO.setLoginName(po.getSystemUserName());
        syncUserDTO.setPassword("123456");
        syncUserDTO.setName(po.getSystemUserName());
        syncUserDTO.setMobile(po.getContactsPhone());
        syncUserDTO.setCreateTime(new Date());
        syncUserDTO.setOpTime(new Date());
        syncUserDTO.setOpCode("sysadmin");
        syncUserDTO.setOpName("sysadmin");
        syncUserDTO.setCompanyId(po.getCompanyId());
        syncUserDTO.setCompanyName(po.getContactsName());
        syncUserDTO.setEnabled(true);
        syncUserDTO.setRemarks("酒店洗衣合作机构账号");
        syncUserDTO.setIsLogined(1);
        syncUserDTO.setDelFlag("0");

        try {
            // 新增合作机构时用户填写的系统用户名有可能已经存在,那么此方法就会同步失败并抛出异常
            userDubboService.syncCompanyUser(syncUserDTO);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void test5() throws Exception {
        String json = "{\"criteria\":{\"_entity\":\"cn.com.bluemoon.common.hotel.po.HotelWashContractInfo\",\"_tableName\":\"hotel_wash_company_info\",\"_orderby\":[{\"_property\":\"opTime\",\"_sort\":\"desc\"},{\"_property\":\"companyCode\",\"_sort\":\"desc\"}],\"_expr\":[{\"_value\":\"\",\"_op\":\"like\",\"_likeRule\":\"all\",\"_property\":\"companyCode\"},{\"_value\":\"\",\"_op\":\"=\",\"_property\":\"type\"},{\"_value\":\"\",\"_op\":\"=\",\"_property\":\"status\"},{\"_value\":\"\",\"_op\":\"like\",\"_likeRule\":\"all\",\"_property\":\"name\"},{\"_value\":\"\",\"_op\":\"like\",\"_likeRule\":\"all\",\"_property\":\"shortName\"}]},\"pageIndex\":0,\"pageSize\":20,\"sortField\":\"\",\"sortOrder\":\"\"}";
        System.out.println(JSONObject.toJSONString(contractDubboService.getContractInfo(json)));
    }

    @org.junit.Test
    public void test4() throws Exception {
        String orderCode = "C18110709115036950942";
        String orderStatus = "WAIT_BUYER_CONFIRM_GOODS";
        BaseOptDto dto = new BaseOptDto();
        dto.setOpCode("0");
        dto.setOpName("sysadmin");
        dto.setOpTime(new Date());
        enterpriseOrderDubboService.updateOrderStatus(orderCode, orderStatus, dto);
    }

    @org.junit.Test
    public void test3() throws Exception {
        EnterpriseOrderQueryDto dto = new EnterpriseOrderQueryDto();
        dto.setOrderCode("");
        dto.setUserName("");
        dto.setUserId("");
        dto.setContactPhone("");
        dto.setBranchCode("");
        dto.setTimeType("");
        dto.setPayType("");
        dto.setOrderStatus("");
        dto.setEnterpriseCode("");
        dto.setPageSize(0);
        dto.setPageIndex(20);
        dto.setSort("");
        dto.setOrderBy("");

        List<EnterpriseOrderInfoVo> orderInfoVos = enterpriseOrderDubboService.getOrderInfoPage(dto);
        System.out.println(JSONObject.toJSONString(orderInfoVos, true));
    }

    @org.junit.Test
    public void test2() throws Exception {
        List<LogisticsModelDto> logisticsModelDtoList = logisticsDubboService.
                findLogistics("C18110510593118797242", "ITEM_ORDER", false, "ITEM");
        System.out.println(JSONObject.toJSONString(logisticsModelDtoList, true));
    }

    @org.junit.Test
    public void test1() throws Exception {
        MoonMallItemOrderDto moonMallItemOrderDto = new MoonMallItemOrderDto();
        moonMallItemOrderDto.setOrderType(1);
        moonMallItemOrderDto.setPageSize(20);
        moonMallItemOrderDto.setUserId("U18101013373016332641");
        ArrayList<String> orderStatus = new ArrayList<>();
        orderStatus.add("WAIT_BUYER_PAY");
        moonMallItemOrderDto.setStatus(orderStatus);
        List<MoonMallItemOrderVo> itemOrderList = moonMallOrderService.getItemOrderListWithPage(moonMallItemOrderDto);

        //String userId = tokenService.getUserIdByLongToken("f0b4694be3a01273d9fac57736b4c005");
        GetSuiteOrderDetailsDto suiteOrderDetailsDto = moonMallOrderService.getSuiteOrderDetails("C18110614170806610561", "U18101013373016332641");
        System.out.println(suiteOrderDetailsDto);
    }

    @org.junit.Test
    public void test() {

        EnterpriseSuiteDto enterpriseSuiteDto = new EnterpriseSuiteDto();
        enterpriseSuiteDto.setPageIndex(0);
        enterpriseSuiteDto.setPageSize(10);

        System.out.println(JSONObject.toJSONString(suiteDubboService.getSuites(enterpriseSuiteDto), true));


        MallProductDto dto = new MallProductDto();
        dto.setPageIndex(0);
        dto.setPageSize(5);

        dto.setProductSku("");
        dto.setProductName("");

        Object productDtos = service.getProducts(dto);
        System.out.println(JSONObject.toJSONString(productDtos, true));

    }

}
