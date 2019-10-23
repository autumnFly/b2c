package com.csair.b2c.cloud.test.actuator;

import com.csair.b2c.cloud.test.common.constant.ProjectConst;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.ServerAddress;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.web.client.RestTemplate;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan("com.csair.b2c")
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = ProjectConst.REDIS_SESSION_EXPIRED_TIME)
public class ActuatorApplication extends SpringBootServletInitializer {
    private String mongoUri = "mongodb://127.0.0.1:27017/B2C";

    public static void main(String[] args) {
        SpringApplication.run(ActuatorApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(ActuatorApplication.class);
    }

    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public MongoDbFactory mongoDbFactory() throws UnknownHostException {
        MongoClientURI mongoClientURI = new MongoClientURI(mongoUri);
        MongoDbFactory mongoDbFactory = new SimpleMongoDbFactory(mongoClientURI);
        return mongoDbFactory;
    }

    @Bean
    public MongoClient mongoClient() {
        List<ServerAddress> addresses = new ArrayList<>();
        addresses.add(new ServerAddress("127.0.0.1", 27017));
//		addresses.add(new ServerAddress("10.79.2.120", 27017));
        MongoClient mongo = new MongoClient(addresses);
        return mongo;
    }

    @Bean
    public MongoTemplate mongoTemplate(MongoClient mongo) {
        MongoTemplate mongoTemplate = new MongoTemplate(mongo, "B2C");
        return mongoTemplate;
    }
}
