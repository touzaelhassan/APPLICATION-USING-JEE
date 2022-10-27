package com.example.application.servlets;

import com.example.application.daoclasses.OrderManagementDAO;
import com.example.application.daoclasses.ProductManagementDAO;
import com.example.application.daointerfaces.OrderManagementDAOInterface;
import com.example.application.daointerfaces.ProductManagementDAOInterface;
import com.example.application.entities.Order;
import com.example.application.entities.Product;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

@WebServlet(name = "ListProductsServlet", value = "/products")
public class ListProductsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try{

            ProductManagementDAOInterface productManagementDAO = new ProductManagementDAO();

            ArrayList<Product> productsList =  productManagementDAO.getProducts();

            request.setAttribute("productsList", productsList);

            System.out.println(productsList);

            getServletContext().getRequestDispatcher("/productsList.jsp").forward(request, response);

        }
        catch (SQLException e){

            response.sendRedirect("/app/404.html");

        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



    }
}
