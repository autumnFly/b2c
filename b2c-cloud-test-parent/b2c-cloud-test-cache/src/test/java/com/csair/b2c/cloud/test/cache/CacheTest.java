package com.csair.b2c.cloud.test.cache;

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

/**
 * Created by yu on 2018/4/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = CacheApplication.class)
@WebAppConfiguration
public class CacheTest {
    @Autowired
    protected WebApplicationContext context;

    protected MockMvc mockMvc;

    protected static MockHttpSession session = new MockHttpSession();

    @Before
    public void initMockMvc() {
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    //    @Test
    public void testCacheable() throws Exception {
        String id = "1000001";
        mockMvc.perform(MockMvcRequestBuilders.get("/cacheable")
                .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                .param("id", id)
                .session(session))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").value(id));
    }

    @Test
    public void testCachePut() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/cachePut")
                .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                .param("author", "yudong")
                .param("title", "redis master")
                .session(session))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.author").value("yudong"));
    }
}

