/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class aptech {
    String HDSE;
    float dTK;
    String noiQuy;
    int lanThi;

    public aptech() {
    }

    public aptech(String HDSE, float dTK, String noiQuy, int lanThi) {
        this.HDSE = HDSE;
        this.dTK = dTK;
        this.noiQuy = noiQuy;
        this.lanThi = lanThi;
    }

    public String getHDSE() {
        return HDSE;
    }

    public void setHDSE(String HDSE) {
        this.HDSE = HDSE;
    }

    public float getdTK() {
        return dTK;
    }

    public void setdTK(float dTK) {
        this.dTK = dTK;
    }

    public String getNoiQuy() {
        return noiQuy;
    }

    public void setNoiQuy(String noiQuy) {
        this.noiQuy = noiQuy;
    }

    public int getLanThi() {
        return lanThi;
    }

    public void setLanThi(int lanThi) {
        this.lanThi = lanThi;
    }
    public void getInfo()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("nhap thoong tin");
        System.out.print("ban co dang ky khoa hoc HDSE ko (co or ko) : ");
        HDSE=sc.nextLine();
        System.out.print(" diem tong ket : ");
        dTK=sc.nextFloat();
        sc.nextLine();
        System.out.print("ban co vi pham noi quy (co or ko): ");
        noiQuy=sc.nextLine();
        System.out.print("so lan thi cua ban : ");
        lanThi=sc.nextInt();
    }
    public void checkInfo()
    {
        if(this.HDSE.charAt(0)=='c'&&this.dTK>=7.5&&this.noiQuy.charAt(0)=='k'&&this.lanThi==1)
        { 
            System.out.println("ba dk hoc bong");
        }
        else {
            System.out.println("ban ko dk hoc bong");
        }
    }
}
