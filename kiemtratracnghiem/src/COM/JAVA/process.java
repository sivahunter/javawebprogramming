/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package COM.JAVA;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author DUC
 */
public class process {

    Connection conn;

    public process() throws Exception {
        DBConnector dBConnector = new DBConnector();
        this.conn = dBConnector.getconnection();
    }

    public Student login(String email, String pass) throws SQLException {
        String sql = "select * from student where email = ? and pass= ?";
        PreparedStatement mystm = this.conn.prepareStatement(sql);
        mystm.setString(1, email);
        mystm.setString(2, pass);
        ResultSet rs = mystm.executeQuery();
        Student s = null;
        if (rs.next()) {
            s = new Student(rs.getInt("id"), rs.getString("name"),
                    rs.getString("email"), rs.getString("pass"));
        }
        return s;
    }

    public int addAnswer(Student s, Questions q, String answer) throws SQLException {
        String sql = "insert into student_questions values(?,?,?)";
        PreparedStatement myStatement = this.conn.prepareStatement(sql);
        myStatement.setInt(1, s.getId());
        myStatement.setInt(2, q.getId());
        myStatement.setString(3, answer);
        return myStatement.executeUpdate();
    }

    public void prinResult(String answer) throws SQLException, Exception {
        String sql = "select count(*) as soluong from questions";
        PreparedStatement myStatement = this.conn.prepareStatement(sql);
        ResultSet rs = myStatement.executeQuery();
        if (rs.next()) {
            QuestionManager qm = new QuestionManager();
            List<Questions> question = qm.getQuestion();
            int index = 1;
            for (Questions questions : question) {
                System.out.printf("questions %d%d\n",index++,question.size());
                System.out.println(questions);
                
                if(answer.toLowerCase().equals(questions.getCorrect().toLowerCase()))
                    System.out.printf("questions %d%d\n",index++,question.size()+"- true");
                else
                    System.out.printf("questions %d%d\n",index++,question.size()+"- false");
            }
        }

    }
}
