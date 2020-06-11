package com.csair.b2c.cloud.test.learn.java.utils;

import com.google.common.collect.Maps;
import org.javamaster.b2c.config.BlueMoonConsts;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

import java.util.Map;

/**
 * @author yudong
 * @date 2020/6/11
 */
public class KafkaUtils {

    public static KafkaTemplate<Object, Object> kafkaTemplateClusterTest;

    static {
        kafkaTemplateClusterTest = initKafkaTemplate(BlueMoonConsts.Honor.KAFKA_SERVIERS);
    }

    private static KafkaTemplate<Object, Object> initKafkaTemplate(String servers) {
        Map<String, Object> configs = Maps.newHashMap();
        configs.put("bootstrap.servers", servers);
        configs.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        configs.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        configs.put("group.id", "wx_card_group");
        configs.put("enable.auto.commit", "true");
        configs.put("auto.commit.interval", "100");
        configs.put("auto.offset.reset", "earliest");
        configs.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        configs.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        configs.put("buffer.memory", "33554432");
        configs.put("batch.size", "16384");
        configs.put("retries", "3");
        configs.put("acks", "1");
        ProducerFactory<Object, Object> kafkaProducerFactory = new DefaultKafkaProducerFactory<>(configs);
        return new KafkaTemplate<>(kafkaProducerFactory);
    }
}
