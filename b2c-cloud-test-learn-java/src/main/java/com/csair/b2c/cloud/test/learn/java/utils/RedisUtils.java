package com.csair.b2c.cloud.test.learn.java.utils;

import org.apache.commons.lang3.SerializationUtils;
import org.apache.commons.lang3.tuple.Pair;
import org.javamaster.b2c.config.BlueMoonConsts;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import java.io.Serializable;

/**
 * Created on 2019/1/21.<br/>
 *
 * @author yudong
 */
public class RedisUtils {

    public static JedisConnectionFactory factoryDev;
    public static RedisTemplate redisTemplateDev;
    public static JedisConnectionFactory factoryTest;
    public static RedisTemplate redisTemplateTest;
    public static JedisConnectionFactory factory;
    public static RedisTemplate redisTemplate;

    static {
        Pair<JedisConnectionFactory, RedisTemplate> pairDev = redisTemplate(BlueMoonConsts.Local.REDIS_URL, BlueMoonConsts.Local.REDIS_PORT, BlueMoonConsts.Local.PASSWORD);
        factoryDev = pairDev.getKey();
        redisTemplateDev = pairDev.getValue();

        Pair<JedisConnectionFactory, RedisTemplate> pairTest = redisTemplate(BlueMoonConsts.WashingService.REDIS_URL, BlueMoonConsts.WashingService.REDIS_PORT, BlueMoonConsts.WashingService.REDIS_PASSWORD);
        factoryTest = pairTest.getKey();
        redisTemplateTest = pairTest.getValue();

        // Pair<JedisConnectionFactory, RedisTemplate> pair = redisTemplate(BlueMoonConsts.WashingService.REDIS_URL_2, BlueMoonConsts.WashingService.REDIS_PORT_2, BlueMoonConsts.WashingService.REDIS_PASSWORD_2);
        // factory = pairPrd.getKey();
        // redisTemplate = pair.getValue();
    }

    public static void setObj(String key, Serializable obj) {
        redisTemplateDev.opsForValue().set(key, SerializationUtils.serialize(obj));
    }

    public static <T> T getObj(String key) {
        byte[] bytes = ((byte[]) redisTemplateDev.opsForValue().get(key));
        if (bytes == null) {
            return null;
        }
        return SerializationUtils.deserialize(bytes);
    }

    private static Pair<JedisConnectionFactory, RedisTemplate> redisTemplate(String host, int port, String password) {
        JedisConnectionFactory factory = new JedisConnectionFactory();
        factory.setHostName(host);
        factory.setPort(port);
        factory.setPassword(password);
        factory.afterPropertiesSet();

        RedisTemplate redisTemplate = new RedisTemplate();
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setValueSerializer(new JdkSerializationRedisSerializer());
        redisTemplate.setConnectionFactory(factory);
        redisTemplate.afterPropertiesSet();
        return Pair.of(factory, redisTemplate);
    }

}
