package com.csair.b2c.cloud.test.learn.java.test;

import com.csair.b2c.cloud.test.learn.java.utils.RedisUtils;
import org.junit.Test;
import org.springframework.data.redis.connection.RedisClusterConnection;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import java.nio.charset.StandardCharsets;
import java.util.Set;

/**
 * Created on 2018/12/26.<br/>
 *
 * @author yudong
 */
public class RedisTest {

    private static String REDIS_TEST_KEY = "B2C:CLOUD:TEST:COMPANY";

    @Test
    public void test() {
        RedisTemplate redisTemplate = RedisUtils.redisTemplateDev;
        redisTemplate.opsForValue().set(REDIS_TEST_KEY, "bluemoon");
        Object object = redisTemplate.opsForValue().get(REDIS_TEST_KEY);
        System.out.println(object);
        redisTemplate.delete(REDIS_TEST_KEY);
    }

    @Test
    public void test1() {
        RedisTemplate redisTemplate = RedisUtils.redisTemplateTest;
        redisTemplate.opsForValue().set(REDIS_TEST_KEY, "bluemoon");
        Object object = redisTemplate.opsForValue().get(REDIS_TEST_KEY);
        System.out.println(object);
        redisTemplate.delete(REDIS_TEST_KEY);
    }

    @Test
    public void test2() {
        RedisTemplate redisTemplate = RedisUtils.redisTemplateClusterTest;
        System.out.println(redisTemplate.opsForValue().get("BM_EC:service_app_manager:U18101210443058835251:name"));
    }

    @Test
    public void test3() {
        JedisConnectionFactory factory = RedisUtils.factoryTestCluster;
        RedisClusterConnection connection = factory.getClusterConnection();
        Set<byte[]> keys = connection.keys("BM_EC:service_app_manager*".getBytes(StandardCharsets.UTF_8));
        for (byte[] key : keys) {
            System.out.println(new String(key));
            System.out.println(new String(connection.get(key)));
        }
    }

}
