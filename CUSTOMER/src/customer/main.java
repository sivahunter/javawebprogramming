/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customer;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author DUC
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        CustomerManager ctm = new CustomerManager();
        Scanner sc = new Scanner(System.in);
        
        
        do {    
            System.out.println("======MENU======");
            System.out.println("1. Load Data");
            System.out.println("2. Add new ");
            System.out.println("3. Search");
            System.out.println("4. Save");
            System.out.println("5. exit");
            System.out.print("nhap >  ");
           int  chon=Integer.parseInt(sc.nextLine());
            
            switch(chon)
            {
                case 1:
                    System.out.print(" file path >");
                    String path=sc.nextLine();
                    if(ctm.load(path))
                    {
                        System.out.println("sucessful !!!!");
                    }
                    else
                        System.out.println("error");
                break;
                case 2:
                ctm.add();
                break;
                case 3:
                    System.out.print("ID > ");
                    int id= Integer.parseInt(sc.nextLine());
                    Customer cust = ctm.search(id);
                    if(cust != null)
                    {
                        System.out.println(cust);
                    }
                    else
                        System.out.println("not found ");
                    
                    break;
                case 4:
                    if(ctm.save())
                    {
                        System.out.println("sucessful !!");
                        
                    }
                    else 
                        System.out.println("error");
                    break;
                case 5:
                    System.exit(0);
                        
            }
           

            
        } while (true);
        
        
    }
    
}
