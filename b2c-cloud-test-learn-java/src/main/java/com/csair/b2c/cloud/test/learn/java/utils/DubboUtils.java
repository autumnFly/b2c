package com.csair.b2c.cloud.test.learn.java.utils;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.rpc.service.GenericService;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import static org.javamaster.b2c.config.BlueMoonConsts.Dubbo.ZOOKEEPER_ADDRESS;
import static org.javamaster.b2c.config.BlueMoonConsts.Dubbo.ZOOKEEPER_ADDRESS_1;
import static org.javamaster.b2c.config.BlueMoonConsts.Dubbo.ZOOKEEPER_ADDRESS_2;

import java.lang.reflect.Method;
import java.util.List;

/**
 * <p>可用于测试任意的dubbo接口,添加相关dubbo api依赖即可</p>
 * Created on 2019/1/21.<br/>
 *
 * @author yudong
 */
public class DubboUtils {

    private static ApplicationConfig application = new ApplicationConfig();

    private static final String ADDRESS = ZOOKEEPER_ADDRESS;
    // private static final String ADDRESS = ZOOKEEPER_ADDRESS_1;
    // private static final String ADDRESS = ZOOKEEPER_ADDRESS_2;

    private static ReferenceConfig<GenericService> referenceConfigCache;

    static {
        application.setName("b2c-cloud-test-lean-java");
    }

    public static <T> T getService(Class<T> clazz) {
        return getService(clazz, null, null);
    }

    public static <T> T getService(Class<T> clazz, String version) {
        return getService(clazz, version, null);
    }

    public static <T> T getService(Class<T> clazz, String version, String hostPort) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback((MethodInterceptor) (obj, method, args, proxy) -> {
            ReferenceConfig<GenericService> reference = getReferenceConfig(clazz, null, version, hostPort);
            GenericService genericService = reference.get();
            Object result = genericService.$invoke(method.getName(), getMethodParamType(method), args);
            String resJsonStr = OMUtils.writeValueAsString(result);
            return OMUtils.objectMapper.readValue(resJsonStr, method.getReturnType());
        });
        Object service = enhancer.create();
        return (T) service;
    }

    public static Object invoke(Class<?> interfaceClazz, String methodName, List<Object> paramList, String version) {
        ReferenceConfig<GenericService> reference = getReferenceConfig(interfaceClazz, null, version, null);
        GenericService genericService = reference.get();
        Object resultParam = genericService.$invoke(methodName, getMethodParamType(interfaceClazz, methodName), paramList.toArray());
        return resultParam;
    }

    private static ReferenceConfig getReferenceConfig(Class<?> interfaceClass, String group, String version, String hostPort) {
        if (referenceConfigCache != null) {
            return referenceConfigCache;
        }
        String referenceKey = interfaceClass.getName();
        referenceConfigCache = new ReferenceConfig<>();
        referenceConfigCache.setApplication(application);
        referenceConfigCache.setRegistry(getRegistryConfig(group, version));
        referenceConfigCache.setInterface(interfaceClass);
        referenceConfigCache.setVersion(version);
        referenceConfigCache.setTimeout(300000);
        referenceConfigCache.setGeneric(true);
        if (hostPort != null) {
            String url = String.format("dubbo://%s/%s", hostPort, referenceKey);
            referenceConfigCache.setUrl(url);
        }
        return referenceConfigCache;
    }

    private static RegistryConfig getRegistryConfig(String group, String version) {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress(DubboUtils.ADDRESS);
        registryConfig.setVersion(version);
        registryConfig.setGroup(group);
        registryConfig.setTimeout(30000);
        return registryConfig;
    }

    public static String[] getMethodParamType(Class<?> clazz, String methodName) {
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            if (method.getName().equals(methodName)) {
                return getMethodParamType(method);
            }
        }
        throw new RuntimeException("方法名有误:" + methodName);
    }

    public static String[] getMethodParamType(Method method) {
        Class[] paramClassList = method.getParameterTypes();
        String[] paramTypeList = new String[paramClassList.length];
        for (int i = 0; i < paramClassList.length; i++) {
            paramTypeList[i] = paramClassList[i].getTypeName();
        }
        return paramTypeList;
    }
}