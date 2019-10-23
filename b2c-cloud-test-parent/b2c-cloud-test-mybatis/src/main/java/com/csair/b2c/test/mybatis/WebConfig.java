package com.csair.b2c.test.mybatis;

import com.csair.b2c.test.mybatis.jackson.EnumBaseModule;
import org.apache.catalina.connector.Connector;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.nio.charset.StandardCharsets;
import java.util.List;

/**
 * @author yu
 * @date 2018/4/13
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Value("${http.port}")
    private int port;

    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
        for (HttpMessageConverter<?> converter : converters) {
            if (converter.getClass() == MappingJackson2HttpMessageConverter.class) {
                MappingJackson2HttpMessageConverter messageConverter = ((MappingJackson2HttpMessageConverter) converter);
                messageConverter.getObjectMapper().registerModule(new EnumBaseModule());
                messageConverter.setDefaultCharset(StandardCharsets.UTF_8);
            } else if (converter.getClass() == StringHttpMessageConverter.class) {
                ((StringHttpMessageConverter) converter).setDefaultCharset(StandardCharsets.UTF_8);
            }
        }
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // registry.addInterceptor(new TestInterceptor()).addPathPatterns("/order/*");
        // registry.addInterceptor(new ThemeInterceptor()).addPathPatterns("/**").excludePathPatterns("/admin/**");
        // registry.addInterceptor(new SecurityInterceptor()).addPathPatterns("/secure/*");
    }


    @Bean
    public TomcatServletWebServerFactory servletContainer() {
        TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory();
        tomcat.addAdditionalTomcatConnectors(createHttpConnector());
        return tomcat;
    }

    /**
     * 配置http
     */
    private Connector createHttpConnector() {
        Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
        connector.setSecure(false);
        connector.setPort(port);
        return connector;
    }

}
