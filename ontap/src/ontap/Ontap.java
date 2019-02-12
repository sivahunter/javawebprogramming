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
public class Ontap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int n = 0;
       Scanner input = new Scanner (System.in);
       
        System.out.print("nhap so nguyen co 2 chư so > ");
        n=input.nextInt();
        if (n<9 || n>99)
        {
            System.out.println(" ko hop le ");
            
        }
        else 
        {
           int truc= n/10;
            int donvi = n%10;
            
             if (truc ==9)
                System.out.print("chín mươi");
             else if (truc == 8)
                 System.out.print("tám mươi");
             else if (truc == 7)
                 System.out.print("bảy mươi");
             else if (truc == 6)
                 System.out.print("sáu mươi");
             else if (truc == 5)
                 System.out.print("năm mươi");
             else if (truc == 4)
                 System.out.print("bốn mươi");
             else if (truc == 3)
                 System.out.print("ba mươi");
             else if (truc == 2)
                 System.out.print("hai mươi");
             else if (truc == 1)
                 System.out.print("mười");
            else if(donvi==1)
                 System.out.print(" mốt");
            else if(donvi==1)
                 System.out.println(" mốt");
             if(donvi==2)
                 System.out.println(" hai");
             if(donvi==3)
                 System.out.println(" ba");
             if(donvi==4)
                 System.out.println(" bốn");
             if(donvi==5)
                 System.out.println(" lăm");
             if(donvi==6)
                 System.out.println(" sáu");
             if(donvi==7)
                 System.out.println(" bảy");
             if(donvi==8)
                 System.out.println("tám");
             if(donvi==9)
                 System.out.println(" chín");
             if(donvi ==1 && truc ==1)
                 System.out.println(" một");
             
        }
        
        
    }
    
}
