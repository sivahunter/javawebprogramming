/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package COM.JAVA;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author DUC
 */
public class DB_Conector {
    public Connection getconnection () throws Exception
    {
        Class.forName("com.mysql.jdbc.Driver");
        String conStr ="jdbc:mysql://localhost:3306/QLYTHUVIEN";
        Connection conn = DriverManager.getConnection(conStr,"root","admin");
        
       return conn;
    }
    
    
    
}
