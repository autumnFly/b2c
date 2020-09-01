package com.csair.b2c.cloud.test.learn.java.test;

import com.csair.b2c.cloud.test.learn.java.utils.RedisUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.data.redis.connection.*;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import redis.clients.jedis.Jedis;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created on 2018/12/26.<br/>
 *
 * @author yudong
 */
public class RedisTest {

    private static String REDIS_TEST_KEY = "B2C:CLOUD:TEST:COMPANY";

    @BeforeClass
    public static void init() {
        RedisUtils.init();
    }

    @Test
    public void test() {
        RedisTemplate<Object, Object> redisTemplate = RedisUtils.redisTemplateDev;
        redisTemplate.opsForValue().set(REDIS_TEST_KEY, "bluemoon");
        Object object = redisTemplate.opsForValue().get(REDIS_TEST_KEY);
        System.out.println(object);
        redisTemplate.delete(REDIS_TEST_KEY);
    }

    @Test
    public void test1() throws Exception {
        RedisUtils.factoryTest.setDatabase(4);
        byte[] data = RedisUtils.factoryTest.getConnection().get("A5D1EAD85A0312EFE0A72A32D72638A1".getBytes(StandardCharsets.UTF_8));
        BufferedInputStream bis = new BufferedInputStream(new ByteArrayInputStream(data));
        ObjectInputStream ois = new ObjectInputStream(bis);
        System.out.println("createTime:" + ois.readLong());
        System.out.println("createTime:" + ois.readObject());
        System.out.println("lastAccessedTime:" + ois.readObject());
        System.out.println("maxInactiveInterval:" + ois.readObject());
        System.out.println("isNew:" + ois.readObject());
        System.out.println("isValid:" + ois.readObject());
        System.out.println("thisAccessedTime:" + ois.readObject());
        System.out.println("id:" + ois.readObject());

        int count = (int) ois.readObject();
        System.out.println("attribute count:" + count);
        for (int i = 0; i < count; i++) {
            Object name = ois.readObject();
            Object value = ois.readObject();
            System.out.println(name + " " + value);
        }


        System.out.println();
    }

    @Test
    public void test2() {
        RedisTemplate<Object, Object> redisTemplate = RedisUtils.redisTemplateClusterTest;
        System.out.println(redisTemplate.opsForValue().get("BM_EC:service_app_manager:null:name"));
    }

    @Test
    public void test3() {
        JedisConnectionFactory factory = RedisUtils.factoryTestCluster;
        RedisClusterConnection connection = factory.getClusterConnection();
        Set<byte[]> keys = connection.keys("washing:mana:*".getBytes(StandardCharsets.UTF_8));
        for (byte[] key : keys) {
            DataType dataType = connection.type(key);
            System.out.println(new String(key) + " " + dataType.code());
            if (dataType == DataType.HASH) {
                connection.hGetAll(key).forEach((hkey, hvalue) -> {
                    System.out.println(new String(hkey) + " " + new String(hvalue));
                });
            } else if (dataType == DataType.SET) {
                for (byte[] sMember : connection.sMembers(key)) {
                    System.out.println(new String(sMember));
                }
            } else {
                System.out.println(new String(key));
            }
        }
    }

