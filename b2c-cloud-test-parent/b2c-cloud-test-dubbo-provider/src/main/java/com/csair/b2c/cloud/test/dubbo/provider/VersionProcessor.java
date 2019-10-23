package com.csair.b2c.cloud.test.dubbo.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.csair.b2c.cloud.test.dubbo.provider.dubbo.impl.UserDubboServiceImpl;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Map;

/**
 * 动态修改dubbo(注解方式)的service或reference的version
 * <p>
 * 要想ApplicationListener接口能起作用,需配置META-INF/spring.factories文件,内容为:
 * org.springframework.context.ApplicationListener=\
 * com.csair.b2c.cloud.test.dubbo.provider.VersionProcessor
 *
 * @author yudong
 * @date 2018/11/3
 */
@Component
public class VersionProcessor implements BeanDefinitionRegistryPostProcessor, ApplicationListener<ApplicationStartingEvent>, Ordered {

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        try {
            String annotationFieldName = "version";
            String annotationNewFieldValue = "1.0.0-yudong";
            // 动态更改dubbo的Service版本号
            Annotation suiteClassAnnotation = UserDubboServiceImpl.class.getAnnotation(Service.class);
            changeAnnotationValue(suiteClassAnnotation, annotationFieldName, annotationNewFieldValue);
            // 动态更改dubbo的Reference版本号
            // Annotation fieldAnnotation = UserDubboServiceImpl.class.
            //         getDeclaredField("moonMallOrderService").getAnnotation(Reference.class);
            // changeAnnotationValue(fieldAnnotation, annotationFieldName, annotationNewFieldValue);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) {

    }

    public static void changeAnnotationValue(Annotation annotation, String key, Object newValue) throws Exception {
        InvocationHandler handler = Proxy.getInvocationHandler(annotation);
        Field f = handler.getClass().getDeclaredField("memberValues");
        f.setAccessible(true);
        Map<String, Object> memberValues = (Map<String, Object>) f.get(handler);
        Object oldValue = memberValues.get(key);
        Assert.isTrue(oldValue != null && oldValue.getClass() == newValue.getClass(), "newValue has problem");
        memberValues.put(key, newValue);
    }

    @Override
    public void onApplicationEvent(ApplicationStartingEvent event) {
        // try {
        //     // 解决这个报错
        //     // LoggerFactory is not a Logback LoggerContext but Logback is on the classpath. Either remove Logback or the competing implementation (%s loaded from %s). If you are using WebLogic you will need to add 'org.slf4j' to prefer-application-packages in WEB-INF/weblogic.xml
        //     Class clz = StaticLoggerBinder.getSingleton().getClass();
        //     Field field = clz.getDeclaredField("loggerFactory");
        //     field.setAccessible(true);
        //     field.set(StaticLoggerBinder.getSingleton(), new LoggerContext());
        // } catch (Exception e) {
        //     throw new RuntimeException(e);
        // }
    }

    @Override
    public int getOrder() {
        return Ordered.HIGHEST_PRECEDENCE + 10;
    }

}
