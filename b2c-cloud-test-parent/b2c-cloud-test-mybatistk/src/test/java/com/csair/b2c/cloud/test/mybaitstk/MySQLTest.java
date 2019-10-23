package com.csair.b2c.cloud.test.mybaitstk;

import com.alibaba.fastjson.JSONObject;
import com.csair.b2c.cloud.test.mybatistk.MybatisTkApplication;
import com.csair.b2c.cloud.test.mybatistk.enums.StatusEnum;
import com.csair.b2c.cloud.test.mybatistk.enums.VisibleEnum;
import com.csair.b2c.cloud.test.mybatistk.mapper.ActorMapper;
import com.csair.b2c.cloud.test.mybatistk.mapper.CountryMapper;
import com.csair.b2c.cloud.test.mybatistk.model.Actor;
import com.csair.b2c.cloud.test.mybatistk.model.Country;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by yu on 2018/4/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MybatisTkApplication.class)
public class MySQLTest {

    @Autowired
    private ActorMapper actorMapper;
    @Autowired
    private CountryMapper countryMapper;

    @Test
    public void test4() {
        List<Country> list = countryMapper.selectAll();
        System.out.println(list);

        Country country = new Country();
        country.setId(10015L);
        country = countryMapper.selectOne(country);

        System.out.println(JSONObject.toJSONString(country,true));
    }

    @Test
    public void test3() {
        Country country = new Country();
        country.setCountryname("美国");
        country.setCountrycode("USA");
        country.setStatusEnum(StatusEnum.ALIPAY);
        country.setVisibleEnum(VisibleEnum.SHOW);

        int affect = countryMapper.insert(country);
        System.out.println(affect);
    }

    @Test
    public void test() {
        PageHelper.startPage(20, 10);
        List<Actor> actors = actorMapper.findAll();
        PageInfo<Actor> pageInfo = new PageInfo<>(actors);
        System.out.println(JSONObject.toJSONString(pageInfo, true));
    }

    @Test
    public void test1() {
        PageHelper.startPage(20, 10);
        List<Actor> actors = actorMapper.selectAll();
        System.out.println(JSONObject.toJSONString(actors, true));
    }
}
