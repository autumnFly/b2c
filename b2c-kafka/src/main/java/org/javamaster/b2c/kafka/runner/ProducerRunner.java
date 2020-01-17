package org.javamaster.b2c.kafka.runner;

import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 * @author yudong
 * @date 2019/12/13
 */
@Component
public class ProducerRunner implements CommandLineRunner {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Override
    public void run(String... args) {
        JSONObject json = new JSONObject();
        json.put("orderTime", System.currentTimeMillis());
        json.put("userId", "U16042011265010759941");
        json.put("labelType", 2);
        kafkaTemplate.send("test_topic_order_code", json.toString());
    }

}
