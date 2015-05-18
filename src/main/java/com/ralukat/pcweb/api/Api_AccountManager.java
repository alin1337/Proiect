package com.ralukat.pcweb.api;

import com.ralukat.pcweb.Account;
import java.sql.ResultSet;
import java.sql.SQLException;

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


}
