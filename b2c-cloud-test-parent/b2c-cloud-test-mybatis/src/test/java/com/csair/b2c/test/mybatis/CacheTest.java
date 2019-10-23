package com.csair.b2c.test.mybatis;

import com.csair.b2c.test.mybatis.mapper.mysql.CountryMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by yu on 2018/4/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CacheTest {

    @Autowired
    private CountryMapper mapper;

    @Test
    public void test() {
        System.out.println(mapper.selectByPrimaryKey((short) 2));
    }
}
