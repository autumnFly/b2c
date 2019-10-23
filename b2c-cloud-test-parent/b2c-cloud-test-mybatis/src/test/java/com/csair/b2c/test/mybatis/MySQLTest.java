package com.csair.b2c.test.mybatis;

import com.alibaba.fastjson.JSONObject;
import com.csair.b2c.test.mybatis.entity.Actor;
import com.csair.b2c.test.mybatis.mapper.mysql.TestMapper;
import com.csair.b2c.test.mybatis.model.SelectActorReqEntity;
import com.csair.b2c.test.mybatis.repository.mysql.ActorRepository;
import com.csair.b2c.test.mybatis.service.TransactionTestService;
import com.google.common.collect.Sets;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by yu on 2018/4/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class MySQLTest {
    @Autowired
    private ActorRepository actorRepository;
    @Autowired
    @Qualifier("mysqlDataSource")
    private DataSource dataSource;

    @Autowired
    private TestMapper testMapper;

    @Autowired
    private TransactionTestService transactionTestService;

    @Test
    public void test() throws Exception {
        Connection connection = dataSource.getConnection();
        Actor actor = actorRepository.findByActorId(1);
        System.out.println(JSONObject.toJSONString(actor, true));
    }

    @Test
    public void test1() {
        List<Map<String, String>> actors = testMapper.selectActors(Arrays.asList("1", "2"));
        Set<String> types = Sets.newHashSet();
        types.add(null);
        for (Map<String, String> actor : actors) {
            types.add(actor.get("lastName"));
        }
        System.out.println(types);
    }

    @Test
    public void test2() {
        SelectActorReqEntity entity = new SelectActorReqEntity();
        entity.setActorId(1);
        List<Map<String, String>> actors = testMapper.selectActor(entity, "PENELOPE");
        Set<String> types = Sets.newHashSet();
        types.add(null);
        for (Map<String, String> actor : actors) {
            types.add(actor.get("lastName"));
        }
        System.out.println(types);
    }

    @Test
    public void test3() {
        transactionTestService.handlerRecord();
    }
}
