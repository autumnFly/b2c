package com.csair.b2c.cloud.test.sys;

import com.bjucloud.mq.client.factory.MQProduceFactory;
import com.csair.b2c.cloud.test.model.service.BookService;
import com.csair.b2c.cloud.test.sys.model.ComponentLife;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.ServerAddress;
import org.javamaster.b2c.config.BlueMoonConsts;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;
import org.springframework.web.client.RestTemplate;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

import java.io.Serializable;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@EnableAspectJAutoProxy
@EnableMongoRepositories(basePackages = "com.csair.b2c.cloud.test.sys.repository")
@ComponentScan(basePackages = "com.csair.b2c")
@SpringBootApplication
public class SysApplication {

    public static void main(String[] args) {
        SpringApplication.run(SysApplication.class, args);
    }

    /**
     * 配置RMI客户端,服务器端配置在rmi微服务
     */
    //@Bean
    public RmiProxyFactoryBean rmiProxyFactoryBean() {
        RmiProxyFactoryBean rmiProxyFactoryBean = new RmiProxyFactoryBean();
        rmiProxyFactoryBean.setServiceUrl("rmi://localhost:1099/BookService");
        rmiProxyFactoryBean.setServiceInterface(BookService.class);
        return rmiProxyFactoryBean;
    }

    @Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
    public ComponentLife componentLife() {
        return new ComponentLife();
    }

    @Bean
    public MongoClient mongo() {
        List<ServerAddress> addresses = new ArrayList<>();
        addresses.add(new ServerAddress(BlueMoonConsts.CsAir.HOST_11, BlueMoonConsts.CsAir.PORT));
        addresses.add(new ServerAddress(BlueMoonConsts.CsAir.HOST_12, BlueMoonConsts.CsAir.PORT));
        MongoClient mongo = new MongoClient(addresses);
        return mongo;
    }

    @Bean
    @Primary
    public MongoTemplate mongoTemplateCluster(MongoClient mongo) {
        MongoTemplate mongoTemplate = new MongoTemplate(mongo, "B2C");
        return mongoTemplate;
    }

    @Bean
    public MongoDbFactory mongoDbFactory() throws UnknownHostException {
        MongoClientURI mongoClientURI = new MongoClientURI(BlueMoonConsts.CsAir.URL);
        MongoDbFactory mongoDbFactory = new SimpleMongoDbFactory(mongoClientURI);
        return mongoDbFactory;
    }

    @Bean
    public MongoTemplate mongoTemplate(MongoDbFactory mongoDbFactory) {
        MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory);
        return mongoTemplate;
    }

    @Bean
    public JedisCluster jedisCluster() {
        String ips = BlueMoonConsts.CsAir.CLUSTER_URL;
        String[] urls = ips.split(",");
        Set<HostAndPort> addresses = new HashSet<>();
        for (String u : urls) {
            String[] tmp = u.split(":");
            addresses.add(new HostAndPort(tmp[0], Integer.parseInt(tmp[1])));
        }
        JedisCluster jedisCluster = new JedisCluster(addresses);
        return jedisCluster;
    }

    @Bean
    public RedisConnectionFactory redisConnectionFactory() {
        JedisConnectionFactory factory = new JedisConnectionFactory();
        factory.setHostName(BlueMoonConsts.CsAir.REDIS_HOST);
        factory.setPort(BlueMoonConsts.CsAir.REDIS_PORT);
        return factory;
    }

    @Bean
    public RedisTemplate<String, Serializable> redisTemplate(RedisConnectionFactory factory) {
        RedisTemplate<String, Serializable> redisTemplate = new RedisTemplate<>();
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setValueSerializer(new JdkSerializationRedisSerializer());
        redisTemplate.setConnectionFactory(factory);
        return redisTemplate;
    }

    @Bean
    @Primary
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public RestTemplate restTemplateOut() {
        return new RestTemplate();
    }

    @Bean
    public MQProduceFactory createInsuredEaccFactory() {
        MQProduceFactory producer = new MQProduceFactory();
        producer.setConfigUrl(BlueMoonConsts.CsAir.MQ_URL);
        producer.setAppName("Insurance_Purchase_New_App");
        producer.setTopicName("TICKET_ISSUANCE_TOPIC");
        return producer;
    }
}
