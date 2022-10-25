package com.example.application.daoclasses;

import com.example.application.daointerfaces.ProductManagementDAOInterface;
import com.example.application.entities.Product;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ProductManagementDAO implements ProductManagementDAOInterface {

    Connection connection;

    public ProductManagementDAO() throws SQLException {

        connection = ConnectionManagerDAO.getConnection();

    }

    @Override
    public ArrayList<Product> getProducts() throws SQLException {

        String query = "SELECT * FROM products";
        Statement  statement = connection.createStatement();
        ResultSet result = statement.executeQuery(query);

        ArrayList<Product> products = new ArrayList<>();

        while(result.next()){

            int id = result.getInt("id");
            String name = result.getString("name");
            int price = result.getInt("price");
            String description = result.getString("description");
            int quantity = result.getInt("quantity");

            Product product = new Product(id, name, price, description,quantity);

            products.add(product);

        }

        return products;

    }

    @Override
    public Product find(int productId) throws SQLException {

        String query = "SELECT * FROM products WHERE id = " + productId;
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery(query);

        Product product = null;

        while (result.next()){

            int id = result.getInt("id");
            String name = result.getString("name");
            int price = result.getInt("price");
            String description = result.getString("description");
            int quantity = result.getInt("quantity");

            product = new Product(id, name, price, description, quantity);

        }

        return product;

    }
}
