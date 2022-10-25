package com.example.application.daoclasses;

import com.example.application.daointerfaces.CustomerManagementDAOInterface;
import com.example.application.entities.Customer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomerManagementDAO implements CustomerManagementDAOInterface {
    Connection connection;

    @Override
    public Customer find(int id) throws SQLException {
        connection = ConnectionManagerDAO.getConnection();
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery("SELECT * FROM customers WHERE id =" + id +"");

        Customer customer = null;

        while (result.next()){
             customer = new Customer(result.getInt("id"),result.getString("name"), result.getString("email"),result.getString("phone"), result.getString("address"));
        }

        return customer;

    }
}
