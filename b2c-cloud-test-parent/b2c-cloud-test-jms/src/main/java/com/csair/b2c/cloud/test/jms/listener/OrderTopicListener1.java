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
@RabbitListener(queues = JmsConst.ORDER_TOPIC_QUEUE1)
public class OrderTopicListener1 {
    Logger logger = LoggerFactory.getLogger(getClass());

    @RabbitHandler
    public void process(Map<String, String> map) {
        // 模拟处理用户订单信息
        logger.info("topicExchange Received mq1 message success:{}", JSONObject.toJSONString(map, true));
    }

}