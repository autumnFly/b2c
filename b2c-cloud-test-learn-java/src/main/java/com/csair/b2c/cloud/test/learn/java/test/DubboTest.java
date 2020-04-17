package com.csair.b2c.cloud.test.learn.java.test;

import cn.com.bluemoon.file.dubbo.service.ImageService;
import cn.com.bluemoon.mall.activity.dubbo.dto.UserCouponPackageManageDto;
import cn.com.bluemoon.mall.activity.dubbo.service.UserCouponPackageManageService;
import cn.com.bluemoon.mall.order.dubbo.service.MallWashOrderService;
import cn.com.bluemoon.mall.user.dubbo.dto.UserInfoDto;
import cn.com.bluemoon.mall.user.dubbo.enums.MatchType;
import cn.com.bluemoon.mall.user.dubbo.service.UserAddressService;
import cn.com.bluemoon.mall.user.dubbo.service.UserService;
import cn.com.bluemoon.mallwash.order.dubbo.service.WashOrderService;
import cn.com.bluemoon.mallwash.order.dubbo.vo.WashOrderDetailVo;
import cn.com.bluemoon.service.common.service.RegionService;
import cn.com.bluemoon.service.customizingorder.api.CustomizingOrderDubboService;
import cn.com.bluemoon.service.emp.api.MapService;
import cn.com.bluemoon.service.mallcrm.service.message.MesssagePushService;
import cn.com.bluemoon.service.station.api.DubboCommonService;
import cn.com.bluemoon.service.user.service.SsoService;
import cn.com.bluemoon.training.dubbo.api.CourseBaseApiService;
import cn.com.bluemoon.wash.dubbo.service.WashLevelTypeService;
import cn.com.bluemoon.wash.dubbo.service.WashPriceManageService;
import com.bluemoon.kafka.dubbo.api.MessageQueueService;
import com.bluemoon.pf.map.dto.AddressDto;
import com.bluemoon.pf.map.enums.ApiTypeEnums;
import com.bluemoon.pf.map.sdk.dto.Coordinates;
import com.bluemoon.pf.map.sdk.dto.ResultBean;
import com.bluemoon.pf.map.sdk.vo.AddressVo;
import com.bluemoon.pf.map.service.BasicMapService;
import com.bluemoon.proxy.service.sms.SmsService;
import com.csair.b2c.cloud.test.dubbo.provider.api.service.UserDubboService;
import com.csair.b2c.cloud.test.learn.java.utils.DubboUtils;
import com.csair.b2c.cloud.test.learn.java.utils.OMUtils;
import net.sf.json.JSONObject;
import org.apache.commons.lang3.time.DateUtils;
import static org.javamaster.b2c.config.BlueMoonConsts.Server.SERVER_1;
import static org.javamaster.b2c.config.BlueMoonConsts.Server.SERVER_18;
import static org.javamaster.b2c.config.BlueMoonConsts.Server.SERVER_3;
import org.junit.AfterClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @author yudong
 * @date 2019/1/21
 */
public class DubboTest {

    @AfterClass
    public static void exit() {
        System.exit(0);
    }

    @Test
    public void test() {
        UserService service = DubboUtils.getService(UserService.class, "1.0.0");
        Object resObj = service.getUserInfoByUserId("U18082410053572785731");
        System.out.println(OMUtils.writeValueAsString(resObj, true));
        resObj = service.getUserBaseByMobile("18826483966");
        System.out.println(OMUtils.writeValueAsString(resObj, true));
        UserInfoDto userInfoDto = new UserInfoDto();
        userInfoDto.setNickName("188****3966");
        resObj = service.getUserInfoByPart(userInfoDto);
        System.out.println(OMUtils.writeValueAsString(resObj, true));
    }

    @Test
    public void test1() {
        UserService service = DubboUtils.getService(UserService.class, "1.0.0", SERVER_1);
        Object object = service.getUserInfoByUserId("U18110814354169025621");
        System.out.println(OMUtils.writeValueAsString(object));
        object = service.getUserBaseByMobile("18826483965");
        System.out.println(OMUtils.writeValueAsString(object));
        object = service.getUserBaseByMobile("18826483966");
        System.out.println(OMUtils.writeValueAsString(object));
    }

    @Test
    public void test2() throws Exception {
        SsoService service = DubboUtils.getService(SsoService.class, null);
        JSONObject object = new JSONObject();
        object.put("mobile", "18826483964");
        Object resObj = service.getUserInfoByMobile(object);
        System.out.println(OMUtils.writeValueAsString(resObj, true));
    }

    @Test
    public void test3() throws Exception {
        SsoService service = DubboUtils.getService(SsoService.class, null);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("token", "21fe6aadeb3561241e7e6aca60b5a757");
        Object resObj = service.checkToken(jsonObject);
        System.out.println(OMUtils.writeValueAsString(resObj, true));
        jsonObject.put("token", "23fe6aadeb3561241e7e6aca60b5a757");
        resObj = service.checkToken(jsonObject);
        System.out.println(OMUtils.writeValueAsString(resObj, true));
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("account", "80546269");
        resObj = service.getUserInfo(jsonObj);
        System.out.println(resObj);
    }

