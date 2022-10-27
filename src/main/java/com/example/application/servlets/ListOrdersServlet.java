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

@WebServlet(name = "ListOrdersServlet", value = "/orders")
public class ListOrdersServlet extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try{

            OrderManagementDAOInterface orderManagementDAO = new OrderManagementDAO();

            ArrayList<Order> ordersList =  orderManagementDAO.getOrders(1);

            request.setAttribute("ordersList", ordersList);

            System.out.println(ordersList);

            getServletContext().getRequestDispatcher("/ordersList.jsp").forward(request, response);

        }
        catch (SQLException e){

            response.sendRedirect("/app/404.html");

        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}
