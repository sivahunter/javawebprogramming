/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi3;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Buoi3 {

    public static void main(String[] args) {

        float delta;
        int n, giai_thua = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("nhap n > ");
        n = input.nextInt();

        /* bai 6/
          System.out.print("Nhập số nguyên dương a = ");
//        int a =input.nextInt();
//        System.out.print("Nhập số nguyên dương b = ");
//        int b = input.nextInt();
//        
//        System.out.println("USCLN của " + a + " và " + b
//                + " là: " + USCLN(a, b));
//     
//        System.out.println("BSCNN của " + a + " và " + b
//                + " là: " + BSCNN(a, b));

       
       
       
       /*bai 7/
       for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
       }
       
       /*bai 3*/
        if (soNT(n)) {
            System.out.println(n + " la so nguyen to");
        } else {
            System.out.println(n + " ko phai so nguyen to");
        }
        int dem = 0; // đếm số số nguyên tố
        int i = 2;   // tìm số nguyên tố bắt dầu từ số 2
        while (dem < n) {
            if (soNT(i)) {
                System.out.print(i + " ");
                dem++;
            }
            i++;
        }

        /*bai 2*/
//        System.out.print("nhap n > ");
//        n=input.nextInt();
//        for(int i =1;i<=n;i++)
//        {
//            giai_thua = giai_thua*i;
//        }
//               System.out.println(giai_thua);

        /* bai 1*/
//       System.out.println("giai phuong trinh bac 2 ");
//        System.out.print(" a = ");
//        int a = input.nextInt();
//        System.out.print(" b = ");
//        int b = input.nextInt();
//        System.out.print(" c = ");
//        int c = input.nextInt();
//        delta = (b*b)- 4*a*c;
//        if(delta < 0)
//        {
//            System.out.println("phuong trinh vo nghiem");
//        }
//        else if (delta == 0)
//        {
//            System.out.println("phuong trinh co nghiem kep ");
//            System.out.println(" X1 = X2 ="+(b - sqrt(delta)/2*a));
//        }
//        else if (delta > 0)
//                {
//                    System.out.println("phuong trinh co 2 nghiem phan biet ");
//                    System.out.println("X1 = "+((-b)-sqrt(delta)/2*a));
//                    System.out.println("X2 = "+(-b)+sqrt(delta)/2*a);
//                    
//                }
    }

    public static boolean soNT(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int fibonacci(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static int USCLN(int a, int b) {
        if (b == 0) {
            return a;
        }
        return USCLN(b, a % b);
    }

    public static int BSCNN(int a, int b) {
        return (a * b) / USCLN(a, b);
    }
}
