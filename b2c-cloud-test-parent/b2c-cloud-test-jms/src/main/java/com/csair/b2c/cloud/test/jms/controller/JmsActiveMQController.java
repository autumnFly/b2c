package com.csair.b2c.cloud.test.jms.controller;

import com.csair.b2c.cloud.test.annotation.processor.annotation.EmptyNoAllow;
import com.csair.b2c.cloud.test.jms.constant.JmsConst;
import org.apache.commons.lang.RandomStringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
// 这行导入勿删,否则这个类编译会失败
import com.csair.b2c.cloud.test.common.util.AssertUtils;
/**
 * Created by yu on 2018/4/30.
 */
@Controller
@RequestMapping("order/active/*")
public class JmsActiveMQController {
    Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private JmsTemplate jmsTemplate;

    @PostConstruct
    @GetMapping("createOrder")
    public void createOrder(@EmptyNoAllow String userName) {
        System.out.println(userName.length());
        // 模拟用户创建订单
        ExecutorService service = Executors.newCachedThreadPool();
        service.submit(() -> {
            while (true) {
                TimeUnit.SECONDS.sleep(5);
                String bookUser = RandomStringUtils.randomAlphabetic(5);
                String orderNo = RandomStringUtils.randomNumeric(10);
                Map<String, String> map = new HashMap<>();
                map.put("bookUser", bookUser);
                map.put("orderNo", orderNo);
                jmsTemplate.convertAndSend(JmsConst.ACTIVE_MQ_QUEUE, map);
                logger.info("jms send order info to mq queue success,bookuser:{},orderNo:{}", bookUser, orderNo);
                TimeUnit.SECONDS.sleep(5);
                jmsTemplate.convertAndSend(JmsConst.ACTIVE_MQ_TOPIC, map);
                logger.info("jms send order info to mq topic success,bookuser:{},orderNo:{}", bookUser, orderNo);
                TimeUnit.SECONDS.sleep(5);
            }
        });

    }
}
