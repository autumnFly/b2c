package com.csair.b2c.test.mybatis.repository.h2;

import com.csair.b2c.test.mybatis.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrdersRepository extends JpaRepository<Orders, Integer> {

	Orders findOrderByOrderNum(int num);
}
