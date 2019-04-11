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
public class Menu  {
    private Manager manager= null;
    
    
    public  Menu(Manager manager){
        this.manager=manager;
      
    }
    public void display()
    {
        int c=0;
        do {
            System.out.println("---------MENU----------");
            System.out.println("1.add");
            System.out.println("2.show");
            System.out.println("3.search");
            System.out.println("4.exit");
            System.out.print("nhap lua chon ");
            c= new Scanner(System.in).nextInt();
            switch(c)
            {
                case 1:
                    this.manager.add();
                    break;
                case 2:
                    this.manager.show();
                    break;
                case 3:
                    
                    this.manager.search(name);
            }
            
            
            
        } while (true);
        
    }
}