    @Test
    public void test4() throws Exception {
        SsoService service = DubboUtils.getService(SsoService.class, null);
        JSONObject reqJsonObj = new JSONObject();
        reqJsonObj.put("token", "21fe6aadeb3561241e7e6aca60b5a757");
        String string = service.getUserInfoByToken(reqJsonObj);
        JSONObject resObj = JSONObject.fromObject(string);
        System.out.println(OMUtils.writeValueAsString(resObj, true));
    }

    @Test
    public void test5() {
        Object resObj = DubboUtils.invoke(UserService.class
                , "getUserInfoByUserId", Arrays.asList("U18110814354169025621")
                , "1.0.0");
        System.out.println(OMUtils.writeValueAsString(resObj, true));
    }

    @Test
    public void test6() {
        UserDubboService service = DubboUtils.getService(UserDubboService.class, "1.0.0", "127.0.0.1:21899");
        Object resObj = service.queryAll();
        System.out.println(OMUtils.writeValueAsString(resObj, true));
    }

    @Test
    public void test8() {
        CourseBaseApiService service = DubboUtils.getService(CourseBaseApiService.class,
                null, "192.168.240.57:20881");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("userCodeList", Arrays.asList(80516445, 80484450));
        jsonObject.put("courseName", "至尊产品培训编辑");
        Date start = new Calendar.Builder().setDate(2019, Calendar.APRIL, 1).build().getTime();
        Date end = DateUtils.addDays(start, 5);
        jsonObject.put("startTime", start.getTime());
        jsonObject.put("endTime", end.getTime());
        Object resObj = service.getStudentSignListByParams(jsonObject);
        System.out.println(OMUtils.writeValueAsString(resObj, true));
    }

    @Test
    public void test9() {
        ImageService service = DubboUtils.getService(ImageService.class, "1.0.0");
        Object resObj = service.getImageVo("group1//M00/02/D7/wKjwDlzko0WASMxbAABOTuQ2LwA962.jpg", "fdfs");
        System.out.println(OMUtils.writeValueAsString(resObj, true));
    }

    @Test
    public void test10() {
        UserService service = DubboUtils.getService(UserService.class, "1.0.0-yudong");
        Object resObj = service.getUserInfoByBlurMobile("3966", 1, 10, MatchType.BACK);
        System.out.println(OMUtils.writeValueAsString(resObj, true));
    }

    @Test
    public void test11() {
        WashPriceManageService service = DubboUtils.getService(WashPriceManageService.class);
        Object resObj = service.getWashPriceManageByWashCode("65476543");
        System.out.println(OMUtils.writeValueAsString(resObj, true));
    }

    @Test
    public void test12() {
        MallWashOrderService service = DubboUtils.getService(MallWashOrderService.class, "1.0.0-yudong");
        Object resObj = service.createMallOrderInfo(null);
        System.out.println(OMUtils.writeValueAsString(resObj, true));
    }

    @Test
    public void test13() {
        WashOrderService service = DubboUtils.getService(WashOrderService.class, "1.0.0-yudong");
        Object resObj = service.getWashOrderPayInfos("U2003031940286000001");
        System.out.println(OMUtils.writeValueAsString(resObj, true));
    }

    @Test
    public void test14() {
        UserAddressService service = DubboUtils.getService(UserAddressService.class, "1.0.0");
        Object resObj = service.getUserAddress("U190701150946235921", "", null);
        System.out.println(OMUtils.writeValueAsString(resObj, true));
    }

    @Test
    public void test15() throws Exception {
        RegionService service = DubboUtils.getService(RegionService.class, null);
        Object resObj = service.selectRegionByCodeAndType("4401", "county");
        System.out.println(OMUtils.writeValueAsString(resObj, true));
    }

    @Test
    public void test16() {
        WashLevelTypeService service = DubboUtils.getService(WashLevelTypeService.class, "1.0.0");
        Object resObj = service.getMallWashLevelTypeByParentId("0");
        System.out.println(OMUtils.writeValueAsString(resObj, true));
    }

    @Test
    public void test17() throws Exception {
        MesssagePushService service = DubboUtils.getService(MesssagePushService.class, null);
        JSONObject json = new JSONObject();
        json.put("desc", "您有新的待派单洗衣订单，请及时处理！");     //推送内容描述
        json.put("staffNum", "80546269"); //要推送的人员编码
        json.put("title", "收衣派单信息提醒"); //推送标题

        JSONObject msg = new JSONObject(); //推送详细对象
        msg.put("source", "washingService"); //消息来源
        msg.put("msgId", "");        //具体的消息ID，可不填
        msg.put("view", "receive_clothes_manager"); //要推送的消息模块，与菜单代码匹配     如果是H5页面则    msg.put("view","h5"；
        msg.put("url", "");  //如果上面的view等于h5，则url项必填，写入的是菜单的url
        json.put("msg", msg);
        Object resObj = service.singleMsgPush(json);
        System.out.println(OMUtils.writeValueAsString(resObj, true));
    }

