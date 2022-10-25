package com.example.application.daointerfaces;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManagerDAO {

        public static Connection getConnection() throws SQLException {
            try {
                Class.forName("org.apache.derby.jdbc.ClientDriver");

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            return DriverManager.getConnection("jdbc:derby://localhost:1527/sample","app","app");
        }
    }


