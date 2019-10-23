package com.csair.b2c.cloud.test.mail.service;

import org.apache.commons.lang.StringEscapeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;
import org.thymeleaf.TemplateEngine;

import javax.mail.internet.MimeMessage;
import java.io.File;


@Service
public class MailService {
    @Autowired
    private JavaMailSender mailSender;
     @Autowired
    private TemplateEngine templateEngine;

    public void sendPlainEmail(String from, String to, String sub, String txt) {
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setFrom(from);
        mailMessage.setTo(to);
        mailMessage.setSubject(sub);
        mailMessage.setText(txt);
        mailSender.send(mailMessage);
    }

    public void sendInlineMail(String from, String to, String sub, String htmlTxt)throws
            Exception{
        MimeMessage mimeMessage = mailSender.createMimeMessage();

        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
        helper.setFrom(from);
        helper.setTo(to);
        helper.setSubject(sub);
        String string = StringEscapeUtils.escapeHtml(htmlTxt);
        helper.setText(string, true);

        FileSystemResource file = new FileSystemResource(ResourceUtils.getFile("classpath:images/sample.jpg"));
        helper.addInline("sample", file);

        mailSender.send(mimeMessage);
    }

    public void sendAttachAndInlineEmail(String from, String to, String sub, String txt) throws
            Exception {
        MimeMessage mailMessage = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mailMessage);
        helper.setFrom(from);
        helper.setTo(to);
        helper.setSubject(sub);
        helper.setText(txt);
        File file = ResourceUtils.getFile("public/images/image103.jpg");
        helper.addAttachment("附件-image", file);
        File file1 = ResourceUtils.getFile("public/images/0312.jpg");
        helper.addInline("apple", file1);
        mailSender.send(mailMessage);
    }

/*	public void sendTemplateEmail() throws Exception {
        MimeMessage mailMessage = mailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(mailMessage);
		helper.setFrom("375709770@qq.com");
		helper.setTo("lydong模版测试邮件,来自Java");
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("username", "大爷");
		template.
		String string = FreeMarkerTemplateUtils.processTemplateIntoString(
				template, model);
		helper.setText(string);
		mailSender.send(mailMessage);
	}*/

    public void setMailSender(JavaMailSender mailSender){
        this.mailSender=mailSender;
    }
}
