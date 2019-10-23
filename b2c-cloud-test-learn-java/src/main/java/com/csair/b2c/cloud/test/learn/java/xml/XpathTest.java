package com.csair.b2c.cloud.test.learn.java.xml;

import org.junit.Test;
import org.springframework.util.ResourceUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import java.io.File;

/**
 * @author yudong
 * @date 2019/5/21
 */
public class XpathTest {
    private static DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    private static XPathFactory xPathFactory = XPathFactory.newInstance();

    @Test
    public void test() throws Exception {
        DocumentBuilder documentBuilder = factory.newDocumentBuilder();
        File file = ResourceUtils.getFile("classpath:dubbo-provider.xml");
        Document document = documentBuilder.parse(file);
        Element rootEle = document.getDocumentElement();

        XPath xPath = xPathFactory.newXPath();

        // 选取所有property节点
        NodeList nodeList = (NodeList) xPath.evaluate("//property", rootEle, XPathConstants.NODESET);
        for (int i = 0; i < nodeList.getLength(); i++) {
            Element element = ((Element) nodeList.item(i));
            System.out.println(element.getAttribute("name"));
        }
        System.out.println("---");

        // 选取根节点
        Element element = (Element) xPath.evaluate("/beans", rootEle, XPathConstants.NODE);
        System.out.println(element.getAttribute("default-lazy-init"));
        System.out.println("---");

        // 从根节点开始选取元素
        Element element1 = (Element) xPath.evaluate("/beans/application", rootEle, XPathConstants.NODE);
        System.out.println(element1.getAttribute("name"));
        System.out.println("---");

        // 直接取name属性的值
        String value = (String) xPath.evaluate("/beans/application/@name", rootEle, XPathConstants.STRING);
        System.out.println(value);
        System.out.println("---");

        // 从根节点开始选取具有属性interface且值为 cn.com.bluemoon.service.customermanage.api.OrderDubboForCustomerManageService的元素
        Element element2 = (Element) xPath.evaluate("/beans/service[@interface=' cn.com.bluemoon.service.customermanage.api.OrderDubboForCustomerManageService']", rootEle, XPathConstants.NODE);
        System.out.println(element2.getAttribute("ref"));
        System.out.println("---");


        // 选取所有具有timeout属性的节点
        NodeList nodeList1 = (NodeList) xPath.evaluate("//*[@timeout]", rootEle, XPathConstants.NODESET);
        for (int i = 0; i < nodeList1.getLength(); i++) {
            Element element3 = ((Element) nodeList1.item(i));
            System.out.println(element3.getAttribute("id"));
        }
        System.out.println("---");


        // 对reference元素的timeout属性求和
        Number number = (Number) xPath.evaluate("sum(/beans/reference/@timeout)", rootEle, XPathConstants.NUMBER);
        System.out.println(number.intValue());
        System.out.println("---");

    }
}
