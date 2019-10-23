package com.csair.b2c.test.mybatis.repository.h2;

import com.csair.b2c.test.mybatis.entity.Customers;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

/**
 * 这个的问题是每次调用方法都会创建一个新的EntityManager
 * <p>
 * Created by yu on 2018/3/27.
 */
@Repository
@Transactional
public class CustomersEMPRepository {

    @PersistenceUnit
    private EntityManagerFactory factory;

    public Customers findCustomerByCustId(String custId) {
        return factory.createEntityManager().find(Customers.class, custId);
    }
}
