package com.csair.b2c.cloud.test.dubbo.consumer;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.csair.b2c.cloud.test.dubbo.consumer.model.ExportPaybillVo;
import com.csair.b2c.cloud.test.dubbo.consumer.model.ExportSettlementVo;
import com.csair.b2c.cloud.test.dubbo.consumer.model.ExportSubSettlementVo;
import com.csair.b2c.cloud.test.dubbo.consumer.service.PaybillZip;
import com.csair.b2c.cloud.test.dubbo.consumer.service.SettlementExcel;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
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
import java.util.List;

/**
 * Created on 2018/12/6.<br/>
 *
 * @author yudong
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DubboConsumerApplication.class)
public class SettlementExcelTest {

    @Autowired
    private ApplicationContext context;

    @Test
    public void test() throws Exception {

        File file = ResourceUtils.getFile("classpath:vo.json");
        InputStream in = new FileInputStream(file);
        byte[] bytes = new byte[in.available()];
        in.read(bytes);
        String string = new String(bytes, "UTF-8");
        in.close();

        File file1 = ResourceUtils.getFile("classpath:subvo.json");
        InputStream in1 = new FileInputStream(file1);
        byte[] bytes1 = new byte[in1.available()];
        in1.read(bytes1);
        String string1 = new String(bytes1, "UTF-8");
        in1.close();

        SettlementExcel settlementExcel = context.getBean(SettlementExcel.class
                , JSONObject.parseObject(string, ExportSettlementVo.class)
                , JSONObject.parseObject(string1, new TypeReference<List<ExportSubSettlementVo>>() {
                }));


        HSSFWorkbook workbook = settlementExcel.createSettleExcel();
        OutputStream outputStream = new FileOutputStream("F:\\settlement.xls");
        workbook.write(outputStream);
        outputStream.close();
    }
}
