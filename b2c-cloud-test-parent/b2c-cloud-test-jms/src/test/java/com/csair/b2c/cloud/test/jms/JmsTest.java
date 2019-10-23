package com.csair.b2c.cloud.test.jms;

import java.util.concurrent.TimeUnit;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;
import javax.jms.Session;

import org.apache.activemq.command.ActiveMQTopic;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = { JmsApplication.class })
public class JmsTest {
	@Autowired
	private JmsTemplate jmsTemplate;

	@Test
	public void testQueue() throws InterruptedException, JMSException {
		jmsTemplate.send(new MessageCreator() {
			@Override
			public Message createMessage(Session session) throws JMSException {
				return session.createObjectMessage("hello world from queue");
			}
		});
		// TimeUnit.SECONDS.sleep(2);
		// ObjectMessage message = (ObjectMessage) jmsTemplate.receive();
		// System.out.println(message.getObject());
	}

	// @Test
	public void testTopic() throws InterruptedException, JMSException {
		Destination destination = new ActiveMQTopic("active.topic");
		jmsTemplate.send(destination, new MessageCreator() {

			@Override
			public Message createMessage(Session session) throws JMSException {
				return session.createObjectMessage("hello world from topic");
			}
		});
		TimeUnit.SECONDS.sleep(2);
		ObjectMessage message = (ObjectMessage) jmsTemplate.receive(destination);
		System.out.println(message.getObject());
	}
}
