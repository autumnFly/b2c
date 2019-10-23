package com.csair.b2c.cloud.test.feign;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.csair.b2c.cloud.test.common.constant.ProjectConst;
import com.csair.b2c.cloud.test.feign.interceptor.TimeBasedAccessInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.http.converter.ByteArrayHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.ResourceHttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.support.AllEncompassingFormHttpMessageConverter;
import org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverter;
import org.springframework.http.converter.xml.SourceHttpMessageConverter;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import javax.annotation.PostConstruct;
import javax.xml.transform.Source;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author yu
 */
// @EnableFeignClients
@EnableDiscoveryClient
@EnableAspectJAutoProxy
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = ProjectConst.REDIS_SESSION_EXPIRED_TIME)
@ServletComponentScan(basePackages = "com.csair.b2c")
@ComponentScan(basePackages = "com.csair.b2c")
@SpringBootApplication
public class FeignApplication {
    Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    Environment env;

    public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class, args);
    }

    @PostConstruct
    public void showProps() {
        // 本项目yml获取配置
        logger.info("feign yml config:{}", env.getProperty("feign.common"));
        logger.info("feign yml config:{}", env.getProperty("feign.environment"));
        // 本项目properties获取配置
        logger.info("feign config:{}", env.getProperty("feign.my.composite"));
        logger.info("feign config:{}", env.getProperty("feign.secret.url"));
        // 配置中心获取配置
        logger.info("center config:{}", env.getProperty("my.secret"));
        logger.info("center config:{}", env.getProperty("activemq.url"));
        logger.info("center config:{}", env.getProperty("common.config.name"));
    }

    @Bean
    public RequestMappingHandlerMapping requestMappingHandlerMapping() {
        RequestMappingHandlerMapping handlerMapping = new RequestMappingHandlerMapping();
        handlerMapping.setInterceptors(new TimeBasedAccessInterceptor());
        return handlerMapping;
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/api/**");
            }
        };
    }

    // @Bean
    // public EmbeddedServletContainerFactory servletContainer() {
    //     TomcatEmbeddedServletContainerFactory factory = new TomcatEmbeddedServletContainerFactory();
    //     factory.setPort(8300);
    //     // 由于已启用redis session共享,本配置不在有效
    //     factory.setSessionTimeout(10, TimeUnit.MINUTES);
    //     factory.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND, "/notfound.html"));
    //     return factory;
    // }

    @Bean
    public RestTemplate restTemplate() {
        RestTemplate template = new RestTemplate();
        Charset charset = Charset.forName("UTF-8");
        SimpleClientHttpRequestFactory factory = (SimpleClientHttpRequestFactory) template.getRequestFactory();
        factory.setConnectTimeout(60000);
        factory.setReadTimeout(60000);
        ByteArrayHttpMessageConverter converter1 = new ByteArrayHttpMessageConverter();
        converter1.setSupportedMediaTypes(
                Arrays.asList(new MediaType("application", "octet-stream", charset), MediaType.ALL));
        StringHttpMessageConverter converter2 = new StringHttpMessageConverter(charset);
        ResourceHttpMessageConverter converter3 = new ResourceHttpMessageConverter();
        converter3.setSupportedMediaTypes(Arrays.asList(MediaType.ALL));
        SourceHttpMessageConverter<Source> converter4 = new SourceHttpMessageConverter<Source>();
        converter4.setSupportedMediaTypes(Arrays.asList(new MediaType("application", "xml", charset),
                new MediaType("text", "xml", charset), new MediaType("application", "*+xml", charset)));
        AllEncompassingFormHttpMessageConverter converter5 = new AllEncompassingFormHttpMessageConverter();
        converter5.setCharset(charset);
        converter5.setMultipartCharset(charset);
        Jaxb2RootElementHttpMessageConverter converter6 = new Jaxb2RootElementHttpMessageConverter();
        converter6.setSupportedMediaTypes(Arrays.asList(new MediaType("application", "xml", charset),
                new MediaType("text", "xml", charset), new MediaType("application", "*+xml", charset)));
        FastJsonHttpMessageConverter converter7 = new FastJsonHttpMessageConverter();
        converter7.setCharset(charset);
        List<HttpMessageConverter<?>> converters = new ArrayList<HttpMessageConverter<?>>(7);
        converters.add(converter1);
        converters.add(converter2);
        converters.add(converter3);
        converters.add(converter4);
        converters.add(converter5);
        converters.add(converter6);
        converters.add(converter7);
        template.setMessageConverters(converters);
        return template;
    }
}
