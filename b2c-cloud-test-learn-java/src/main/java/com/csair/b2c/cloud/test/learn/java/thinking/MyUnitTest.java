package com.csair.b2c.cloud.test.learn.java.thinking;


import com.itextpdf.text.pdf.PdfReader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.junit.Test;
import org.springframework.util.ResourceUtils;

import java.net.URL;
import java.util.List;

/**
 * Created on 2018/12/26.<br/>
 *
 * @author yudong
 */
public class MyUnitTest {

    @UnitTest
    public void test() throws Exception {
        URL url = new URL("https://tmallapi.bluemoon.com.cn/img/group1/M00/02/DF/wKjwDVzBZqGEF-3aAAAAAF6QGts902.pdf");
        PDDocument document = PDDocument.load(url);
        List<PDPage> pages = document.getDocumentCatalog().getAllPages();
        System.out.println("pdf文件的总页数为:" + pages.size());
    }

    @UnitTest
    public void test1() throws Exception {
        PdfReader pdfReader = new PdfReader(ResourceUtils.getFile("classpath:正则表达式入门.pdf").getAbsolutePath());
        System.out.println(pdfReader.getNumberOfPages());
        System.out.println(pdfReader.getInfo());

    }

}
