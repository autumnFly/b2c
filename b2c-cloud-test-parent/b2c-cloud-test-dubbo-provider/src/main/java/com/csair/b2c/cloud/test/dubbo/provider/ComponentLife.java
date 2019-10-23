package com.csair.b2c.cloud.test.dubbo.provider;

import com.csair.b2c.cloud.test.dubbo.provider.api.service.DynamicExecuteDubboService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 执行顺序参见下面方法所在的顺序
 *
 * @author yudong
 * @date 2018/8/16
 */
public class ComponentLife implements BeanNameAware, BeanFactoryAware,
        ApplicationContextAware, BeanPostProcessor, InitializingBean, DisposableBean {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private DynamicExecuteDubboService dynamicExecuteDubboService;

    private static int times1;
    private static int times2;

    private int order = 1;

    @Override
    public void setBeanName(String name) {
        logger.info("calling setBeanName:{},{}", order++, String.valueOf(dynamicExecuteDubboService));
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        logger.info("calling setBeanFactory:{},{}", order++, String.valueOf(dynamicExecuteDubboService));
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        logger.info("calling setApplicationContext:{},{}", order++, String.valueOf(dynamicExecuteDubboService));
    }

    @PostConstruct
    public void postConstruct() {
        logger.info("calling postConstruct:{},{}", order++, String.valueOf(dynamicExecuteDubboService));
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        logger.info("calling afterPropertiesSet:{},{}", order++, String.valueOf(dynamicExecuteDubboService));
    }

    public void initMethod() {
        logger.info("calling initMethod:{},{}", order++, String.valueOf(dynamicExecuteDubboService));
    }

    // @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        logger.info("calling postProcessBeanFactory:{},{}", order++, String.valueOf(dynamicExecuteDubboService));
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (times1++ == 1) {
            logger.info("calling postProcessBeforeInitialization:{},{}", order++, String.valueOf(dynamicExecuteDubboService));
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (times2++ == 1) {
            logger.info("calling postProcessAfterInitialization:{},{}", order++, String.valueOf(dynamicExecuteDubboService));
        }
        return bean;
    }


    @PreDestroy
    public void preDestroy() {
        logger.info("calling preDestroy:{},{}", order++, String.valueOf(dynamicExecuteDubboService));
    }

    @Override
    public void destroy() throws Exception {
        logger.info("calling destroy:{},{}", order++, String.valueOf(dynamicExecuteDubboService));
    }

    public void destroyMethod() {
        logger.info("calling destroyMethod:{},{}", order++, String.valueOf(dynamicExecuteDubboService));
    }
}
