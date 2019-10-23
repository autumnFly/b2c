package com.csair.b2c.cloud.test.mail;

import com.csair.b2c.cloud.test.mail.service.MailService;
import com.icegreen.greenmail.util.GreenMail;
import com.icegreen.greenmail.util.ServerSetup;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.mail.internet.MimeMessage;
import java.util.Properties;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MailApplication.class)
public class GreenMailTest {

    private JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
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

        mailSender.setHost(env.getProperty("greenmail.host"));
        mailSender.setUsername(env.getProperty("greenmail.username"));
        mailSender.setPassword(env.getProperty("greenmail.password"));
        mailSender.setDefaultEncoding("UTF-8");
        Properties prop = new Properties();
        prop.put("mail.smtp.auth", "false");
        prop.put("mail.smtp.starttls.enable", "false");
        // 设置调试模式可以在控制台查看发送过程
        prop.put("mail.debug", "true");
        prop.put("mail.smtp.starttls.required", "false");
        mailSender.setJavaMailProperties(prop);

        mailService.setMailSender(mailSender);
    }

    @Test
    public void testSend() throws Exception {
        mailService.sendPlainEmail(env.getProperty("greenmail.username"), "375709770@qq.com", "来自Java", "这个测试邮件");

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
