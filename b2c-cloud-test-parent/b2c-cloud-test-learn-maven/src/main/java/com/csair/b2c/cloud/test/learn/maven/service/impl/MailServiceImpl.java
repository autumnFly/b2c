package com.csair.b2c.cloud.test.learn.maven.service.impl;

import com.csair.b2c.cloud.test.learn.maven.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailServiceImpl implements MailService {

	@Autowired
	private JavaMailSender mailSender;

	@Override
	public void sendEmail(String to, String from, String content) {
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		mailMessage.setFrom(from);
		mailMessage.setTo(to);
		mailMessage.setSubject("来自Java系统");
		mailMessage.setText(content);
		mailSender.send(mailMessage);
	}
}
