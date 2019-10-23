package com.csair.b2c.test.mybatis.jackson;

import com.csair.b2c.test.mybatis.enums.EnumBase;
import com.csair.b2c.test.mybatis.utils.ClassUtils;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.datatype.jsr310.PackageVersion;

import java.util.Set;
import java.util.stream.Collectors;

/**
 * <p>实现了EnumBase接口的枚举类对象序列化和反序列化</p>
 * Created on 2019/4/20.<br/>
 *
 * @author yudong
 */
public class EnumBaseModule extends SimpleModule {

    public EnumBaseModule() {
        super(PackageVersion.VERSION);
        // 找到EnumBase接口所在的包下所有实现该接口的枚举类
        Set<Class<?>> set = ClassUtils.getAllClassesFromPackage(EnumBase.class.getPackage().getName());
        Set<Class> set1 = set.stream()
                .filter(clz -> clz.isEnum() && EnumBase.class.isAssignableFrom(clz))
                .collect(Collectors.toSet());
        // 注册序列化器和反序列化器到Jackson
        for (Class<EnumBase> enumClass : set1) {
            addDeserializer(enumClass, new EnumBaseDeserializer(enumClass));
            addSerializer(enumClass, new EnumBaseSerializer());
        }
    }

}
