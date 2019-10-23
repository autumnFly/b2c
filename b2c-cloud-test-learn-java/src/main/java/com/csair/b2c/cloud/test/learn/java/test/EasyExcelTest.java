package com.csair.b2c.cloud.test.learn.java.test;

import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.metadata.TableStyle;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.csair.b2c.cloud.test.learn.java.easyexcel.QuestionAnalysisListener;
import com.csair.b2c.cloud.test.learn.java.model.QuestionReadVo;
import com.csair.b2c.cloud.test.learn.java.model.QuestionWriteVo;
import com.google.common.collect.Lists;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.junit.Test;
import org.springframework.beans.BeanUtils;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

/**
 * @author yudong
 * @date 2019/5/9
 */
public class EasyExcelTest {
    @Test
    public void testRead() throws Exception {
        List<QuestionReadVo> questionReadVos = read();
        System.out.println(questionReadVos);
    }

    @Test
    public void testWrite() throws Exception {
        List<QuestionReadVo> questionReadVos = read();
        File file = ResourceUtils.getFile("classpath:excel/question-20190523.xls");
        file = new File(file.getParentFile(), "question-tmp.xlsx");
        if (file.exists()) {
            file.delete();
        }
        List<QuestionWriteVo> questionWriteVos = Lists.transform(questionReadVos, questionReadVo -> {
            QuestionWriteVo writeVo = new QuestionWriteVo();
            BeanUtils.copyProperties(questionReadVo, writeVo);
            return writeVo;
        });
        ExcelWriter excelWriter = new ExcelWriter(new FileOutputStream(file), ExcelTypeEnum.XLSX, true);
        Sheet sheet = new Sheet(0, 1, QuestionWriteVo.class);
        TableStyle tableStyle = new TableStyle();
        tableStyle.setTableHeadBackGroundColor(IndexedColors.BLUE_GREY);
        // Font font = new Font();
        // font.setFontName("宋体");
        // tableStyle.setTableHeadFont(font);
        tableStyle.setTableContentBackGroundColor(IndexedColors.GREY_25_PERCENT);
        sheet.setTableStyle(tableStyle);
        excelWriter.write(questionWriteVos, sheet);
        excelWriter.finish();
    }


    private static <T> List<T> read() throws Exception {
        File file = ResourceUtils.getFile("classpath:excel/question-20190523.xls");
        QuestionAnalysisListener analysisListener = new QuestionAnalysisListener();
        ExcelReader excelReader = new ExcelReader(new FileInputStream(file), ExcelTypeEnum.XLS, null,
                analysisListener, true);
        for (Sheet sheet : excelReader.getSheets()) {
            sheet.setClazz(QuestionReadVo.class);
            sheet.setHeadLineMun(2);
            excelReader.read(sheet);
        }
        excelReader.finish();
        return analysisListener.getQuestionVos();
    }
}
