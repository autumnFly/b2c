package com.csair.b2c.cloud.test.admin;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.session.SessionAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created on 2019/2/27.<br/>
 *
 * @author yudong
 */
// @EnableRedisHttpSession(maxInactiveIntervalInSeconds = ProjectConst.REDIS_SESSION_EXPIRED_TIME)
@ComponentScan(basePackages = "com.csair.b2c")
@SpringBootApplication(exclude = SessionAutoConfiguration.class)
// @EnableDiscoveryClient
@EnableAdminServer
public class AdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);
    }
}
