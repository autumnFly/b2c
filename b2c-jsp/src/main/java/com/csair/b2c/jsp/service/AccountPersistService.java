package com.csair.b2c.jsp.service;


import com.csair.b2c.jsp.model.Account;

public interface AccountPersistService {
    void createAcount(Account account);

    Account readAcount(String id);

    void deleteAcount(String id);

    void updateAcount(Account account);
}
