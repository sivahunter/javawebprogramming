/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DUC
 */
public class StudentModel {

    public List<Students> getStudent() throws ClassNotFoundException, SQLException {
        DBconnector db = new DBconnector();
        Connection conn = db.getConnection();
        String sql = "select * from sinhvien";
        PreparedStatement pstm = conn.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();
        List<Students> list = new ArrayList<>();
        while (rs.next()) {
            Students s = new Students();
            s.setId(rs.getInt("id"));
            s.setName(rs.getString("name"));
            s.setMajor(rs.getString("major"));
            s.setDob(rs.getString("dob"));
            list.add(s);
        }

        return list;
    }

    public List<Students> getStudentsByMajor(String major) throws ClassNotFoundException, SQLException {
        DBconnector db = new DBconnector();
        Connection conn = db.getConnection();
        String sql = "SELECT * FROM sinhvien WHERE major = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, major);
        ResultSet rs = pstmt.executeQuery();
        List<Students> list = new ArrayList<>();
        while (rs.next()) {
            Students s = new Students();
            s.setId(rs.getInt("id"));
            s.setName(rs.getString("name"));
            s.setMajor(rs.getString("major"));
            s.setDob(rs.getString("dob"));
            list.add(s);
        }

        return list;
    }
}
