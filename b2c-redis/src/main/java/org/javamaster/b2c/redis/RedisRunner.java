package org.javamaster.b2c.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @author yudong
 * @date 2020/9/15
 */
@Component
public class RedisRunner implements CommandLineRunner {

    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;

    @Override
    public void run(String... args) throws Exception {
        while (true) {
            redisTemplate.opsForValue().set("name","yudong");
            System.out.println(redisTemplate.opsForValue().get("name"));
            TimeUnit.SECONDS.sleep(5);
        }
    }
}
