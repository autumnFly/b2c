package com.csair.b2c.cloud.test.learn.java.test;

import com.alibaba.fastjson.JSON;
import com.csair.b2c.cloud.test.learn.java.utils.KafkaUtils;
import com.google.common.collect.Maps;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.Map;

/**
 * @author yudong
 * @date 2020/6/11
 */
@Slf4j
public class KafkaTest {

    @Test
    public void test() {
        Map<String, Object> map = Maps.newHashMap();
        map.put("id", 8249);
        map.put("topic", "test_topic");
        map.put("key", null);
        map.put("value", "{\"name\":\"liangyudong\"}");
        KafkaUtils.kafkaTemplateClusterTest.send("mall_moonmall_statistical_success", JSON.toJSONString(map));
        KafkaUtils.kafkaTemplateClusterTest.flush();
    }

}
