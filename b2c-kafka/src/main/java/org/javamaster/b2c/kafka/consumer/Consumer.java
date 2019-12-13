package org.javamaster.b2c.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author yudong
 * @date 2019/12/13
 */
@Component
public class Consumer {

    @KafkaListener(groupId = "test_group", topics = "topic_order_code")
    public void handler(String orderCode) {
        System.out.println("cousumer:" + orderCode);
    }

}
