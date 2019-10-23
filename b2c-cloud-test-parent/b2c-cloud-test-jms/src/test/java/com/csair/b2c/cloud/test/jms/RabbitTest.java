package com.csair.b2c.cloud.test.jms;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = { JmsApplication.class })
public class RabbitTest {
	@Autowired
	private RabbitTemplate rabbitTemplate;

	//@Test
	public void testTopicExchange() {
		Message message = new Message("hello world from rabbit topic".getBytes(), new MessageProperties());
		rabbitTemplate.send("directExchange", "rabbit.queue.direct", message);
	}

	@Test
	public void testReceive() {
		Message message = rabbitTemplate.receive("rabbit.queue.hello");
		System.out.println(message.getBody());
	}
}
