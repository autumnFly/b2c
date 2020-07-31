package org.javamaster.b2c.dubbo.client;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yudong
 * @date 2020/7/31
 */
@EnableDubbo
@SpringBootApplication
public class B2cDubboClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(B2cDubboClientApplication.class, args);
    }

}
