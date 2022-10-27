package com.example.application.daointerfaces;

import com.example.application.entities.Customer;
import com.example.application.entities.Product;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CustomerManagementDAOInterface {

     ArrayList<Customer> getCustomers() throws SQLException;
     Customer find(int id) throws SQLException;

}
