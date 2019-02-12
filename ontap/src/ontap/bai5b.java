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
public class bai5b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" nhap chieu dai > ");
        int m = input.nextInt();
        System.out.print(" nhap chieu dai > ");
        int n = input.nextInt();
        for(int i=1;i<=m;i++)
        {
            System.out.print("*");
            
        }System.out.println("");
        for (int i = 1; i <=n-2; i++) {
            System.out.print("*");
            for (int j = 2; j <=m-1; j++) {
                System.out.print("  ");
                
            }System.out.println("*");
        }
	       for (int i = 1; i < m; i++) {
                   System.out.print("*");
                   
        }System.out.println("");
    }
}


