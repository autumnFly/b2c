package com.csair.b2c.cloud.test.mongodb;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.ServerAddress;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.ArrayList;
import java.util.List;

@EnableDiscoveryClient
@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.csair.b2c.cloud.test.mongodb.repository")
public class MongodbApplication {

    @Value("${mongo.uri}")
    private String mongoUri;

    public static void main(String[] args) {
        SpringApplication.run(MongodbApplication.class, args);
    }

    @Bean
    public MongoDbFactory mongoDbFactory() {
        MongoClientURI mongoClientURI = new MongoClientURI(mongoUri);
        MongoDbFactory mongoDbFactory = new SimpleMongoDbFactory(mongoClientURI);
        return mongoDbFactory;
    }

    @Bean
    public MongoClient mongo() {
        List<ServerAddress> addresses = new ArrayList<>();
        addresses.add(new ServerAddress("127.0.0.1", 27017));
        MongoClient mongo = new MongoClient(addresses);
        return mongo;
    }

    @Bean
    public MongoTemplate mongoTemplate(MongoClient mongo) {
        MongoTemplate mongoTemplate = new MongoTemplate(mongo, "B2C");
        return mongoTemplate;
    }
}
