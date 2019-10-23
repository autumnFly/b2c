package b2c.cloud.test.mongodb;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSONObject;
import com.csair.b2c.cloud.test.mongodb.MongodbApplication;
import com.csair.b2c.cloud.test.mongodb.model.Products;
import com.csair.b2c.cloud.test.mongodb.model.Vendors;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.WriteResult;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = { MongodbApplication.class })
public class MongodbTest {
	@Autowired
	private MongoTemplate mongoTemplate;

	@Test
	public void test() {
		// show dbs
		// user B2C
		// show collections
		// db.vendors.insert({"vend_id":"BRS01","vend_name":"Bears R US"})
		Vendors vendors = new Vendors();
		vendors.setVendId("BRS01");
		vendors.setVendName("Bears R US");
		vendors.setVendCountry("USA");
		vendors.setVendState("MI");
		mongoTemplate.save(vendors);
		Vendors vendors1 = new Vendors();
		vendors1.setVendId("BRS02");
		vendors1.setVendName("Bears AN CH");
		vendors1.setVendCountry("CHINA");
		vendors1.setVendState("MI");
		mongoTemplate.save(vendors1);
		Vendors Vendors2 = new Vendors();
		Vendors2.setVendId("BRS03");
		Vendors2.setVendName("CAT AN CH");
		Vendors2.setVendCountry("JAPAM");
		Vendors2.setVendState("IA");
		mongoTemplate.save(Vendors2);

		// db.vendors.find({"vendId":"BRS03"})
		Query query = new Query(Criteria.where("vendId").is("BRS03"));
		List<Vendors> list = mongoTemplate.find(query, Vendors.class);
		System.out.println(JSONObject.toJSONString(list, true));

		// db.vendors.find({"vendId":"BRS02","vendState":"MI"})
		// db.vendors.find({$and:[{"vendId":"BRS02"},{"vendState":"MI"}]}})
		Query query1 = new Query(Criteria.where("vendId").is("BRS02").and("vendState").is("MI"));
		List<Vendors> list1 = mongoTemplate.find(query1, Vendors.class);
		System.out.println(JSONObject.toJSONString(list1, true));

		// db.vendors.find({$or:[{"vendId":"BRS02"},{"vendState":"IA"}]}})
		Query query2 = new Query(
				new Criteria().orOperator(Criteria.where("vendId").is("BRS02"), Criteria.where("vendState").is("IA")));
		List<Vendors> list2 = mongoTemplate.find(query2, Vendors.class);
		System.out.println(JSONObject.toJSONString(list2, true));

		// db.vendors.update({ "$set" : { "vendCountry" : "CHINA"}})
		Update update = Update.update("vendCountry", "CHINA");
		UpdateResult result = mongoTemplate.updateFirst(query, update, Vendors.class);
		System.out.println(result);
		list = mongoTemplate.find(query, Vendors.class);
		System.out.println(JSONObject.toJSONString(list, true));

		DeleteResult result1 = mongoTemplate.remove(query, Vendors.class);
		System.out.println(result1);
		mongoTemplate.dropCollection(Vendors.class);
		

		for (int i = 0; i < 20000; i++) {
			DBObject dbObject = new BasicDBObject();
			dbObject.put("num", i);
			mongoTemplate.save(dbObject,"numbers");
		}
		
		//db.numbers.find({ "num" : { "$gt" : 199995}})
		//db.numbers.find({ "num" : { "$gt" : 199995}}).explain("executionStats")
		Query query3 = new Query(Criteria.where("num").gt(19995));
		List<BasicDBObject> list3 = mongoTemplate.find(query3,BasicDBObject.class, "numbers");
		System.out.println(JSONObject.toJSONString(list3, true));
		mongoTemplate.getCollection("numbers");
		mongoTemplate.getDb();
		mongoTemplate.dropCollection("numbers");
		
		Products products=new Products();
		products.setProdId("TV_LENOVO435");
		products.setProdName("100SAVERTV");
		products.setProdDesc("a big tv");
		products.setSell(true);
		products.setTax(888);
		products.setPrice(9999);
		products.setLastUpdate(new Timestamp(System.currentTimeMillis()));
		Vendors vendors4 = new Vendors();
		vendors4.setVendId("BRS01");
		vendors4.setVendName("Bears R US");
		vendors4.setVendCountry("USA");
		vendors4.setVendState("MI");
		vendors4.setRegisterTime(new Date());
		vendors4.setRateScore(98.87);
		products.setVendor(vendors4);
		mongoTemplate.save(products);
		
		mongoTemplate.dropCollection(Products.class);
		
	}
}
