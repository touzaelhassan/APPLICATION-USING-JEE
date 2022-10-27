package com.example.application.servlets;

import com.example.application.daoclasses.OrderManagementDAO;
import com.example.application.daointerfaces.OrderManagementDAOInterface;
import com.example.application.entities.Order;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

@WebServlet(name = "OrdersServlet", value = "/orders")
public class OrdersServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try{

            OrderManagementDAOInterface orderManagementDAO = new OrderManagementDAO();

            ArrayList<Order> orders =  orderManagementDAO.getOrders(1);

            request.setAttribute("orders", orders);

            System.out.println(orders);

            getServletContext().getRequestDispatcher("/orders.jsp").forward(request, response);

        }
        catch (SQLException e){

            System.out.println(e);

        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}
