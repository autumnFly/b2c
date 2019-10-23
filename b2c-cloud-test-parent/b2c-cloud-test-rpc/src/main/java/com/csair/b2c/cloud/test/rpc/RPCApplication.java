package com.csair.b2c.cloud.test.rpc;

import com.csair.b2c.cloud.test.common.constant.ProjectConst;
import com.csair.b2c.cloud.test.model.service.BookService;
import com.sun.jersey.spi.container.servlet.ServletContainer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.remoting.jaxws.SimpleJaxWsServiceExporter;
import org.springframework.remoting.rmi.RmiServiceExporter;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@EnableCaching
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = ProjectConst.REDIS_SESSION_EXPIRED_TIME)
@ComponentScan(basePackages = "com.csair.b2c")
@SpringBootApplication
public class RPCApplication {

    public static void main(String[] args) {
        SpringApplication.run(RPCApplication.class, args);
    }

    /**
     * 配置RMI服务器端,客户端配置在sys微服务
     */
    @Bean
    public RmiServiceExporter rmiServiceExporter(BookService bookService) {
        RmiServiceExporter exporter = new RmiServiceExporter();
        exporter.setService(bookService);
        exporter.setServiceName("BookService");
        exporter.setServiceInterface(BookService.class);
        // 默认会尝试绑定到本地localhost的1099端口上的RMI注册表,如果没有发现RMI注册表,那么就会启动一个注册表
        // 如果希望绑定到其他主机的注册表,那么设置以下两个属性即可
        //exporter.setRegistryHost("localhost");
        //exporter.setRegistryPort(1099);
        return exporter;
    }

    /**
     * JAX-WS服务器端配置
     */
    @Bean
    public SimpleJaxWsServiceExporter jaxWsServiceExporter() {
        SimpleJaxWsServiceExporter exporter = new SimpleJaxWsServiceExporter();
        exporter.setBaseAddress("http://localhost:8080/rpc/services/");
        return exporter;
    }

    /**
     * JAX-RS配置
     */
    @Bean
    public ServletRegistrationBean jersetServlet(){
        // our rest resources will be available in the path /jersey/*
        ServletRegistrationBean registration = new ServletRegistrationBean(new ServletContainer(), "/jersey/*");
        registration.addInitParameter("javax.ws.rs.Application", JerseyConfig.class.getName());
        return registration;
    }

}
