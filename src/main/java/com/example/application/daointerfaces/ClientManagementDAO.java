package com.example.application.daointerfaces;

import com.sun.security.ntlm.Client;

import java.sql.SQLException;

public interface ClientManagementDAO {

    public Client find(int id) throws SQLException;

}
