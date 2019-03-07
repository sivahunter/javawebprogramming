/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

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

    public void setMonth(String month) {
        if(month.toUpperCase().equals("may"))
        {}
        this.month = 5;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "" + "" + date + "/" + month + "/" + year ;
    }

   
 
}
