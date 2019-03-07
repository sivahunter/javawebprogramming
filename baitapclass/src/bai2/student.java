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
public class student {

    String msv;
    float diemTB;
    int tuoi;
    String lop;
    Scanner sc = new Scanner(System.in);

    public student() {
    }

    public student(String maSV, float diemTB, int tuoi, String lop) {

        this.msv = maSV;
        this.diemTB = diemTB;
        this.tuoi = tuoi;
        this.lop = lop;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void hocbong() {

        if (diemTB >= 8.0) {
            System.out.println("dc hc bong !!!!");
        } else {
            System.out.println("kho co hoc bong !!! ");
        }
    }

    public void inputInfo() {
        do {
            System.out.print(" ma sinh vien : ");
            msv = sc.nextLine();
        } while (msv.length() < 8);

        do {
            System.out.print(" diem trung binh : ");
            diemTB = sc.nextFloat();
        } while (diemTB <= 0.0 || diemTB >= 10.0);

        sc.nextLine();
        do
        {
        System.out.print(" tuoi : ");
        tuoi = sc.nextInt();
        }while(tuoi<=18);
        
        sc.nextLine();

        do {
            System.out.print(" lop : ");
            lop = sc.nextLine();
        } while (lop.charAt(0) != 'A' && lop.charAt(0) != 'C');

    }

    public void showInfo() {
        System.out.println("Ma Sinh vien : " + this.getMsv());
        System.out.println("Diem trung binh " + this.getDiemTB());
        System.out.println("tuoi " + this.getTuoi());
        System.out.println(" lop " + this.getLop());
        hocbong();

    }

}
