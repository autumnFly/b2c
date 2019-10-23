package com.csair.b2c.cloud.test.dubbo.bluemoon.consumer;

import cn.com.bluemoon.service.common.service.RegionService;
import cn.com.bluemoon.service.user.service.SsoService;
import com.alibaba.dubbo.config.annotation.Reference;
import com.csair.b2c.cloud.test.dubbo.bluemoon.consumer.utils.Md5Utils;
import net.sf.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created on 2018/10/12.<br/>
 *
 * @author yudong
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DubboBluemoonConsumerApplication.class)
public class DubboBluemoonConsumerTest {

    @Reference
    private SsoService ssoService;

    @Reference
    private RegionService regionService;

    @Test
    public void testLogin() throws Exception {
        JSONObject jsonObject = new JSONObject();
        jsonObject.element("account", "sysadmin");
        String password = "qq123123";
        String pwd = Md5Utils.md5(password).toLowerCase();
        jsonObject.element("password", pwd);
        String s = ssoService.ssoLogin(jsonObject);
        System.out.println(s);
    }
    @Test
    public void testGetRegin() throws Exception {
        JSONObject jsonObject = regionService.getAddressByGPS(999.0, 999.0, 29.0);
        System.out.println(com.alibaba.fastjson.JSONObject.toJSONString(jsonObject,false));
    }
}
