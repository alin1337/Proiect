package com.ralukat.pcweb.dao;

import com.ralukat.pcweb.Account;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by catalin on 18/05/15.
 */
public interface AccountDAO
{
        public void setDataSource(DataSource ds);

        public void create(Account account);

        public Account getAccount(Integer id);

        public List<Account> listAllAccounts();

        public void delete(Integer id);

        public boolean updatePassword(Integer id, String newPassword);

        public boolean updateEmail(Integer id, String oldEmail, String newEmail);

        public boolean updateEmail(Integer id, String newEmail);
}
