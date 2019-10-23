package com.csair.b2c.test.mybatis.runner;

import com.csair.b2c.test.mybatis.mapper.mysql.CountryMapper;
import com.csair.b2c.test.mybatis.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * <p>在所有 Spring Beans 都初始化之后，SpringApplication.run() 之前执行</p>
 * Created on 2019/2/27.<br/>
 *
 * @author yudong
 */
@Order(1)
@Component
public class CacheCountryToRedis implements CommandLineRunner {

    @Autowired
    private CountryMapper countryMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    private static final String prefix = "b2c:mybatis:country:";

    @Override
    public void run(String... args) {
        // List<Country> countries = countryMapper.selectAll();
        // countries.forEach(country -> {
        //     String countryPrefix = prefix + country.getCountryId();
        //     redisTemplate.opsForValue().set(countryPrefix, country, 10, TimeUnit.DAYS);
        // });
    }
}
