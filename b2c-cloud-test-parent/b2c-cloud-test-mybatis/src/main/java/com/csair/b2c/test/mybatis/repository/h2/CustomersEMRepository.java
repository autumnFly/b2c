package com.csair.b2c.test.mybatis.repository.h2;

import com.csair.b2c.test.mybatis.entity.Customers;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * EntityManager不是线程安全的,这里注入的是一个代理,真正使用的是与当前事务关联的那一个
 * <p>
 * PersistenceUnit和PersistenceContext是JPA规范提供的,必须配置spring的PersistenceAnnotationBeanPostProcessor才能
 * 让spring理解这些注解,如果已经启用了组件扫描,那么就会自动注册,否则,需要显式注册
 * <p>
 * Created by yu on 2018/3/27.
 */
@Repository
@Transactional
public class CustomersEMRepository {

    @PersistenceContext
    private EntityManager manager;

    public Customers findCustomerByCustId(String custId) {
        return manager.find(Customers.class, custId);
    }
}
