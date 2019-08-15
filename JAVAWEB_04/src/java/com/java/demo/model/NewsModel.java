/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo.model;

import com.java.demo.db.DBConnector;
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
public class NewsModel {
    public int countNews() throws ClassNotFoundException, SQLException
    {
        DBConnector db = new DBConnector();
        Connection conn = db.getConnection();
        PreparedStatement pstm = conn.prepareStatement("select cout(*) from news");
        ResultSet rs = pstm.executeQuery();
        rs.next();
        
        
        return rs.getInt(1);
    }
    public List<News> getNews(int limit,int offset) throws ClassNotFoundException, SQLException
    {
        DBConnector db = new DBConnector();
        Connection conn = db.getConnection();
        PreparedStatement pstm = conn.prepareStatement("select * from news limit ? offset ?");
        pstm.setInt(1,limit);
        pstm.setInt(2,offset);

        ResultSet rs = pstm.executeQuery();
        List<News> list = new ArrayList<>();
        while(rs.next())
        {
            list.add(new News(rs.getInt("id"),rs.getString("title"),rs.getString("content"),rs.getInt("author_id"),rs.getString("sumary")));
        }
        return list;
    }
}
