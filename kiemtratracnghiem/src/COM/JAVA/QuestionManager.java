/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package COM.JAVA;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DUC
 */
public class QuestionManager {

    private Connection conn = null;

    public QuestionManager() throws Exception {
        this.conn = new DBConnector().getconnection();

    }

    public List<Questions> getQuestion() throws SQLException {
        String query = "select * from questions";
        Statement statement = this.conn.createStatement();
        ResultSet rs = statement.executeQuery(query);
        List<Questions> list = new ArrayList<>();
        while (rs.next()) {
            Questions q = new Questions();
            q.setId(rs.getInt("id"));
            q.setContent(rs.getString("content"));
            q.setAnswerA(rs.getString("answer_a"));
            q.setAnswerB(rs.getString("answer_b"));
            q.setAnswerC(rs.getString("answer_c"));
            q.setAnswerD(rs.getString("answer_d"));
            q.setCorrect(rs.getString("correct"));
            list.add(q);

        }
        return list;
    }

}
