package com.csair.b2c.cloud.test.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = RedisApplication.class)
public class RedisTest {
	@Autowired
	private StringRedisTemplate template;
	@Autowired
	private RedisConnection conn;

	@Test
	public void testRedis() {

		// 字符串get set del
		//set hello world
		template.opsForValue().set("hello", "world");
		//get hello
		System.out.println(template.opsForValue().get("hello"));
		//del hello
		conn.del(new StringRedisSerializer().serialize("hello"));
		System.out.println(template.opsForValue().get("hello"));

		// 列表rpush lrange lindex lpop
		//rpush list-key item
		template.opsForList().rightPush("list-key", "item");
		template.opsForList().rightPush("list-key", "item1");
		//rpop list-key
		template.opsForList().rightPop("list-key");
		//lpush list-key item2
		template.opsForList().leftPush("list-key", "item2");
		template.opsForList().leftPush("list-key", "item3");
		//lpop list-key
		template.opsForList().leftPop("list-key");
		//lindex list-key 1
		template.opsForList().index("list-key", 1);
		template.opsForList().range("list-key", -2, -1);
		//lrange list-key 0 -1
		//0为起始索引,-1为结束索引
		template.opsForList().range("list-key", 0, -1);

		// 集合 sadd smembers sismember srem
		//sadd set-key item 1表示添加成功,0表示已存在该元素
		template.opsForSet().add("set-key","item");
		template.opsForSet().add("set-key", "item1", "item2", "item3");
		//smembers set-key 获取所有的元素
		template.opsForSet().members("set-key");
		//sismember set-key item 元素是否在集合里
		template.opsForSet().isMember("set-key", "item1");
		//srem set-key item 删除该元素,返回删除的数量
		template.opsForSet().remove("set-key", "item1");

		// 哈希表hset hget hgetall hdel
		//hset hash-key name "liang yudong"
		template.opsForHash().put("hash-key", "name", "liang yudong");
		template.opsForHash().put("hash-key", "age", "22");
		template.opsForHash().put("hash-key", "country", "China");
		//hgetall hash-key
		template.opsForHash().entries("hash-key");
		//hdel hash-key country
		template.opsForHash().delete("hash-key", "country");

		// 有序键值对 zadd zrange zrangebyscore zrem
		//zadd zset-key 222 member1
		template.opsForZSet().add("zset-key", "member1", 222);
		template.opsForZSet().add("zset-key", "member2", 333);
		template.opsForZSet().add("zset-key", "member5", 555);
		//zrange zset-key 0 -1
		template.opsForZSet().range("zset-key", 0, -1);
		//zrange zset-key 0 -1 withscores 按分值大小排序返回
		template.opsForZSet().rangeByScore("zset-key", 0, -1);
		//zrangebyscore zset-key 100 350 withscores
		template.opsForZSet().rangeByScoreWithScores("zset-key", 100, 350);
		//zrem zset-key member5
		template.opsForZSet().remove("zset-key", "member5");
	}
}
