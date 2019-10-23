package com.csair.b2c.test.mybatis.model;

import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

/**
 * Created by yu on 2018/4/14.
 */
@Service
//@Scope("session")
@SessionScope(proxyMode = ScopedProxyMode.INTERFACES)
public class ShoppingCar implements ShoppingCarService{
    @Override
    public void addGood(Object good) {

    }

    @Override
    public void removeGood(Object good) {

    }
}
