/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

/**
 *
 * @author ASUS
 */
public class so_nt {
    int a;
    public so_nt(int a)
    {
        this.a=a;   
    }

    public so_nt() {
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
    
 public  boolean isSo_nt(int a)
 {
     if(this.a<2)
         return false;
     for (int i = 2; i <this.a-1; i++) {
         if(this.a%i==0)
         {
             return false;
         }
     }
     return true;
 }
 public void ShowInfo()
 {
     if(isSo_nt(a)==true)
     {
         System.out.println(a+" la so nguye to");
     }
     else
     {
         System.out.println(a+" ko phai so nguyen to");
     }
 }
}
