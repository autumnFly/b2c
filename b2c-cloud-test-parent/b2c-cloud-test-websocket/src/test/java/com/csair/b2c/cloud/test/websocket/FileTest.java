package com.csair.b2c.cloud.test.websocket;

import java.net.HttpURLConnection;
import java.net.Inet4Address;
import java.net.Socket;
import java.net.URL;
import java.nio.file.Paths;
import java.text.MessageFormat;
import java.util.Date;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class FileTest {
	public static void main(String[] args) {
		try {

			Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder()
					.parse(Paths
							.get("D:\\b2c\\b2c-cloud-test-parent\\b2c-cloud-test-mybatis\\src\\main\\resources\\config.xml")
							.toFile());
			System.out.println(doc.getNamespaceURI());
			Element root = doc.getDocumentElement();
			Element element = (Element) root.getElementsByTagName("setting").item(0);
			System.out.println(element.getAttribute("name"));

			String string = XPathFactory.newInstance().newXPath().evaluate("/configuration/settings/setting[1]/@name",
					doc);
			System.out.println(string);
			System.out.println(root.toString());
			System.out.println(Inet4Address.getAllByName("www.baidu.com").length);
			System.out.println(Inet4Address.getLocalHost());
		    System.out.println(MessageFormat.format("{0,date,yyyy-MM-dd}", new Date()));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
