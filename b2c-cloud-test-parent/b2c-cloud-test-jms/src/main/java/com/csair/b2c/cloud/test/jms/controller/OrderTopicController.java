package com.csair.b2c.cloud.test.jms.controller;

import com.csair.b2c.cloud.test.jms.constant.JmsConst;
import org.apache.commons.lang.RandomStringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by yu on 2018/4/30.
 */
@Controller
@RequestMapping("order/topic/*")
public class OrderTopicController {
    Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @PostConstruct
    @GetMapping("createOrder")
    public void createOrder() {
        // 模拟用户创建订单
        ExecutorService service = Executors.newCachedThreadPool();
        service.submit(() -> {
            while (true) {
                TimeUnit.SECONDS.sleep(300);
                String bookUser = RandomStringUtils.randomAlphabetic(5);
                String orderNo = RandomStringUtils.randomNumeric(10);
                Map<String, String> map = new HashMap<>();
                map.put("bookUser", bookUser);
                map.put("orderNo", orderNo);
                rabbitTemplate.convertAndSend("topicExchange", JmsConst.ORDER_ROUTING_TOPIC_KEY, map);
                logger.info("topicExchange send order info to mq success,bookuser:{},orderNo:{}", bookUser, orderNo);
            }
        });

    }
}
