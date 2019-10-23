package com.csair.b2c.cloud.test.jms.listener;

import com.alibaba.fastjson.JSONObject;
import com.csair.b2c.cloud.test.jms.constant.JmsConst;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@RabbitListener(queues = JmsConst.ORDER_TOPIC_QUEUE2)
public class OrderTopicListener2 {
    Logger logger = LoggerFactory.getLogger(getClass());

    @RabbitHandler
    public void process(Map<String, String> map) {
        // 模拟处理用户订单信息
        logger.info("topicExchange Received mq2 message success:{}", JSONObject.toJSONString(map, true));
    }

}