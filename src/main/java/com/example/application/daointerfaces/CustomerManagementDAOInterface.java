package com.example.application.daointerfaces;


import com.example.application.entities.Customer;

import java.sql.SQLException;

public interface CustomerManagementDAOInterface {

    public Customer find(int id) throws SQLException;

}
