package com.csair.b2c.cloud.test.learn.java.xml;

import org.junit.Test;
import org.springframework.util.ResourceUtils;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSOutput;
import org.w3c.dom.ls.LSSerializer;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;

/**
 * @author yudong
 * @date 2019/5/21
 */
public class DomTest {
    private static DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

    @Test
    public void test() throws Exception {
        DocumentBuilder documentBuilder = factory.newDocumentBuilder();
        File file = ResourceUtils.getFile("classpath:dubbo-provider.xml");
        Document document = documentBuilder.parse(file);
        Element rootElement = document.getDocumentElement();
        NodeList nodeList = rootElement.getChildNodes();
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node instanceof Element) {
                if (node.getNodeName().equals("dubbo:service")) {
                    if (((Element) node).getAttribute("interface").trim().equals("cn.com.bluemoon.service.customermanage.api.OrderDubboForCustomerManageService")) {
                        ((Element) node).setAttribute("version", "1.0.0-yudong");
                    }
                }
            }
        }
        System.out.println("---");

        Element newEle = document.createElementNS("http://code.alibabatech.com/schema/dubbo", "dubbo:monitor");
        rootElement.appendChild(newEle);

        DOMImplementation domImplementation = document.getImplementation();
        DOMImplementationLS domImplementationLS = (DOMImplementationLS) domImplementation.getFeature("LS", "3.0");
        LSSerializer lsSerializer = domImplementationLS.createLSSerializer();
        // lsSerializer.getDomConfig().setParameter("format-pretty-print", true);
        String xmlStr = lsSerializer.writeToString(document);
        // xml写出为字符串
        System.out.println(xmlStr);

        LSOutput lsOutput = domImplementationLS.createLSOutput();
        lsOutput.setEncoding(StandardCharsets.UTF_8.name());
        lsOutput.setCharacterStream(new FileWriter(file));
        // xml写出到文件
        lsSerializer.write(document, lsOutput);


    }
}
