/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author DUC
 */
public class DBconnector {
    public Connection getConnection () throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.jdbc.Driver");
        String conStr = "jdbc:mysql://localhost:3306/qlysinhvien";
        Connection conn = DriverManager.getConnection(conStr,"root","admin");
        return conn;
    }
}