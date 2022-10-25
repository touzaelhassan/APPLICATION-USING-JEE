package com.example.application;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet", value = "/login")

public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if(username == null) username = "";
        if(password == null) password = "";


        System.out.println(username + " - " + password);

        response.setContentType("text/html");

        try(PrintWriter out = response.getWriter()){

            out.print("<!DOCTYPE html>");
            out.print("<html>");
            out.print("   <head>");
            out.print("      <title> Application </title>");
            out.print("   </head>");
            out.print("   <body>");
            out.print("      <h1>Hello From Login Servlet</h1>");
            out.print("      <form action = 'login' method = 'POST' >");
            out.print("         <input type ='text' value = '" + username + "' name = 'username' />");
            out.print("         <br/>");
            out.print("         <input type ='text' value = '" + password + "' name = 'password' />");
            out.print("         <br/>");
            out.print("         <input type ='submit' name = 'submit' />");
            out.print("      </form>");
            out.print("   </body>");
            out.print("</html>");

        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if(username.equals("admin") && password.equals("pass")){

            response.setContentType("text/html");

            try(PrintWriter out = response.getWriter()){

                out.println("OK");

            }

        }else{

            doGet(request, response);

        }

    }

}
