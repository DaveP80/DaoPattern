package com.logic.service;

import com.logic.dao.AccountDao;
import com.logic.dao.IAccountDao;
import com.logic.model.Account;

public class AccountService {

    private IAccountDao adao = new AccountDao();
        //dependency injection, this implementation will start the AccountDao layer, and
        //connect to db to do transaction
    public Account insertExample(Account a) {

        System.out.println("inserting example number");

        int generated_id = adao.insert(a); //int value should be the first result from the query

        if (generated_id != -1 && generated_id != a.getId()) {
            a.setId(generated_id); //the account (for business math) is now set to the result from the db
        }

        System.out.println("Successfully registered user with the Id of " + a.getId());

        return a;

    }

}
