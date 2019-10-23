package com.csair.b2c.cloud.test.user;

import com.csair.b2c.cloud.test.common.constant.ProjectConst;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created on 2018/12/8.<br/>
 *
 * @author yudong
 */
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = ProjectConst.REDIS_SESSION_EXPIRED_TIME)
@ComponentScan(basePackages = "com.csair.b2c")
@SpringBootApplication
@EnableGlobalMethodSecurity(securedEnabled = true,prePostEnabled = true)
@EnableSwagger2
@EnableAspectJAutoProxy
public class UserApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }

}
