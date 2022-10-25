package com.example.application.daointerfaces;

import com.example.application.entities.Order;

import java.sql.SQLException;
import java.util.ArrayList;

public interface OrderManagementDAOInterface {

    public ArrayList<Order> getOrders(int customer_id) throws SQLException;

}
