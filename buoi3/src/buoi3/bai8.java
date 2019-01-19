/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi3;

import static buoi3.Buoi3.soNT;
import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class bai8 {
    
    public static void main(String[] args) {
        
        
       float s = 0,sinx = 0;
         
       Scanner input = new Scanner(System.in) ;
        System.out.println("");
       System.out.print("nhap x > ");
       int x =input.nextInt();
        System.out.print("nhap n >");
       int n = input.nextInt();
       for(int i = 0; i<=n;i++)
       {
          sinx=(float) (s+pow(-1,i)*pow(x,2*i+1)/(giaithua(2*i+1)));
          
       }
        System.out.println("sin(x)"+sinx);
    }
    public static int giaithua(int n)
    {
        int giai_thua = 1;
        for(int i= 1;i<=n;i++)
        {
           giai_thua = giai_thua * i;
        }
        return giai_thua;
        
    }
}

