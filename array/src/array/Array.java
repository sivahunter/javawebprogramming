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
public class Array {

    
    public static void main(String[] args) {
       int[] a = new int[5];
       int sum=0;
       int tongle=0;
       int tongchan=0;
       
       Scanner input = new Scanner(System.in);
       
        for (int i = 0; i <5; i++) {
            System.out.print("nhap vao phan tu thu "+(i+1)+":");
            a[i]=input.nextInt();  
            sum=sum+a[i];
        }
        System.out.println("tong ="+sum);
        for (int i = 0; i < 5; i++) {
            if(a[i]%2!=0)
            {
                tongle=tongle+a[i];
            }
            
        }
        System.out.println("tong le = "+tongle);
        for (int i = 0; i < 5; i++) {
            if(a[i]%2==0)
            {
                tongchan+=a[i];
            }
        }
        System.out.println("tong chan = "+tongchan);
    }
    
}
