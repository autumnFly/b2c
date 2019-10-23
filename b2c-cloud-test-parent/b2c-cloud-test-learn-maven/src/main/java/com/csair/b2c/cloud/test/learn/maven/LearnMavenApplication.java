package com.csair.b2c.cloud.test.learn.maven;

import com.csair.b2c.cloud.test.common.constant.ProjectConst;
import com.google.code.kaptcha.Producer;
import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.google.code.kaptcha.util.Config;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.web.client.RestTemplate;

import java.util.Properties;

@EnableDiscoveryClient
@SpringBootApplication
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = ProjectConst.REDIS_SESSION_EXPIRED_TIME)
@ComponentScan("com.csair.b2c")
@ServletComponentScan("com.csair.b2c")
public class LearnMavenApplication extends SpringBootServletInitializer {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private Environment env;

    public static void main(String[] args) {
        SpringApplication.run(LearnMavenApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(LearnMavenApplication.class);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public Producer defaultKaptcha() {
        DefaultKaptcha defaultKaptcha = new DefaultKaptcha();
        Properties properties = new Properties();
        properties.setProperty("kaptcha.border", "yes");
        properties.setProperty("kaptcha.border.color", "105,179,90");
        properties.setProperty("kaptcha.textproducer.font.color", "blue");
        properties.setProperty("kaptcha.image.width", "125");
        properties.setProperty("kaptcha.image.height", "45");
        properties.setProperty("kaptcha.textproducer.font.size", "45");
        properties.setProperty("kaptcha.textproducer.char.length", "4");
        properties.setProperty("kaptcha.textproducer.font.names", "宋体,楷体,微软雅黑");
        Config config = new Config(properties);
        defaultKaptcha.setConfig(config);
        return defaultKaptcha;
    }

    @Bean
    public JavaMailSender javaMailSender() {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost(env.getProperty("greenmail.host"));
        mailSender.setUsername(env.getProperty("greenmail.username"));
        mailSender.setPassword(env.getProperty("greenmail.password"));
        mailSender.setDefaultEncoding("UTF-8");
        logger.info("mail host:{},username:{},password:{}", mailSender.getHost(), mailSender.getUsername(),
                mailSender.getPassword());
        Properties prop = new Properties();
        prop.put("mail.smtp.auth", env.getProperty("mail.prop.mail.smtp.auth"));
        prop.put("mail.smtp.starttls.enable", env.getProperty("mail.prop.mail.smtp.starttls.enable"));
        // 设置调试模式可以在控制台查看发送过程
        prop.put("mail.debug", env.getProperty("mail.prop.mail.debug"));
        prop.put("mail.smtp.starttls.required", env.getProperty("mail.prop.mail.smtp.starttls.required"));
        mailSender.setJavaMailProperties(prop);
        return mailSender;
    }

}
