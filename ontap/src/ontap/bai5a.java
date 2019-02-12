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
public class bai5a {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("nhap chieu dai > ");
        int m = input.nextInt();
        System.out.print("nhap chieu rong > ");
        int n = input.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("   *   ");
            }
            System.out.println("");
        }
    }
}
