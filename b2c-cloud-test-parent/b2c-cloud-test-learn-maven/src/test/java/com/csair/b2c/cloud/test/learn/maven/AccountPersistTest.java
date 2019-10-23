package com.csair.b2c.cloud.test.learn.maven;

import com.alibaba.fastjson.JSONObject;
import com.csair.b2c.cloud.test.learn.maven.model.Account;
import com.csair.b2c.cloud.test.learn.maven.service.AccountPersistService;
import com.csair.b2c.cloud.test.learn.maven.service.MailService;
import com.icegreen.greenmail.util.GreenMail;
import com.icegreen.greenmail.util.ServerSetup;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.mail.internet.MimeMessage;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = LearnMavenApplication.class)
public class AccountPersistTest {

    @Autowired
    private AccountPersistService service;


    @Test
    public void testCreate() {
        Account account = new Account();
        account.setId("yudong");
        account.setEmail("375709770@qq.com");
        account.setShowName("于东");
        account.setPwd("123456");
        account.setActivated(true);
        service.createAcount(account);
    }

    @Test
    public void testRead() {
        Account account = service.readAcount("yudong");
        System.out.println(JSONObject.toJSONString(account));
    }

}
