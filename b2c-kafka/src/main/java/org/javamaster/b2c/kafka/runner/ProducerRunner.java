package org.javamaster.b2c.kafka.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author yudong
 * @date 2019/12/13
 */
@Component
public class ProducerRunner implements CommandLineRunner {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    private Random random = new Random();

    @Override
    public void run(String... args) {
        Executors.newSingleThreadExecutor().execute(() -> {
            while (true) {
                String s = String.valueOf(random.nextLong());
                System.out.println("producer:" + s);
                try {
                    kafkaTemplate.send("topic_order_code", "orderCode", s);
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    throw new RuntimeException(e);
                }
            }
        });
    }

}
