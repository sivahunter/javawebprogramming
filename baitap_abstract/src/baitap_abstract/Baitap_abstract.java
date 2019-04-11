/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap_abstract;

import java.util.Scanner;

/**
 *
 * @author DUC
 */
public class Baitap_abstract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Student ? EMployee ? (S/E) ");
        String c = new Scanner(System.in).nextLine();
        Manager instance = null;
        if(c.toUpperCase().equals("S"))
        {
            instance = new StudentManager();
        }
        
            
    }
    
}
