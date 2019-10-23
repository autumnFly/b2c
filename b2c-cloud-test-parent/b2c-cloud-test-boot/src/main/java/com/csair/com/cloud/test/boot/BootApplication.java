package com.csair.com.cloud.test.boot;

import com.csair.b2c.cloud.test.common.constant.ProjectConst;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@ImportResource(locations = { "classpath*:spring/b2c-servlet.xml" })
@EnableDiscoveryClient
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = ProjectConst.REDIS_SESSION_EXPIRED_TIME)
@ComponentScan(basePackages = {"com.csair.b2c","com.csair.com"})
@SpringBootApplication
public class BootApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(BootApplication.class, args);

	}

	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/jsp/");
		resolver.setSuffix(".jsp");
		return resolver;
	}

}
