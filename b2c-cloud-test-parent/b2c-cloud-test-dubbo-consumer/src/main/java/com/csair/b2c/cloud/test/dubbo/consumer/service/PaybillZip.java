package com.csair.b2c.cloud.test.dubbo.consumer.service;

import com.csair.b2c.cloud.test.dubbo.consumer.model.ExportPaybillVo;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Created on 2018/12/6.<br/>
 *
 * @author yudong
 */
@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PaybillZip {

    @Autowired
    private ApplicationContext context;

    private Map<String, List<ExportPaybillVo>> exportMap;

    public PaybillZip(Map<String, List<ExportPaybillVo>> exportMap) {
        this.exportMap = exportMap;
    }

    public byte[] createPaybillZip() throws Exception {
        try (ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
             ZipOutputStream zipOutputStream = new ZipOutputStream(outputStream)) {

            for (Map.Entry<String, List<ExportPaybillVo>> entry : exportMap.entrySet()) {

                List<ExportPaybillVo> exportPaybillVOS = entry.getValue();
                HSSFWorkbook workbook = context.getBean(PaybillExcel.class, exportPaybillVOS).createPaybillExcel();
                ZipEntry zipEntry = new ZipEntry(entry.getKey() + ".xls");
                zipOutputStream.putNextEntry(zipEntry);
                workbook.write(zipOutputStream);
                zipOutputStream.closeEntry();
                workbook.close();
            }

            zipOutputStream.finish();
            outputStream.flush();
            byte[] bytes = outputStream.toByteArray();

            return bytes;
        }
    }

}
