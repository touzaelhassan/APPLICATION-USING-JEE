package com.example.application.servlets;

import com.example.application.daoclasses.CustomerManagementDAO;
import com.example.application.daointerfaces.CustomerManagementDAOInterface;
import com.example.application.entities.Customer;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

@WebServlet(name = "CustomersServlet", value = "/customers")
public class CustomersServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try{

            CustomerManagementDAOInterface customerManagementDAO = new CustomerManagementDAO();

            ArrayList<Customer>  customers = customerManagementDAO.getCustomers() ;

            System.out.println(customers);

            request.setAttribute("customers", customers);

            getServletContext().getRequestDispatcher("/customers.jsp").forward(request, response);

        }
        catch (SQLException e){

            System.out.println(e);

        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
