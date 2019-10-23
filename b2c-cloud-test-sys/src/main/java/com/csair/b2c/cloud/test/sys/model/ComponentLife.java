package com.csair.b2c.cloud.test.sys.model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created on 2018/8/16.<br/>
 *
 * @author yudong
 */
public class ComponentLife implements BeanNameAware, BeanFactoryAware,
        ApplicationContextAware, BeanPostProcessor, InitializingBean, DisposableBean {

    private static int times1;
    private static int times2;

    @Override
    public void setBeanName(String name) {
        System.out.println("setBeanName");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("setBeanFactory");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("postConstruct");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
    }

    public void initMethod() {
        System.out.println("initMethod");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (times1++ == 1) {
            System.out.println("postProcessBeforeInitialization");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (times2++ == 1) {
            System.out.println("postProcessAfterInitialization");
        }
        return bean;
    }


    @PreDestroy
    public void preDestroy() {
        System.out.println("preDestroy");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy");
    }

    public void destroyMethod() {
        System.out.println("destroyMethod");
    }

}
