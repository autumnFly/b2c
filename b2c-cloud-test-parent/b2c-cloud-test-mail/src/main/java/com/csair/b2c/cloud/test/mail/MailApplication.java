package com.csair.b2c.cloud.test.mail;

import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Properties;

import javax.xml.transform.Source;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.core.env.Environment;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.http.converter.ByteArrayHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.ResourceHttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.http.converter.support.AllEncompassingFormHttpMessageConverter;
import org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverter;
import org.springframework.http.converter.xml.SourceHttpMessageConverter;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;

import com.alibaba.fastjson.JSONObject;
import com.csair.b2c.cloud.test.common.constant.ProjectConst;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

@SpringBootApplication
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = ProjectConst.REDIS_SESSION_EXPIRED_TIME)
@ComponentScan(basePackages = "com.csair.b2c")
@ServletComponentScan(basePackages = "com.csair.b2c")
public class MailApplication extends WebMvcConfigurerAdapter {
    Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private Environment env;

    public static void main(String[] args) {
        SpringApplication.run(MailApplication.class, args);
    }


    @Bean
    public DateFormatter dateFormatter() {
        DateFormatter formatter = new DateFormatter();
        return formatter;
    }

    @Bean
    public LocaleResolver localeResolver() {
        CookieLocaleResolver resolver = new CookieLocaleResolver();
        resolver.setDefaultLocale(Locale.CHINA);
        resolver.setCookieDomain(".csair.com");
        resolver.setCookieName("language");
        resolver.setCookiePath("/");
        resolver.setCookieMaxAge(3600 * 24 * 30);
        return resolver;
    }

    @Bean
    public RestTemplate restTemplate() {
        RestTemplate template = new RestTemplate();
        SimpleClientHttpRequestFactory factory = (SimpleClientHttpRequestFactory) template.getRequestFactory();
        factory.setConnectTimeout(3000);
        factory.setReadTimeout(3000);
        template.setRequestFactory(factory);
        template.setMessageConverters(getConverters());
        return template;
    }

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        super.configureMessageConverters(getConverters());
    }

    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setSerializationInclusion(Include.ALWAYS);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.configure(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE, false);
        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm"));
        return objectMapper;
    }
    
    @Bean
    @Primary
    public MessageSource messageSourceMessages() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setDefaultEncoding("UTF-8");
        messageSource.setBasename("i18n.Messages");
        return messageSource;
    }

    @Bean
    public MessageSource messageSourceMessagesBackground() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setDefaultEncoding("UTF-8");
        messageSource.setBasename("i18n.MessagesBackground");
        return messageSource;
    }

    @Bean
    public MessageSource messageSourceMessagesExceptions() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setDefaultEncoding("UTF-8");
        messageSource.setBasename("i18n.Exceptions");
        return messageSource;
    }

    private List<HttpMessageConverter<?>> getConverters() {
        Charset charset = Charset.forName("UTF-8");
        ByteArrayHttpMessageConverter converter1 = new ByteArrayHttpMessageConverter();
        converter1.setDefaultCharset(charset);
        StringHttpMessageConverter converter2 = new StringHttpMessageConverter(charset);
        ResourceHttpMessageConverter converter3 = new ResourceHttpMessageConverter();
        converter3.setDefaultCharset(charset);
        SourceHttpMessageConverter<Source> converter4 = new SourceHttpMessageConverter<>();
        converter4.setDefaultCharset(charset);
        AllEncompassingFormHttpMessageConverter converter5 = new AllEncompassingFormHttpMessageConverter();
        Jaxb2RootElementHttpMessageConverter converter6 = new Jaxb2RootElementHttpMessageConverter();
        converter6.setDefaultCharset(charset);
        MappingJackson2HttpMessageConverter converter7 = new MappingJackson2HttpMessageConverter();
        converter7.setDefaultCharset(charset);
        List<HttpMessageConverter<?>> converters = new ArrayList<>(7);
        converters.add(converter1);
        converters.add(converter2);
        converters.add(converter3);
        converters.add(converter4);
        converters.add(converter5);
        converters.add(converter6);
        converters.add(converter7);
        return converters;
    }
}
