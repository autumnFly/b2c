package com.csair.b2c.cloud.test.learn.maven.service;

import com.csair.b2c.cloud.test.learn.maven.model.Account;

public interface AccountPersistService {
    void createAcount(Account account);

    Account readAcount(String id);

    void deleteAcount(String id);

    void updateAcount(Account account);
}