    @Test
    public void test18() throws Exception {
        RegionService service = DubboUtils.getService(RegionService.class, null, SERVER_18);
        Object resObj = service.getPointInfo("广东广州增城区凤凰岛一街凤凰苑");
        System.out.println(OMUtils.writeValueAsString(resObj, true));
        System.out.println(OMUtils.writeValueAsString(service.getAddressByGPS(0.0, 23.14365, 113.56129), true));
    }

    @Test
    public void test19() {
        DubboCommonService service = DubboUtils.getService(DubboCommonService.class, null, "127.0.0.1:20880");
        Object resObj = service.findWashCollectPointsArea("44", "4401", "440106", "", null);
        Object resObj1 = service.findWashCollectPointsArea("44", "4401", "440106", "", "五山路中公教育大厦");
        System.out.println(OMUtils.writeValueAsString(resObj, true));
        System.out.println(OMUtils.writeValueAsString(resObj1, true));
    }

    @Test
    public void test20() {

        WashPriceManageService service = DubboUtils.getService(WashPriceManageService.class, "1.0.0");
        Object resObj = service.getWashPriceManageByWashCode("010308");
        Object resObj1 = service.getWashPriceManageByWashCode("010215");
        System.out.println(OMUtils.writeValueAsString(resObj, true));
        System.out.println(OMUtils.writeValueAsString(resObj1, true));
    }

    @Test
    public void test21() {
        SmsService service = DubboUtils.getService(SmsService.class, "2.0.0");
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("mobileNo", "18826483963");
        jsonObj.put("content", "hello world");
        jsonObj.put("myAccount", "xyzx");
        jsonObj.put("myProjectName", "洗衣中心");
        Object resObj = service.send(jsonObj);
        System.out.println(OMUtils.writeValueAsString(resObj, true));
    }

    @Test
    public void test22() {
        WashOrderService service = DubboUtils.getService(WashOrderService.class, "1.0.0", "127.0.0.1:21888");
        Object resObj = service.updatePayOperationType("U190701150946235921", "TW191126114108669852", 1);
        System.out.println(OMUtils.writeValueAsString(resObj, true));
    }

    @Test
    public void test23() {
        CustomizingOrderDubboService service = DubboUtils.getService(CustomizingOrderDubboService.class, "1.0.0");
        Object resObj = service.findCustomizingOrderDetails("TW191128093529703502");
        System.out.println(OMUtils.writeValueAsString(resObj, true));
    }

    @Test
    public void test24() {
        UserCouponPackageManageService service = DubboUtils.getService(UserCouponPackageManageService.class, "1.0.0");
        UserCouponPackageManageDto dto = new UserCouponPackageManageDto();
        dto.setPhone("18826483963");
        Object resObj = service.getUserCouponPackageManagePage(dto);
        System.out.println(OMUtils.writeValueAsString(resObj, true));
    }

    @Test
    public void test25() {
        DubboCommonService service = DubboUtils.getService(DubboCommonService.class);
        Object resObj = service.findWashCollectPointsArea("44", "4401", "4440106", "", "五山路261号");
        System.out.println(OMUtils.writeValueAsString(resObj, true));
    }

    @Test
    public void test26() {
        BasicMapService service = DubboUtils.getService(BasicMapService.class, "1.0.0");
        AddressDto addressDto = new AddressDto();
        addressDto.setAddress("广东省广州市天河区五山路261号中公教育大厦");
        ResultBean<AddressVo> resObj = service.geocoder(addressDto, ApiTypeEnums.amap);
        System.out.println(OMUtils.writeValueAsString(resObj, true));
    }

    @Test
    public void test27() throws Exception {
        BasicMapService service = DubboUtils.getService(BasicMapService.class, "1.0.0");
        Coordinates coordinates = new Coordinates();
        // coordinates.setLng(113.346108960161);
        // coordinates.setLat(23.1473462711974);
        coordinates.setLng(113.346380);
        coordinates.setLat(23.147320);
        Object resObj = service.regeocoder(coordinates, ApiTypeEnums.amap);
        System.out.println(OMUtils.writeValueAsString(resObj, true));
    }

    @Test
    public void test28() throws Exception {
        MapService mapService = DubboUtils.getService(MapService.class);
        Object resObj = mapService.getAddressByPoint(123.525270, 42.045748);
        System.out.println(OMUtils.writeValueAsString(resObj, true));
    }

    @Test
    public void test29() throws Exception {
        MessageQueueService service = DubboUtils.getService(MessageQueueService.class,"1.3.6");
        JSONObject json = new JSONObject();
        json.put("clothesCode", "20200407hd001");
        json.put("reportCode", "2004070003");
        Object resObj = service.sendMessage("clothes_conmunication_notice", json.toString(), true);
        System.out.println(OMUtils.writeValueAsString(resObj, true));
    }

}
