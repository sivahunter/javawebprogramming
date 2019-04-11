/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai12;

/**
 *
 * @author ASUS
 */
public class Hcn extends Paralle {
     @Override
     public double area() {
     System.out.print("nhap chieu dai > ");
        this.chieudai=sc.nextInt();
        System.out.print("nhap chieu rong > ");
        this.chieurong=sc.nextInt();
        this.sq=this.chieudai*this.chieurong;
         return this.sq;
     }
     public double perimeter() {
        System.out.print("nhap chieu dai > ");
        this.chieudai=sc.nextInt();
        System.out.print("nhap chieu rong > ");
        this.chieurong=sc.nextInt();
        this.p=(this.chieudai+this.chieurong)*2;
         return this.p;
    }
}
