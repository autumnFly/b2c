package com.csair.b2c.cloud.test.sys;

import com.alibaba.fastjson.JSONObject;
import com.csair.b2c.cloud.test.sys.repository.InsureRepository;
import com.mongodb.BasicDBObject;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import redis.clients.jedis.JedisCluster;

import java.util.Arrays;
import java.util.List;

/**
 * Created by yu on 2018/6/1.
 */
public class SysTest extends CommonTestCode {
    @Autowired
    private MongoTemplate mongoTemplateCluster;
    @Autowired
    private JedisCluster jedisCluster;
    @Autowired
    private InsureRepository insureRepository;

    @Test
    public void testMongodb() throws Exception {
        Query query = Query.query(Criteria.where("type")
                .is("b")
                .and("inUsed")
                .is("1")
                .and("scope")
                .in(Arrays.asList("D", "ID")));
        List<BasicDBObject> object = mongoTemplateCluster.findAll(BasicDBObject.class, "CMC_INSUR_CONFIG");
        System.out.println(JSONObject.toJSONString(object));
    }

    @Test
    public void testMongodbRepo() throws Exception {
        System.out.println(JSONObject.toJSONString(insureRepository.findInsuranceInfo("b"), true));
    }

}
