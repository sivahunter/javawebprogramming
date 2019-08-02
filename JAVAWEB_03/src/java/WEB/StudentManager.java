/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WEB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;

/**
 *
 * @author DUC
 */
public class StudentManager {
    public List<Student> getStudent() throws SQLException, ClassNotFoundException
    {
        DBConnector db = new DBConnector();
        Connection conn = db.getConnection();
        String sql= "select * from sinhvien ";
        PreparedStatement pstm = conn.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();
        List<Student> list = new ArrayList<>();
        while(rs.next())
        {
            Student st= new Student();
            st.setName(rs.getString("hoten"));
            st.setKhoa(rs.getString("khoa"));
            st.setLop(rs.getString("lop"));
            list.add(st);
            
        }
    return list;
    }
    public List<Student> addStudent(String name,String khoa,String lop) throws ClassNotFoundException, SQLException
    {
        DBConnector db = new DBConnector();
        Connection conn = db.getConnection();
        String sql = "insert into sinhvien(hoten,khoa,lop)"
                + "value(?,?,?)";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1,name);
        pstm.setString(2, khoa);
        pstm.setString(3, lop);
        ResultSet rs = pstm.executeQuery();
        List<Student> list = new ArrayList<>();
        while (rs.next()) {
            Student s = new Student();
            
            s.setName(rs.getString("name"));
            s.setKhoa(rs.getString("khoa"));
            s.setLop(rs.getString("lop"));
            list.add(s);
        }
        return list;
    
    }
}
