package com.csair.b2c.cloud.test.learn.java.utils;

import org.apache.commons.lang3.SerializationUtils;
import org.apache.commons.lang3.tuple.Pair;
import org.javamaster.b2c.config.BlueMoonConsts;
import org.springframework.data.redis.connection.RedisClusterConfiguration;
import org.springframework.data.redis.connection.RedisNode;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import redis.clients.jedis.Jedis;

import java.io.Serializable;

/**
 * Created on 2019/1/21.<br/>
 *
 * @author yudong
 */
public class RedisUtils {

    public static JedisConnectionFactory factoryDev;
    public static RedisTemplate<Object, Object> redisTemplateDev;
    public static Jedis jedis;
    public static JedisConnectionFactory factoryTest;
    public static JedisConnectionFactory factoryTestCluster;
    public static RedisTemplate<Object, Object> redisTemplateTest;
    public static RedisTemplate<Object, Object> redisTemplateClusterTest;
    public static JedisConnectionFactory factory;
    public static RedisTemplate<Object, Object> redisTemplate;

    static {
        Pair<JedisConnectionFactory, RedisTemplate<Object, Object>> pairDev = redisTemplate(BlueMoonConsts.Local.REDIS_URL,
                BlueMoonConsts.Local.REDIS_PORT, BlueMoonConsts.Local.REDIS_PASSWORD);
        factoryDev = pairDev.getKey();
        redisTemplateDev = pairDev.getValue();

        Pair<JedisConnectionFactory, RedisTemplate<Object, Object>> pairTest = redisTemplate(BlueMoonConsts.WashingService.REDIS_URL,
                BlueMoonConsts.WashingService.REDIS_PORT, BlueMoonConsts.WashingService.REDIS_PASSWORD);
        factoryTest = pairTest.getKey();
        redisTemplateTest = pairTest.getValue();

        Pair<JedisConnectionFactory, RedisTemplate<Object, Object>> pairClusterTest = redisTemplateCluster(BlueMoonConsts.Honor.REDIS_CLUSTER_2,
                BlueMoonConsts.Honor.REDIS_CLUSTER_PASSWD);
        factoryTestCluster = pairClusterTest.getKey();
        redisTemplateClusterTest = pairClusterTest.getValue();
        // Pair<JedisConnectionFactory, RedisTemplate> pair = redisTemplate(BlueMoonConsts.WashingService.REDIS_URL_2,
        // BlueMoonConsts.WashingService.REDIS_PORT_2, BlueMoonConsts.WashingService.REDIS_PASSWORD_2);
        // factory = pairPrd.getKey();
        // redisTemplate = pair.getValue();

        jedis = new Jedis(BlueMoonConsts.Local.REDIS_URL, BlueMoonConsts.Local.REDIS_PORT);
        jedis.auth(BlueMoonConsts.Local.REDIS_PASSWORD);

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

    private static Pair<JedisConnectionFactory, RedisTemplate<Object, Object>> redisTemplate(String host, int port, String password) {
        JedisConnectionFactory factory = new JedisConnectionFactory();
        factory.setHostName(host);
        factory.setPort(port);
        factory.setPassword(password);
        factory.afterPropertiesSet();

        RedisTemplate<Object, Object> redisTemplate = new RedisTemplate<>();
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setValueSerializer(new JdkSerializationRedisSerializer());
        redisTemplate.setConnectionFactory(factory);
        redisTemplate.afterPropertiesSet();
        return Pair.of(factory, redisTemplate);
    }

    private static Pair<JedisConnectionFactory, RedisTemplate<Object, Object>> redisTemplateCluster(String clusterUrl, String password) {
        RedisClusterConfiguration redisClusterConfiguration = new RedisClusterConfiguration();
        String[] urls = clusterUrl.split(",");
        for (String str : urls) {
            RedisNode redisNode = new RedisNode(str.split(":")[0], Integer.parseInt(str.split(":")[1]));
            redisClusterConfiguration.addClusterNode(redisNode);
        }
        JedisConnectionFactory factory = new JedisConnectionFactory(redisClusterConfiguration);
        factory.setPassword(password);
        factory.afterPropertiesSet();

        RedisTemplate<Object, Object> redisTemplate = new RedisTemplate<>();
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setValueSerializer(new StringRedisSerializer());
        redisTemplate.setConnectionFactory(factory);
        redisTemplate.afterPropertiesSet();
        return Pair.of(factory, redisTemplate);
    }

}
