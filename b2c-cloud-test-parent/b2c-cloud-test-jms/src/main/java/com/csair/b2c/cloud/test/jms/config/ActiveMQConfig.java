package com.csair.b2c.cloud.test.jms.config;

import com.csair.b2c.cloud.test.jms.constant.JmsConst;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTempTopic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsTemplate;

import javax.jms.ConnectionFactory;

/**
 * Created by yu on 2018/4/30.
 */
@Configuration
public class ActiveMQConfig {
    Logger logger = LoggerFactory.getLogger(getClass());
    @Value("${activemq.url}")
    private String url;

    @Bean
    public ConnectionFactory activeMQconnectionFactory() {
        ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory();
        logger.info("activeMQconnectionFactory start to create,url:{}",url);
        factory.setBrokerURL(url);
        return factory;
    }
    @Bean
    public JmsTemplate jmsTemplate(ConnectionFactory factory) {
        JmsTemplate template = new JmsTemplate(factory);
        template.setDefaultDestination(new ActiveMQQueue(JmsConst.ACTIVE_MQ_QUEUE));
        template.setDefaultDestination(new ActiveMQTempTopic(JmsConst.ACTIVE_MQ_TOPIC));
        return template;
    }

}
