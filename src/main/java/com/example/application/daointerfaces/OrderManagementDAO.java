package com.example.application.daointerfaces;

import com.example.application.entities.Order;

import java.sql.SQLException;
import java.util.ArrayList;

public interface OrderManagementDAO {

    public ArrayList<Order> getOrders() throws SQLException;

}
