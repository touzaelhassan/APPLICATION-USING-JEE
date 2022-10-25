package com.example.application.daointerfaces;

import com.example.application.entities.Product;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ProductManagementDAO {

    public ArrayList<Product> getProducts() throws SQLException;
    public Product find(int id) throws SQLException;

}
