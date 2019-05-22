/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package COM.JAVA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DUC
 */
public class DEMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Process p = new Process();
            while (true) {
                System.out.println(" 1 . ex6");
                System.out.println(" 2. ex7");
                System.out.println(" 3. ex8");
                System.out.println(" 4. ex9");
                System.out.println(" 5. ex10");
                System.out.print("nhap > ");
                int chon = Integer.parseInt(sc.nextLine());
                switch (chon) {
                    case 1:
                        System.out.print("Nhap ten sach: ");
                        String name = sc.nextLine();
                        System.out.print("Nhap ngay muon (dd/mm/yyyy): ");
                        String date = sc.nextLine();

                        ResultSet rs = p.ex6(name, date);
                        while (rs.next()) {
                            System.out.println(rs.getString(1));
                        }
                        p.ex6(name, date);
                    break;
                    case 2:
                        p.ex7();
                        break;
                    case 3:
                        p.ex8();
                        break;
                        
                    case 4:
                        p.ex9();
                        break;
                        
                    case 5:
                        p.ex10();
                        break;
                        default:
                            System.out.println(" nhap lai");
                        
                               

                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
