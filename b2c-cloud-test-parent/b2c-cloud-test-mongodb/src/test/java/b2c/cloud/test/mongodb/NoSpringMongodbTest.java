package b2c.cloud.test.mongodb;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import org.bson.Document;
import org.javamaster.b2c.config.BlueMoonConsts;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import java.util.Date;

/**
 * @author yudong
 * @date 2019/11/29
 */
public class NoSpringMongodbTest {
    private static MongoDbFactory mongoDbFactory;
    private static MongoClient mongoClient;
    private static MongoTemplate mongoTemplate;

    @BeforeClass
    public static void init() {
        MongoClientURI mongoClientURI = new MongoClientURI(String.format("mongodb://%s:%s/sakila",
                BlueMoonConsts.Local.MONGO_HOST, BlueMoonConsts.Local.MONGO_PORT));
        mongoDbFactory = new SimpleMongoDbFactory(mongoClientURI);
        mongoClient = new MongoClient(BlueMoonConsts.Local.MONGO_HOST, BlueMoonConsts.Local.MONGO_PORT);
        mongoTemplate = new MongoTemplate(mongoDbFactory);
    }

    @Test
    public void test() {
        Document document = new Document();
        document.append("startTime", new Date());
        mongoDbFactory.getDb().getCollection("activity").insertOne(document);
    }

    @Test
    public void test1() {
        System.out.println(mongoDbFactory.getDb().getCollection("activity").find().first());
    }
}
