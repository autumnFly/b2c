package com.csair.com.cloud.test.boot.endpoint.impl;

import java.io.File;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import com.csair.com.cloud.test.boot.condition.LogbackEnvPropsCondition;
import com.csair.com.cloud.test.boot.endpoint.EnvProps;

/**
 * Created on 2018/8/25.<br/>
 *
 * @author yudong
 */
@Component
@Conditional(LogbackEnvPropsCondition.class)
public class LogbackEnvProps implements EnvProps {
	@Override
	public String name() {
		return "logbackProperties";
	}

	@SuppressWarnings("unchecked")
	@Override
	public Map<String, ?> props() {
		Map<String, List<String>> map = new LinkedHashMap<>();
		try {
			File file = ResourceUtils.getFile("classpath:logback.xml");
			Element root = new SAXReader().read(file).getRootElement();
			List<Element> appList = root.selectNodes("//appender");
			List<Element> loggList = root.selectNodes("//logger");
			for (Element app : appList) {
				if (app.attributeValue("name").equals("stdout")) {
					continue;
				}
				for (Element logg : loggList) {
					System.out.println();
					List<Element> refList = logg.elements("appender-ref");
					refList.forEach((action) -> {
						if (app.attributeValue("name").equals(action.attributeValue("ref"))) {
							List<String> values = map.get(logg.attributeValue("name"));
							if (values == null) {
								values = new LinkedList<>();
								values.add(app.element("File").getText());
								map.put(logg.attributeValue("name"), values);
							} else {
								values.add(app.element("File").getText());
							}
						}
					});
				}
			}

		} catch (Exception e) {
			map.put("error", Arrays.asList(e.getClass().getName(), e.getMessage()));
		}
		return map;
	}
}
