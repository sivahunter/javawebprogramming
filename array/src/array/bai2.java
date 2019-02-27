/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class bai2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int max,min;
        
        int[] a=new int[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.print("nhap phan tu thu "+(i+1)+":");
            a[i]=sc.nextInt();
        }
        max=a[0];
        for (int i = 0; i < 5; i++) {
            
            if(a[i]>max)
            {
                
                max=a[i];
            }
        } 
        System.out.println("max = "+max);
        min=a[0];
        for (int i = 0; i < 5; i++) {
            if (a[i]<min) {
                min=a[i];
            }
        }
        System.out.println("min= "+min);
        for (int i = 0; i < 5; i++) {
            if (a[i]%3==0) {
                System.out.println(a[i]);
            }
        }
    }
}
