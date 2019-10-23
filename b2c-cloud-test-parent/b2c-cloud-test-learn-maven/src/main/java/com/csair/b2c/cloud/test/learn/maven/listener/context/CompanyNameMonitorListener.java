package com.csair.b2c.cloud.test.learn.maven.listener.context;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

/**
 * Created on 2018/9/20.<br/>
 *
 * @author yudong
 */
@WebListener
@Order(Integer.MIN_VALUE + 1)
public class CompanyNameMonitorListener implements ServletContextAttributeListener {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void attributeAdded(ServletContextAttributeEvent event) {
        logger.info("attributeAdded:{},{},{}", event.getName(), event.getValue(), event.getSource());
        if ("companyName".equals(event.getName())) {

        }
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent event) {

    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent event) {
        logger.info("attributeReplaced:{},{},{}", event.getName(), event.getValue(), event.getSource());
        if ("companyName".equals(event.getName())) {

        }
    }
}
