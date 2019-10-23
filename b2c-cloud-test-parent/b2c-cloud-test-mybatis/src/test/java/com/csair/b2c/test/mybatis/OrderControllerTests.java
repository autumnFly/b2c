package com.csair.b2c.test.mybatis;

import com.alibaba.fastjson.JSONObject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yu on 2018/4/13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MybatisApplication.class)
@WebAppConfiguration
public class OrderControllerTests {
    @Autowired
    protected WebApplicationContext context;

    protected MockMvc mockMvc;
    protected static MockHttpSession session = new MockHttpSession();

    @Before
    public void initMockMvc() {
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @Test
    public void testChangePlaneOrderDetail() throws Exception {
        Map<String, String> req = new HashMap<>();
        req.put("name", "liang yudong");
        mockMvc.perform(MockMvcRequestBuilders.post("/order/getOrder").session(session)
                .contentType(MediaType.APPLICATION_JSON_UTF8).content(JSONObject.toJSONString(req)))
                .andDo(MockMvcResultHandlers.print()).andExpect(MockMvcResultMatchers.status().isOk());
    }
}

