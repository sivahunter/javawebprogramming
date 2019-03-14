/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class MyDate {
    private    int date;
    private  int month;
    private int year;
 public MyDate()
 {}

    public MyDate(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    @SuppressWarnings("empty-statement")
    public String add(int date,int month,int year){
       
        if(this.date+date>30)
        {
            this.month++;
        }
        if (this.month==2)
        {
            if(this.date+date>28)
            {
                this.month++;
            }
        }
        if(this.month+month>12)
        {
            this.year++;
        }
        return  this.date + "/" + this.month + "/" + this.year ; 
    }

//    @Override
//    public String toString() {
//        return date + "/" + month + "/" + year ;
//    }
   @Override
    public String toString(){
        return "ngay "+date+" thang "+month+" nam "+year;
        
    }
   
 
}
