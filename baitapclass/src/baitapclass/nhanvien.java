/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapclass;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class nhanvien {

    String name;
    int age;
    String address;
    double salary;
    int totalTime;
    Scanner input=new Scanner(System.in);

    public nhanvien() {
    }

    public nhanvien(String name, int age, String address, double salary, int totalTime) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.salary = salary;
        this.totalTime = totalTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }

    public void printInfo() {
        System.out.println("Ten : " + this.getName());
        System.out.println("Tuoi : " + this.getAge());
        System.out.println(" dia chi : " + this.getAddress());
        System.out.println(" tien luong : " + this.getSalary());
        System.out.println(" tong gio lam " + this.getTotalTime());
        System.out.println(" tien thuong : "+this.tinhthuong());
    }
public void inputInfo()
{
    System.out.print("nhap ten : ");
    name=input.nextLine();
    System.out.print("nhap tuoi : ");
    age=input.nextInt();
    input.nextLine();
    System.out.print("nhap dia chi : ");
    address=input.nextLine();
    System.out.print(" tien luong : ");
    salary=input.nextDouble();
    System.out.print("Tong gi0 lam : ");
    totalTime=input.nextInt();

}
    public double tinhthuong() {
        double thuong = 0;
        if (totalTime >= 200) {
            thuong =  (salary * 20) / 100;
        }
        else if (totalTime<200 && totalTime>=100)
        {
            thuong=salary*10/100;
        }
        else if (totalTime<100)
            thuong=0;
        return thuong;
    }
}
