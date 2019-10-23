package com.csair.b2c.test.mybatis.repository.h2;

import com.csair.b2c.test.mybatis.entity.Customers;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by yu on 2018/3/27.
 */
public interface CustomersRepository extends JpaRepository<Customers, String> {
    Customers findCustomerByCustId(String custId);
}
