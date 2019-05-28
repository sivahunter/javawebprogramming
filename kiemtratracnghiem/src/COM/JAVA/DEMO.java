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
import java.util.Scanner;

/**
 *
 * @author DUC
 */
public class DEMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, Exception {
        try {

            Scanner sc = new Scanner(System.in);
            System.out.println("   QUIZ ONLINE   ");
            System.out.println("------------------");
            System.out.print(" Enter email > ");
            String email = sc.nextLine();
            System.out.print(" Enter password > ");
            String pass = sc.nextLine();
            process pc = new process();
            Student s = pc.login(email, pass);
            if (s != null) {
                System.out.println(" Đăng nhập thành công");
                sc.nextLine();
                System.out.println("-------------");
                QuestionManager qm= new QuestionManager();
                List<Questions> question = qm.getQuestion();
                int index =1 ;
                int countCorr =0;
             
                for (Questions questions : question) {
                    System.out.printf("Questions %d/%d \n",index++,question.size());
                    System.out.println(questions);
                    System.out.print(" Your answer > ");
                     String answer = sc.nextLine();
                    pc.addAnswer(s, questions, answer);
                    if(answer.toLowerCase().equals(questions.getCorrect().toLowerCase()))
                    {
                    countCorr ++;
                    }
                    System.out.println(" congratulation");
                System.out.printf("Your result: %d/%d \n", countCorr, question.size());
                System.out.print("See Detail (Y/N)");
                String choose= sc.nextLine();
                if(choose.toUpperCase().equals("Y"))
                {
                    
                    pc.prinResult(answer);
                }
                else if(choose.toUpperCase().equals("N"))
                    System.exit(0);
                }
                
                
                
                
                 
                
                
            } else {
                System.out.println("Đăng nhập thất bại");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
