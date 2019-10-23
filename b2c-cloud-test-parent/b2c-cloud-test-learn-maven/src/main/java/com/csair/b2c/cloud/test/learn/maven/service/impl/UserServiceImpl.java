package com.csair.b2c.cloud.test.learn.maven.service.impl;

import com.csair.b2c.cloud.test.learn.maven.model.Account;
import com.csair.b2c.cloud.test.learn.maven.service.AccountPersistService;
import com.csair.b2c.cloud.test.learn.maven.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created on 2018/9/15.<br/>
 *
 * @author yudong
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private AccountPersistService service;

    @Override
    public void signup(Account account) {
        service.createAcount(account);
    }

    @Override
    public void activate(Account account) {
        service.updateAcount(account);
    }
}
