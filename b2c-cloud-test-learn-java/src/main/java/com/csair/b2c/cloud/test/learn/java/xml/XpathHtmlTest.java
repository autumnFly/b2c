package com.csair.b2c.cloud.test.learn.java.xml;

import lombok.extern.slf4j.Slf4j;
import org.htmlcleaner.CleanerProperties;
import org.htmlcleaner.HtmlCleaner;
import org.htmlcleaner.JDomSerializer;
import org.htmlcleaner.TagNode;
import org.jdom.Document;
import org.junit.Test;
import org.springframework.util.ResourceUtils;
import org.springframework.util.StreamUtils;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.Charset;

/**
 * @author yudong
 * @date 2019/5/21
 */
@Slf4j
public class XpathHtmlTest {

    @Test
    public void test() throws Exception {
        XPath xPath = XpathTest.xPathFactory.newXPath();

        File file = ResourceUtils.getFile("classpath:business.html");
        String html = StreamUtils.copyToString(new FileInputStream(file), Charset.defaultCharset());
        HtmlCleaner cleaner = new HtmlCleaner();
        CleanerProperties props = cleaner.getProperties();
        TagNode tagNode = cleaner.clean(html);
        Document document = new JDomSerializer(props, true).createJDom(tagNode);

        NodeList nodeList = (NodeList) xPath.evaluate("/html/body/div[1]/fieldset/div[2]/div/div[2]/div[4]/div[2]/div/table/tbody/tr/td[3]/div", document, XPathConstants.NODESET);
        for (int i = 0; i < nodeList.getLength(); i++) {
            Element element = ((Element) nodeList.item(i));
            log.info("{},{}", element.getTagName(), element.getAttribute("id"));
        }

    }

}
