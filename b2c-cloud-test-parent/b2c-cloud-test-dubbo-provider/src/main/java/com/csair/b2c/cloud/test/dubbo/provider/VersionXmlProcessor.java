package com.csair.b2c.cloud.test.dubbo.provider;

import cn.com.bluemoon.service.customermanage.api.OrderDubboForCustomerManageService;
import com.alibaba.dubbo.config.spring.ReferenceBean;
import com.alibaba.dubbo.config.spring.ServiceBean;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * 动态修改dubbo(非注解方式)的service或reference的version
 *
 * @author yudong
 * @date 2019/5/25
 */
@Component
public class VersionXmlProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) {
        try {
            String newVersion = "1.0.0-yudong";
            // 动态修改dubbo的service的版本号
            changeVersion(configurableListableBeanFactory, ServiceBean.class, OrderDubboForCustomerManageService.class, newVersion);
            // 动态修改dubbo的reference的版本号
            // changeVersion(configurableListableBeanFactory, ReferenceBean.class, MallWashOrderService.class, newVersion);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> void changeVersion(ConfigurableListableBeanFactory configurableListableBeanFactory,
                                         Class<T> type, Class interfaceClz, String newVersion) {
        Map<String, T> map = configurableListableBeanFactory.getBeansOfType(type);
        for (Map.Entry<String, T> stringServiceBeanEntry : map.entrySet()) {
            T bean = stringServiceBeanEntry.getValue();
            if (bean instanceof ReferenceBean) {
                ReferenceBean referenceBean = ((ReferenceBean) bean);
                if (referenceBean.getInterfaceClass() == interfaceClz) {
                    referenceBean.setVersion(newVersion);
                    return;
                }
            }
            if (bean instanceof ServiceBean) {
                ServiceBean serviceBean = ((ServiceBean) bean);
                if (serviceBean.getInterfaceClass() == interfaceClz) {
                    serviceBean.setVersion(newVersion);
                    return;
                }
            }
        }
    }

}
