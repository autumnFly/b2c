package com.csair.b2c.test.mybatis.jackson;

import com.csair.b2c.test.mybatis.enums.EnumBase;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

/**
 * <p>将前端传过来的数字转换为实现了EnumBase接口的枚举类对象</p>
 * Created on 2019/4/20.<br/>
 *
 * @author yudong
 */
public class EnumBaseDeserializer<E extends Enum<?> & EnumBase> extends JsonDeserializer<EnumBase> {//implements ContextualDeserializer

    private Class<E> targetClass;

    public EnumBaseDeserializer(Class<E> targetClass) {
        this.targetClass = targetClass;
    }

    @Override
    public E deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        return EnumBase.codeOf(targetClass, p.getIntValue());
    }

    // @Override
    // public JsonDeserializer<?> createContextual(DeserializationContext ctxt, BeanProperty property) throws JsonMappingException {
    //     targetClass = (Class<E>) ctxt.getContextualType().getRawClass();
    //     return new EnumBaseDeserializer<>(targetClass);
    // }
}