package com.csair.b2c.test.mybatis;

import com.alibaba.fastjson.JSONObject;
import com.csair.b2c.test.mybatis.entity.Customers;
import com.csair.b2c.test.mybatis.mapper.h2.PersonMapper;
import com.csair.b2c.test.mybatis.model.Customer;
import com.csair.b2c.test.mybatis.model.Person;
import com.csair.b2c.test.mybatis.model.Product;
import com.csair.b2c.test.mybatis.repository.h2.CustomersRepository;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class SpringbootH2ApplicationTests {
    @Autowired
    SqlSessionFactory sessionFactory;
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    PersonMapper personMapper;
    @Autowired
    @Qualifier("h2LocalSessionFactoryBean")
    LocalSessionFactoryBean factoryBean;
    @Autowired
    CustomersRepository customersRepository;
    @Autowired
    @Qualifier("h2EntityManagerFactory")
    LocalContainerEntityManagerFactoryBean entityManagerFactoryBean;

    @Test
    public void test() {

        Object object4 = personMapper.selectPerson(2);
        System.out.println(JSONObject.toJSONString(object4));

        Object object5 = personMapper.selectAllPerson();
        System.out.println(JSONObject.toJSONString(object5));

        Person person = new Person();
        person.setId(3);
        person.setName("鹅鹅鹅");
        person.setAge(24);
        person.setSex(1);
        System.out.println(personMapper.insertPerson(person));

        System.out.println(personMapper.insertRandIdAuthor(person));
        System.out.println(JSONObject.toJSONString(personMapper.selectAllPerson()));

        person.setName("万维网");
        System.out.println(personMapper.updatePerson(person));

        System.out.println(personMapper.deletePerson(person));

        Customer customer = personMapper.selectShopping("1000000001");
        System.out.println(JSONObject.toJSONString(customer, true));

        Product product = personMapper.selectProduct("BNBG01");
        System.out.println(JSONObject.toJSONString(product, true));

        System.out.println(JSONObject.toJSONString(personMapper.selectVendors("USA", "MI"), true));
        System.out.println(JSONObject.toJSONString(personMapper.selectVendors(null, null), true));

        List<String> ids = new ArrayList<>();
        ids.add("BRS01");
        ids.add("BRE02");
        System.out.println(JSONObject.toJSONString(personMapper.selectVendorsByIds(ids), true));

        System.out.println(JSONObject.toJSONString(personMapper.selectVendorsLike("us"), true));

        System.out.println(personMapper.insertPersonAnno(person));
        System.out.println(JSONObject.toJSONString(personMapper.selectAllPerson(), true));

        System.out.println(JSONObject.toJSONString(personMapper.selectVendorsByIdsAnno(ids), true));

    }

    @Test
    public void test1() {
        Object object = jdbcTemplate.queryForMap("select * from person where id = ?", new Object[]{1});
        System.out.println(JSONObject.toJSONString(object));

        Object object2 = sessionFactory.openSession()
                .selectOne("com.csair.b2c.test.mybatis.mapper.h2.PersonMapper.selectPerson", 1);
        System.out.println(JSONObject.toJSONString(object2));

        Object object3 = sessionFactory.openSession().getMapper(PersonMapper.class).selectPerson(8);
        System.out.println(JSONObject.toJSONString(object3));
    }

    @Test
    public void testHibernate() throws Exception {
        Customers customers = factoryBean.getObject().openSession().get(Customers.class, "1000000001");
        System.out.println(JSONObject.toJSONString(customers));
    }

    @Test
    public void testEntityManager() throws Exception {
        EntityManager entityManager = entityManagerFactoryBean.getObject().createEntityManager();
        Customers customers = entityManager.find(Customers.class, "1000000001");
        System.out.println(JSONObject.toJSONString(customers));
    }

    @Test
    public void testSpringDataJpa() throws Exception {
        Customers customers = customersRepository.findCustomerByCustId("1000000001");
        System.out.println(JSONObject.toJSONString(customers));
    }
}
