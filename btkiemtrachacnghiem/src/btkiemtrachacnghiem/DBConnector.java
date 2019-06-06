/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btkiemtrachacnghiem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author DUC
 */
public class DBConnector {
    public Connection getConnect() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String conStr = "jdbc:mysql://localhost:3306/KIEMTRATRACNGHIEM";
        Connection conn = DriverManager.getConnection(conStr, "root", "admin");

        return conn;
    }
}
