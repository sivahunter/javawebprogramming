/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package COM.JAVA.DEMO.STUDENT;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Menu {
    public void show()
    {
        int c;
        Scanner input=  new Scanner(System.in);
        do {
            System.out.println("========Menu========");
            System.out.println("1. Show ");
            System.out.println("2. ");
            System.out.println("3. ");
            System.out.println("4. ");
            System.out.print(" nhaplua chon >  ");
            c=input.nextInt();
            switch (c) 
            {
                case 1:
                    break;
                case 2:
                    break ;
                case 3:
                    break;
                case 4:
                    System.exit(0);
                    break;
            
            }
        } while (true);
        
    }
}
