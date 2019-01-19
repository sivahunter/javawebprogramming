/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt_java;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Lt_java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,max=0,min=0;
       float S=0;
       int temp,reverse =0,r;
       
       Scanner input = new Scanner (System.in);
       //bai 10
        System.out.print("nhap n> ");
        n=input.nextInt();
        temp=n;
        while(temp!=0)
        {
            r= temp%10;
            reverse = reverse*10 + r;
            temp /= 10;
        }
        if(reverse == n) 
            System.out.println(+n+" la so doi xung");
     else
            System.out.println(+n+" ko la so doi xung");
       
        
        System.out.println("dhfiuaiudfhahdf");
        
   //bai 9    
//       System.out.print("Nhap goc > ");
//        double x = input.nextDouble(); // đơn vị là độ
//        // đổi đơn vị sang rad
//        double xRad = x * Math.PI / 180;
//        
//        double ERR = 0.0000001;
//        double dif = 0;
//        double cosx = 0;
//        int i = 0;
//        do {
//            dif = Math.pow(-1, i) * (Math.pow(xRad, 2*i ) / factori2(2*i ));
//            cosx += dif;
//            i++;
//            System.out.println("cos("+x+") = " + cosx);
//        } while(Math.abs(dif) > ERR);
//        
//        System.out.println("===========================");
//        System.out.println("cos("+x+") = " + cosx);
//        System.out.println("cos("+x+") = " + Math.cos(xRad));
//    }
//    
//    public static int factori(int n) {
//        if (n == 0 || n == 1) return 1;
//        int gt = 1;
//        for (int i = 1; i <= n; i++) {
//            gt *= i;
//        }
//        return gt;
//    }
//    public static long factori2(long n) {
//        if (n == 0 || n == 1) return 1;
//        return n * factori2(n - 1);
//        
//    }

    
  
       
       //bai 5
//        do {
//            System.out.println("nhap số nguyên dương n> ");
//            Scanner input = new Scanner(System.in);
//            n=input.nextInt();
//            for (int i = 1; i <= n; i++) 
//            {
//            S +=1/(float)i; 
//            }
//        } while (n<=0);
//        
//        
//        System.out.println(" S = "+S);
// bai 4
//       do
//       {
//           System.out.println("nhap so nguyen n > ");
//           Scanner input = new Scanner(System.in);
//           n= input.nextInt();
//           for (int i = 0; i < n; i++) {
//               if(n[i]<min)
//               {
//                   min = n[i];
//               }
//               
//           }
//       }while(n !=0);
        
    }
    
}
