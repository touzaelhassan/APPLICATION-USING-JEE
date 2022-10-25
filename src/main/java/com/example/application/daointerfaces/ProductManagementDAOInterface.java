package com.example.application.daointerfaces;

import com.example.application.entities.Product;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ProductManagementDAOInterface {

    ArrayList<Product> getProducts() throws SQLException;
    Product find(int id) throws SQLException;

}
