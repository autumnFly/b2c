package org.javamaster.b2c.swagger2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ApplicationContext;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author yudong
 * @date 2019/12/19
 */
@EnableSwagger2
@EnableDiscoveryClient
// @EnableAdminServer
@SpringBootApplication
public class Swagger2Application {

    private static ApplicationContext context;

    public static void main(String[] args) {
        context = SpringApplication.run(Swagger2Application.class, args);
        System.out.println("http://localhost:8258/home/login?username=root&password=root");
    }

    public static ApplicationContext getContext() {
        return context;
    }

}
