package com.csair.b2c.cloud.test.mail;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * 把通用的测试代码抽取成一个父类,杜绝每次新建一个测试类都要重复复制粘贴
 * 
 * @author yudong
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MailApplication.class)
@WebAppConfiguration
public class CommonTestCode {
	@Autowired
	protected WebApplicationContext context;

	protected MockMvc mockMvc;

	protected static MockHttpSession session = new MockHttpSession();

	@Before
	public void initMockMvc() {
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}

}
