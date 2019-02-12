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
public class bai2 {
    public static void main(String[] args) {
        int n = 0;
       Scanner input = new Scanner (System.in);
       
        System.out.print("nhap so nguyen co 3 chư so > ");
        n=input.nextInt();
        if(n<100||n>999)
        {
            System.out.println("so khong hop le "); 
        }
        else 
        {
            int donvi = n%10;
            n/=10;
            int truc= n%10;
            int tram = n/10;
            if (tram ==1)
            {System.out.println("một");}
            else if (tram==2)
            {System.out.println("hai");}
            else if (tram==3)
            {System.out.println("ba");}
            else if (tram==4)
            {System.out.println("bốn");}
            else if (tram==5)
            {System.out.println("năm");}
            else if (tram==6)
            {System.out.println("sáu");}
            else if (tram==7)
            {System.out.println("bảy");}
            else if (tram==8)
            {System.out.println("tám");}
            else if (tram==9)
            {System.out.println("chín");}
            System.out.print("tram");
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
