package com.csair.b2c.cloud.test.learn.maven;

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
@ActiveProfiles({"dev", "default"})
public class GreenMailTest {

    private GreenMail greenMail;

    @Autowired
    private Environment env;

    @Autowired
    private MailService mailService;

    @Before
    public void startMailService() {
        greenMail = new GreenMail(ServerSetup.SMTP);
        greenMail.setUser(env.getProperty("greenmail.username"), env.getProperty("greenmail.password"));
        greenMail.start();
    }

    @Test
    public void testSend() throws Exception {

        mailService.sendEmail("375709770@qq.com", env.getProperty("greenmail.username"), "这个是测试邮件");

        greenMail.waitForIncomingEmail(2000, 1);

        MimeMessage[] mimeMessages = greenMail.getReceivedMessages();

        System.out.println(mimeMessages[0].getSubject());
        System.out.println(mimeMessages[0].getContent());
    }

    @After
    public void stopMailService() {
        greenMail.stop();
    }
}
