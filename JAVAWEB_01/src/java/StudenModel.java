
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DUC
 */
public class StudenModel {
    public List<Students> getStudents() throws ClassNotFoundException, SQLException
    {
        DB_connector dbcon = new DB_connector();
        Connection conn = dbcon.getConnection();
        String sql = "select * from sinhvien";
        PreparedStatement pstm = conn.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();
        List<Students> list = new ArrayList<>();
         while (rs.next()) {
            Students s = new Students();
            s.setUsername(rs.getString("username"));
            s.setPassword(rs.getString("password"));
            s.setFullName(rs.getString("fname"));
            s.setEmail(rs.getString("email"));
            s.setAddress(rs.getString("ghichu"));
            list.add(s);
        }
        return list;
    }
    public ResultSet getInfo() throws ClassNotFoundException, SQLException
    {
       DB_connector dbcon= new DB_connector();
       Connection conn = dbcon.getConnection();
       String sql = " select * from sinhvien ";
       PreparedStatement pstm = conn.prepareStatement(sql);
       return pstm.executeQuery();
       
    }

   
}
