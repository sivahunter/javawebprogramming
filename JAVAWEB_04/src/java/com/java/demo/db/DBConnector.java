/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author DUC
 */
public class DBConnector {
     public Connection getConnection() throws ClassNotFoundException, SQLException {
        //1. nap drive
        Class.forName("com.mysql.cj.jdbc.Driver");
        String connStr = "jdbc:mysql://localhost:3306/tintuc";
        Connection conn = DriverManager.getConnection(connStr, "root", "admin");
        return conn;
    }
}
