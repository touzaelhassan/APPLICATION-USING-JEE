package com.example.application.daoclasses;

import com.example.application.entities.Customer;

import java.sql.SQLException;

public class TestDAO {

    public static void main(String [] args)
    {
        try{

            CustomerManagementDAO customerDAO = new CustomerManagementDAO();

            Customer customer = customerDAO.find(1);

            System.out.println(customer);

        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }

}
