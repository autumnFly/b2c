package com.csair.b2c.cloud.test.mail;

import com.csair.b2c.cloud.test.mail.service.MailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MailApplication.class)
public class MailTest {

    @Autowired
    private MailService mailService;

    @Test
    public void sendSimpleMail() throws Exception {
        mailService.sendPlainEmail("18826483963@163.com", "375709770@qq.com"
                , "主题：简单邮件", "测试邮件内容,来自Java程序");
    }

    //     @Test
    public void sendAttachmentsMail() throws Exception {
        mailService.sendAttachAndInlineEmail("18826483963@163.com", "375709770@qq.com"
                , "主题：有附件邮件", "测试邮件内容,来自Java程序");

    }

    //     @Test
    public void sendInlineMail() throws Exception {
        mailService.sendInlineMail("18826483963@163.com", "375709770@qq.com"
                , "主题：嵌入静态资源", "<html><body><img src=\"cid:sample\" ></body></html>");
    }

}