    @Test
    public void test4() {
        RedisTemplate<Object, Object> template = RedisUtils.redisTemplateDev;
        RedisConnection conn = template.getConnectionFactory().getConnection();
        Jedis jedis = RedisUtils.jedis;
        // 字符串get set del
        //set hello world
        template.opsForValue().set("hello", "world");
        //get hello
        System.out.println(template.opsForValue().get("hello"));
        //del hello
        conn.del(new StringRedisSerializer().serialize("hello"));
        System.out.println(template.opsForValue().get("hello"));

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
    public void test5() {
        RedisTemplate<Object, Object> template = RedisUtils.redisTemplateDev;
        Jedis jedis = RedisUtils.jedis;

        // 列表rpush lrange lindex lpop
        //rpush list-key item
        System.out.println(template.opsForList().rightPush("list-key", "item"));
        System.out.println(template.opsForList().rightPush("list-key", "item1"));
        //rpop list-key
        System.out.println(template.opsForList().rightPop("list-key"));
        //lpush list-key item2
        System.out.println(template.opsForList().leftPush("list-key", "item2"));
        System.out.println(template.opsForList().leftPush("list-key", "item3"));
        //lpop list-key
        System.out.println(template.opsForList().leftPop("list-key"));
        //lindex list-key 1
        System.out.println(template.opsForList().index("list-key", 1));
        System.out.println(template.opsForList().range("list-key", -2, -1));
        //lrange list-key 0 -1
        //0为起始索引,-1为结束索引
        System.out.println(template.opsForList().range("list-key", 0, -1));

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
    public void test6() {
        RedisTemplate<Object, Object> template = RedisUtils.redisTemplateDev;
        Jedis jedis = RedisUtils.jedis;

        // 哈希表hset hget hgetall hdel
        //hset hash-key name "liang yudong"
        template.opsForHash().put("hash-key", "name", "liang yudong");
        template.opsForHash().put("hash-key", "age", "22");
        template.opsForHash().put("hash-key", "country", "China");
        //hgetall hash-key
        System.out.println(template.opsForHash().entries("hash-key"));
        //hdel hash-key country
        System.out.println(template.opsForHash().delete("hash-key", "country"));

        jedis.hset("person", "name", "liangyudong");
        jedis.hset("person", "age", "23");
        System.out.println(jedis.hget("person", "name"));
        System.out.println(jedis.hgetAll("person"));
        System.out.println(jedis.hdel("person", "name"));
        System.out.println(jedis.hgetAll("person"));
    }

    @Test
    public void test7() {
        RedisTemplate<Object, Object> template = RedisUtils.redisTemplateDev;
        Jedis jedis = RedisUtils.jedis;
        // 有序键值对 zadd zrange zrangebyscore zrem
        //zadd zset-key 222 member1
        System.out.println(template.opsForZSet().add("zset-key", "member1", 222));
        System.out.println(template.opsForZSet().add("zset-key", "member2", 333));
        System.out.println(template.opsForZSet().add("zset-key", "member5", 555));
        //zrange zset-key 0 -1
        System.out.println(template.opsForZSet().range("zset-key", 0, -1));
        //zrange zset-key 0 -1 withscores 按分值大小排序返回
        System.out.println(template.opsForZSet().rangeByScore("zset-key", 0, -1));
        //zrangebyscore zset-key 100 350 withscores
        System.out.println(template.opsForZSet().rangeByScoreWithScores("zset-key", 100, 350));
        //zrem zset-key member5
        System.out.println(template.opsForZSet().remove("zset-key", "member5"));

        jedis.zadd("scores", 98, "liangyudong");
        jedis.zadd("scores", 92, "Jack");
        jedis.zadd("scores", 93, "Rose");
        System.out.println(jedis.zrange("scores", 0, -1));
        System.out.println(jedis.zrangeByScore("scores", 90, 95));
        System.out.println(jedis.zrem("scores", "liangyudong"));

    }


    @Test
    public void test8() {
        Jedis jedis = RedisUtils.jedis;

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
    public void testIncrease() {
        Jedis jedis = RedisUtils.jedis;

        System.out.println(jedis.incr("count"));
        System.out.println(jedis.decr("count"));
        System.out.println(jedis.incrBy("count", 10));
        System.out.println(jedis.decrBy("count", 10));
        System.out.println(jedis.incrByFloat("count", 0.5));
    }


    @Test
    public void testMessageQueue() throws InterruptedException {
        String channelName = "orderCode";
        RedisTemplate<Object, Object> template = RedisUtils.redisTemplateDev;

        Executors.newCachedThreadPool().submit(
                () -> template.getConnectionFactory()
                        .getConnection()
                        .subscribe((message, pattern) -> {
                            System.out.println("message:" + message);
                            System.out.println("pattern:" + new String(pattern));
                        }, channelName.getBytes())
        );

        while (true) {
            TimeUnit.SECONDS.sleep(3);
            String code = RandomStringUtils.randomAlphabetic(10);
            System.out.println("produce code:" + code);
            template.getConnectionFactory()
                    .getConnection()
                    .publish(channelName.getBytes(), code.getBytes());
        }
    }

    @Test
    public void testTransaction() throws InterruptedException {
        Jedis jedis = RedisUtils.jedis;
        RedisConnectionFactory redisConnectionFactory = RedisUtils.redisTemplateDev.getConnectionFactory();
        for (int i = 0; i < 3; i++) {
            Thread thread = new Thread(() -> {
                System.out.println(redisConnectionFactory.getConnection().incr("count".getBytes()));
                try {
                    TimeUnit.MILLISECONDS.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                redisConnectionFactory.getConnection().incrBy("count".getBytes(), -1);
            });
            thread.start();
        }
        TimeUnit.SECONDS.sleep(2);
        System.out.println(jedis.get("count"));

        for (int i = 0; i < 3; i++) {
            Thread thread = new Thread(() -> {
                RedisConnection connection = redisConnectionFactory.getConnection();
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
        Jedis jedis = RedisUtils.jedis;

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

    @Test
    public void testDel() {
        RedisTemplate<Object, Object> redisTemplate = RedisUtils.redisTemplateClusterTest;
        redisTemplate.delete("kafkaSendErrorMsg");
    }
}
