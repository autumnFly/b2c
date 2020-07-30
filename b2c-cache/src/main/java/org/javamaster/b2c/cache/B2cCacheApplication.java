package org.javamaster.b2c.cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.cache.RedisCacheWriter;
import org.springframework.data.redis.connection.RedisConnectionFactory;

/**
 * @author yudong
 * @date 2020/7/30
 */
@EnableCaching
@SpringBootApplication
public class B2cCacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(B2cCacheApplication.class, args);
    }

    @Bean
    public CacheManager cacheManager(RedisConnectionFactory connectionFactory) {
        RedisCacheWriter redisCacheWriter = RedisCacheWriter.lockingRedisCacheWriter(connectionFactory);
        return new RedisCacheManager(redisCacheWriter, RedisCacheConfiguration.defaultCacheConfig());
    }
}
