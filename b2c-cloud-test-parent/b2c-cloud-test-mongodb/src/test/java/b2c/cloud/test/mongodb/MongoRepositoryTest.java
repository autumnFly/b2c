package b2c.cloud.test.mongodb;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSONObject;
import com.csair.b2c.cloud.test.mongodb.MongodbApplication;
import com.csair.b2c.cloud.test.mongodb.model.Vendors;
import com.csair.b2c.cloud.test.mongodb.repository.VendorsRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = { MongodbApplication.class })
public class MongoRepositoryTest {
	@Autowired
	private VendorsRepository repository;
	@Autowired
	private MongoTemplate mongoTemplate;
	@Test
	public void test() {

		Vendors vendors = new Vendors();
		vendors.setVendId("BRS01");
		vendors.setVendName("Bears R US");
		vendors.setVendCountry("USA");
		vendors.setVendState("MI");
		vendors.setRegisterTime(new Date());
		repository.save(vendors);


		List<Vendors> list = repository.findByVendId("BRS01");
		System.out.println(JSONObject.toJSONString(list,true));
		
		mongoTemplate.dropCollection(Vendors.class);
	}
}
