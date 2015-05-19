package com.ralukat.pcweb.api;

import com.ralukat.pcweb.Account;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.ralukat.pcweb.dao.AccountDAO;

import javax.sql.DataSource;


/**
 * Created by catalin on 18/05/15.
 */
public class Api_AccountManager implements AccountDAO {



    //Implementing all methods from interface AccountDAO.
    private DataSource dataSource;
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    //Create Account
    public void create(Account account)
    {

    }

    public Account getAccount(Integer id){
        return new Account();
    }

    public List<Account> listAllAccounts()
    {
        return null;
    }

    public void delete(Integer id){

    }

    public boolean updatePassword(Integer id, String newPassword){
        return true;
    }


    public boolean updateEmail(Integer id, String oldEmail, String newEmail){
        return true;
    }

    public boolean updateEmail(Integer id, String newEmail){
        return true;
    }



}
