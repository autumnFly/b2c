package com.csair.b2c.cloud.test.redis;

import org.apache.commons.lang3.RandomStringUtils;
import org.javamaster.b2c.config.BlueMoonConsts;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import redis.clients.jedis.Jedis;

import java.util.concurrent.TimeUnit;

public class NoSpringRedisTest {

    private static RedisConnectionFactory jedisConnectionFactory;
    private static RedisConnection conn;
    static Jedis jedis;
    private static RedisTemplate redisTemplate;
    private static StringRedisTemplate stringRedisTemplate;

    @BeforeClass
    public static void init() {
        RedisStandaloneConfiguration configuration = new RedisStandaloneConfiguration(BlueMoonConsts.Local.REDIS_URL,
                BlueMoonConsts.Local.REDIS_PORT);
        configuration.setPassword(BlueMoonConsts.Local.REDIS_PASSWORD);
        jedisConnectionFactory = new JedisConnectionFactory(configuration);
        conn = jedisConnectionFactory.getConnection();
        jedis = new Jedis(BlueMoonConsts.Local.REDIS_URL, BlueMoonConsts.Local.REDIS_PORT);
        jedis.auth(BlueMoonConsts.Local.REDIS_PASSWORD);
        redisTemplate = new RedisTemplate();
        redisTemplate.setConnectionFactory(jedisConnectionFactory);
        redisTemplate.afterPropertiesSet();
        stringRedisTemplate = new StringRedisTemplate();
        stringRedisTemplate.setConnectionFactory(jedisConnectionFactory);
        stringRedisTemplate.afterPropertiesSet();
    }

    @Before
    public void before() {
        jedis.flushAll();
    }

    @Test
    public void testString() {
        jedis.set("name", "liangyudong");
        System.out.println(jedis.get("name"));
        System.out.println(jedis.append("name", " jufeng98"));
        System.out.println(jedis.getrange("name", 12, jedis.strlen("name")));
        System.out.println(jedis.setrange("name", 12, "yu"));
        System.out.println(jedis.get("name"));
        System.out.println(jedis.getbit("name", 0));
        System.out.println(jedis.setbit("name", 0, true));
        System.out.println(jedis.get("name"));
        System.out.println(jedis.bitcount("name"));
        jedis.del("name");
    }

    @Test
    public void testList() {
        jedis.lpush("alphabet", "b");
        jedis.lpush("alphabet", "a");
        jedis.rpush("alphabet", "c");
        jedis.rpush("alphabet", "d");
        System.out.println(jedis.lrange("alphabet", 0, jedis.llen("alphabet")));
        System.out.println(jedis.lindex("alphabet", 2));
        System.out.println(jedis.lpop("alphabet"));
        System.out.println(jedis.lrange("alphabet", 0, jedis.llen("alphabet")));
    }

    @Test
    public void testSet() {
        jedis.sadd("alphabet", "a", "b", "b", "c");
        jedis.sadd("bet", "b", "d");
        System.out.println(jedis.smembers("alphabet"));
        System.out.println(jedis.sismember("alphabet", "a"));
        System.out.println(jedis.srem("alphabet", "a"));
        System.out.println(jedis.sinter("alphabet", "bet"));
        System.out.println(jedis.sunion("alphabet", "bet"));
        System.out.println(jedis.sdiff("alphabet", "bet"));
    }

    @Test
    public void testHash() {
        jedis.hset("person", "name", "liangyudong");
        jedis.hset("person", "age", "23");
        System.out.println(jedis.hget("person", "name"));
        System.out.println(jedis.hgetAll("person"));
        System.out.println(jedis.hdel("person", "name"));
        System.out.println(jedis.hgetAll("person"));
    }

    @Test
    public void testZset() {
        jedis.zadd("scores", 98, "liangyudong");
        jedis.zadd("scores", 92, "Jack");
        jedis.zadd("scores", 93, "Rose");
        System.out.println(jedis.zrange("scores", 0, -1));
        System.out.println(jedis.zrangeByScore("scores", 90, 95));
        System.out.println(jedis.zrem("scores", "liangyudong"));
    }

    @Test
    public void testIncrease() {
        System.out.println(jedis.incr("count"));
        System.out.println(jedis.decr("count"));
        System.out.println(jedis.incrBy("count", 10));
        System.out.println(jedis.decrBy("count", 10));
        System.out.println(jedis.incrByFloat("count", 0.5));
    }

    @Test
    public void testMessageQueue() throws InterruptedException {
        new Thread(() ->
                jedisConnectionFactory.getConnection().subscribe((message, pattern) ->
                        System.out.println(message), "orderCode".getBytes()))
                .start();

        while (true) {
            TimeUnit.SECONDS.sleep(3);
            String code = RandomStringUtils.randomAlphabetic(10);
            System.out.println("pro:" + code);
            jedisConnectionFactory.getConnection().publish("orderCode".getBytes(), code.getBytes());
        }
    }

    @Test
    public void testTransaction() throws InterruptedException {
        for (int i = 0; i < 3; i++) {
            Thread thread = new Thread(() -> {
                System.out.println(jedisConnectionFactory.getConnection().incr("count".getBytes()));
                try {
                    TimeUnit.MILLISECONDS.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                jedisConnectionFactory.getConnection().incrBy("count".getBytes(), -1);
            });
            thread.start();
        }
        TimeUnit.SECONDS.sleep(2);
        System.out.println(jedis.get("count"));

        for (int i = 0; i < 3; i++) {
            Thread thread = new Thread(() -> {
                RedisConnection connection = jedisConnectionFactory.getConnection();
                connection.openPipeline();
                connection.multi();
                System.out.println(connection.incr("count1".getBytes()));
                try {
                    TimeUnit.MILLISECONDS.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                connection.incrBy("count1".getBytes(), -1);
                connection.exec();
                connection.closePipeline();
            });
            thread.start();
        }
        TimeUnit.SECONDS.sleep(2);
        System.out.println(jedis.get("count1"));
    }

    @Test
    public void testExpire() throws InterruptedException {
        jedis.set("name", "liangyudong");
        jedis.expire("name", 3);
        TimeUnit.SECONDS.sleep(2);
        System.out.println(jedis.ttl("name"));
        TimeUnit.SECONDS.sleep(3);
        System.out.println(jedis.get("name"));

        jedis.set("name", "liangyudong");
        jedis.expireAt("name", System.currentTimeMillis() + 1000);
        TimeUnit.SECONDS.sleep(2);
        System.out.println(jedis.get("name"));

    }
}
