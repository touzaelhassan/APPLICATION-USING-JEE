package com.example.application.servlets;

import com.example.application.daoclasses.ProductManagementDAO;
import com.example.application.daointerfaces.ProductManagementDAOInterface;
import com.example.application.entities.Product;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

@WebServlet(name = "ProductsServlet", value = "/products")
public class ProductsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try{

            ProductManagementDAOInterface productManagementDAO = new ProductManagementDAO();

            ArrayList<Product> products =  productManagementDAO.getProducts();

            request.setAttribute("products", products);

            System.out.println(products);

            getServletContext().getRequestDispatcher("/products.jsp").forward(request, response);

        }
        catch (SQLException e){

            System.out.println(e);

        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
