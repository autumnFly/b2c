package com.csair.b2c.cloud.test.dubbo.consumer;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.csair.b2c.cloud.test.dubbo.consumer.model.ExportPaybillVo;
import com.csair.b2c.cloud.test.dubbo.consumer.service.PaybillZip;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created on 2018/12/6.<br/>
 *
 * @author yudong
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DubboConsumerApplication.class)
public class PaybillZipTest {
    @Autowired
    private ApplicationContext context;

    @Test
    public void test() throws Exception {

        File file = ResourceUtils.getFile("classpath:paybillInfo.json");
        InputStream in = new FileInputStream(file);
        byte[] bytes = new byte[in.available()];
        in.read(bytes);
        String string = new String(bytes, "UTF-8");
        in.close();

        Map<String, List<ExportPaybillVo>> exportMap = new HashMap<>();

        Map<String, JSONArray> map = JSONObject.parseObject(string, Map.class);
        for (Map.Entry<String, JSONArray> stringJSONArrayEntry : map.entrySet()) {
            List<ExportPaybillVo> list = JSONObject.parseObject(stringJSONArrayEntry.getValue().toJSONString()
                    , new TypeReference<List<ExportPaybillVo>>() {
                    });
            exportMap.put(stringJSONArrayEntry.getKey(), list);
        }

        PaybillZip paybillZip = context.getBean(PaybillZip.class, exportMap);

        byte[] bytes1 = paybillZip.createPaybillZip();
        OutputStream outputStream = new FileOutputStream("F:\\paybill.zip");
        outputStream.write(bytes1);
        outputStream.close();
    }
}
