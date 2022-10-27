package com.example.application.daoclasses;

import com.example.application.entities.Customer;
import com.example.application.daointerfaces.CustomerManagementDAOInterface;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class CustomerManagementDAO implements CustomerManagementDAOInterface {

    Connection connection;

    public CustomerManagementDAO() throws SQLException {

        connection = ConnectionManagerDAO.getConnection();

    }

    @Override
    public ArrayList<Customer> getCustomers() throws SQLException {

        String query = "SELECT * FROM customers";
        Statement  statement = connection.createStatement();
        ResultSet result = statement.executeQuery(query);

        ArrayList<Customer> customers = new ArrayList<>();

        while(result.next()){

            int id = result.getInt("id");
            String name = result.getString("name");
            String email = result.getString("email");
            String phone = result.getString("phone");
            String address = result.getString("address");

            Customer customer = new Customer(id, name, email, phone, address);

            customers.add(customer);

        }

        return customers;
    }


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
