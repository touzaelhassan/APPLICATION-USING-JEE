package com.example.application.daoclasses;

import com.example.application.daointerfaces.OrderManagementDAOInterface;
import com.example.application.entities.Order;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class OrderManagementDAO implements OrderManagementDAOInterface {

    Connection connection;

    public OrderManagementDAO() throws SQLException {

        connection = ConnectionManagerDAO.getConnection();

    }

    @Override
    public ArrayList<Order> getOrders(int customerId) throws SQLException {

        String query = "SELECT * FROM orders WHERE customer_id = " + customerId;
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery(query);

        ArrayList<Order> orders = new ArrayList<>();

        while(result.next()){

            int id = result.getInt("id");
            int customer_id = result.getInt("customer_id");
            int product_id = result.getInt("product_id");
            int quantity = result.getInt("quantity");

            Order order = new Order(id, customer_id, product_id, quantity);

            orders.add(order);

        }

        return orders;
    }
}
