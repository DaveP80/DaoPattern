package com.logic.dao;

import com.logic.model.Account;
import com.logic.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountDao implements IAccountDao {

    public int insert(Account a) {

        Connection conn = ConnectionUtil.getConnection();

        String sql = "INSERT INTO account (example) values (?) RETURNING account.id";

        try {
            PreparedStatement stmt = conn.prepareStatement(sql);


            stmt.setInt(1, a.getExample());

            ResultSet rs;

            if ((rs = stmt.executeQuery()) != null) {

                // if we return data, we can iterate over it

                rs.next();

                // We need to capture the first column of data return (which is the id of the return user object)

                int id = rs.getInt(1);

                System.out.println("We returned an account with id #" + id);

                return id;
            }



    } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return -1; //number returned thats impossible for DB to generate, and we need a return value

}




    }

