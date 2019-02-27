/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;


public class bai3 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        Scanner sc= new Scanner(System.in);
        int b;
        System.out.println("nhap 1 so : ");
        b=sc.nextInt();
        for (int i = 0; i <a.length; i++) {
            if (a[i]==b) {
                System.out.println("vi tri "+(i+1));
            }
        }
    }
    
}
