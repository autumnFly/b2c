package com.csair.b2c.cloud.test.sys;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.client.RestTemplate;
import redis.clients.jedis.JedisCluster;

/**
 * Created on 2018/8/20.<br/>
 *
 * @author yudong
 */
public class AopTest extends CommonTestCode {

    @Autowired
    @Qualifier("restTemplateOut")
    private RestTemplate restTemplateOut;
    @Autowired
    private JedisCluster jedisCluster;

    @Test
    public void testRestTemplateLog() throws Exception {
        restTemplateOut.getForObject("http://10.79.1.81:8848/orderManagement/packagetime/version", String.class);
        jedisCluster.set("hello:world","hello world");
        jedisCluster.get("hello:world");
    }
}
