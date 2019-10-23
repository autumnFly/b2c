package com.csair.b2c.cloud.test.learn.java.test;

import com.csair.b2c.cloud.test.learn.java.utils.RedisUtils;
import org.junit.Test;
import org.springframework.data.redis.core.RedisTemplate;

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

}
