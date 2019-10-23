package com.csair.b2c.cloud.test.learn.maven.service;

import com.csair.b2c.cloud.test.learn.maven.model.Account;

/**
 * Created on 2018/9/15.<br/>
 *
 * @author yudong
 */
public interface UserService {
    void signup(Account account);

    void activate(Account account);
}
