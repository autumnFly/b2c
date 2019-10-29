package org.javamaster.b2c.apollo;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 学习携程apollo配置中心的用法
 *
 * @author yudong
 * @date 2019/10/29
 */
@EnableApolloConfig
@SpringBootApplication
@ComponentScan("org.javamaster.b2c")
public class ApolloApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApolloApplication.class, args);
    }

}
