package com.csair.b2c.cloud.test.jms.constant;

/**
 * Created by yu on 2018/4/30.
 */
public interface JmsConst {
    String ORDER_ROUTING_DIRECT_KEY = "rabbit.queue.direct";
    String ORDER_ROUTING_TOPIC_KEY = "rabbit.topic.order";
    String ORDER_TOPIC_QUEUE = "queueMessage";
    String ORDER_TOPIC_QUEUE1 = "queueMessage1";
    String ORDER_TOPIC_QUEUE2 = "queueMessage2";

    String ACTIVE_MQ_QUEUE= "active.default.queue";
    String ACTIVE_MQ_TOPIC= "active.default.topic";
}
