package com.csair.b2c.cloud.test.sys;

import com.csair.b2c.cloud.test.sys.model.B2cPolicyInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created on 2018/6/23.
 *
 * @author yudong
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SysApplication.class)
public class MqTest {
    @Autowired
    private MongoTemplate mongoTemplate;

    @Test
    public void testMongodb() throws Exception {
        Query query = new Query(Criteria.where("policyNo").is("10450031900247557836"));
        B2cPolicyInfo obj = mongoTemplate.findOne(query, B2cPolicyInfo.class, "b2c_policy_info");
        System.out.println(obj.getValidateCode());

    }
}
