/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ontap;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class tamgiaca {
    public static void main(String[] args) {
        int h=0;
        Scanner input = new Scanner (System.in);
        System.out.println("nhap chieu cao tam giac");
        h=input.nextInt();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j <(2*i+1) ; j++) {
                if(i+j>=h-1 && j-i <=h-1)
                {
                    System.out.print("*");
                }
                else 
                {
                    System.out.print(" ");
                }
            
            
            }   
            System.out.println("");
        }
        
    }
}
