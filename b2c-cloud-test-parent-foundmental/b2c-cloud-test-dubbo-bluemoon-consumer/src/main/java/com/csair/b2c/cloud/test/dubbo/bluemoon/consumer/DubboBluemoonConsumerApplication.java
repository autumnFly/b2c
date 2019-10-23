package com.csair.b2c.cloud.test.dubbo.bluemoon.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created on 2018/10/11.<br/>
 *
 * @author yudong
 */
@SpringBootApplication
public class DubboBluemoonConsumerApplication {
    public static void main(String[] args) {
        System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(DubboBluemoonConsumerApplication.class, args);
    }
}
