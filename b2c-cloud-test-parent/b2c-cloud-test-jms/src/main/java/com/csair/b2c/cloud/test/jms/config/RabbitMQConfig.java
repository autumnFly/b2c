package com.csair.b2c.cloud.test.jms.config;

import com.csair.b2c.cloud.test.jms.constant.JmsConst;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * Created by yu on 2018/4/30.
 */
@Configuration
public class RabbitMQConfig {
    Logger logger = LoggerFactory.getLogger(getClass());

    @Value("${rabbitmq.address}")
    private String address;
    @Value("${rabbitmq.port}")
    private String port;
    @Value("${rabbitmq.username}")
    private String username;
    @Value("${rabbitmq.password}")
    private String password;
    @Value("${rabbitmq.virtualHost}")
    private String virtualHost;

    @Bean
    public ConnectionFactory rabbitMQconnectionFactory() {
        CachingConnectionFactory connectionFactory = new CachingConnectionFactory();
        logger.info("rabbitMQconnectionFactory start to create,host:{},port:{},username:{},password:{},virtualHost:{}"
                , address, port, username, password, virtualHost);
        connectionFactory.setAddresses(address + ":" + port);
        connectionFactory.setUsername(username);
        connectionFactory.setPassword(password);
        connectionFactory.setVirtualHost(virtualHost);
        // 必须要设置
        connectionFactory.setPublisherConfirms(true);
        return connectionFactory;
    }

    @Bean
    public RabbitTemplate rabbitTemplate(ConnectionFactory rabbitMQconnectionFactory) {
        RabbitTemplate template = new RabbitTemplate(rabbitMQconnectionFactory);
        template.setExchange("directExchage");
        template.setQueue("rabbit.queue.primary");
        return template;
    }


    @Bean
    public DirectExchange directExchange() {
        return new DirectExchange("directExchange");
    }

    @Bean
    public Queue directQueue() {
        return new Queue("directQueue");
    }

    /**
     * 根据key全文匹配去寻找队列
     */
    @Bean
    public Binding bindingDirectExchange(@Qualifier("directQueue") Queue message
            , @Qualifier("directExchange") DirectExchange exchange) {
        return BindingBuilder.bind(message).to(exchange).with(JmsConst.ORDER_ROUTING_DIRECT_KEY);
    }


    /**
     * 如果消息的routing key与binding中的routing key符合通配符匹配的话,消息就会路由到该队列上
     */
    @Bean
    public TopicExchange topicExchange() {
        return new TopicExchange("topicExchange");
    }

    @Bean
    public Queue queueMessage() {
        return new Queue(JmsConst.ORDER_TOPIC_QUEUE);
    }

    @Bean
    public Queue queueMessage1() {
        return new Queue(JmsConst.ORDER_TOPIC_QUEUE1);
    }

    @Bean
    public Queue queueMessage2() {
        return new Queue(JmsConst.ORDER_TOPIC_QUEUE2);
    }

    /**
     * 将队列与exchange绑定，binding_key为rabbit.topic.#,模糊匹配,* 表示一个词
     # 表示零个或多个词
     */
    @Bean
    public Binding bindingTopicExchange(@Qualifier(JmsConst.ORDER_TOPIC_QUEUE) Queue message
            , @Qualifier("topicExchange") TopicExchange exchange) {
        return BindingBuilder.bind(message).to(exchange).with("rabbit.topic.#");
    }
    @Bean
    public Binding bindingTopicExchange1(@Qualifier(JmsConst.ORDER_TOPIC_QUEUE1) Queue message
            , @Qualifier("topicExchange") TopicExchange exchange) {
        return BindingBuilder.bind(message).to(exchange).with("rabbit.topic.#");
    }
    @Bean
    public Binding bindingTopicExchange2(@Qualifier(JmsConst.ORDER_TOPIC_QUEUE2) Queue message
            , @Qualifier("topicExchange") TopicExchange exchange) {
        return BindingBuilder.bind(message).to(exchange).with("rabbit.topic.#");
    }

    @Bean
    @Primary
    public Queue PrimaryQueue() {
        return new Queue("rabbit.queue.primary");
    }


    @Bean
    public Queue AMessage() {
        return new Queue("rabbit.fanout.A");
    }

    @Bean
    public Queue BMessage() {
        return new Queue("rabbit.fanout.B");
    }

    @Bean
    public Queue CMessage() {
        return new Queue("rabbit.fanout.C");
    }


    /**
     * 不管消息的routing key是什么,消息将会路由到所有队列上
     */
    @Bean
    public FanoutExchange fanoutExchange() {
        return new FanoutExchange("fanoutExchange");
    }


    @Bean
    public Binding bindingFanoutExchange(Queue message, FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(message).to(fanoutExchange);
    }

}
