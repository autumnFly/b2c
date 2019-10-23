package com.csair.b2c.cloud.test.dubbo.provider;

import com.csair.b2c.cloud.test.common.constant.ProjectConst;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * Created on 2018/10/11.<br/>
 *
 * @author yudong
 */
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = ProjectConst.REDIS_SESSION_EXPIRED_TIME)
@ComponentScan(basePackages = "com.csair.b2c")
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class DubboProviderApplication {
    static Logger logger = LoggerFactory.getLogger(DubboProviderApplication.class);

    public static void main(String[] args) {
        System.setProperty("spring.devtools.restart.enabled", "false");
        ApplicationContext applicationContext = SpringApplication.run(DubboProviderApplication.class, args);
        logger.info("{}", applicationContext.getApplicationName());
    }

    @Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
    public ComponentLife componentLife() {
        return new ComponentLife();
    }
}
