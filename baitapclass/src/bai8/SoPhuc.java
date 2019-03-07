/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai8;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class SoPhuc {

    int pa, pb;

    public SoPhuc() {
    }

    public SoPhuc(int a, int b)
    {
        this.pa = a;
        this.pb = b;
    }

    public int nhapInt() 
    {
        Scanner so = new Scanner(System.in);
        int x = so.nextInt();
        return x;
    }

    public SoPhuc nhapSP() {
        System.out.print("Phan thuc =");
        int a = nhapInt();
        System.out.print("Phan ao =");
        int b = nhapInt();
        SoPhuc A = new SoPhuc(a, b);
        return A;
    }

    public void hthi(SoPhuc A) {
        System.out.println(A.pa + " + i*" + A.pb);

    }

    public SoPhuc congSP(SoPhuc A, SoPhuc B) {
        SoPhuc C = new SoPhuc();
        C.pa = A.pa + B.pa;
        C.pb = A.pb + B.pb;
        return C;
    }

    public SoPhuc tichSP(SoPhuc A, SoPhuc B) {
        SoPhuc C = new SoPhuc();
        C.pa = A.pa * B.pa - A.pb * B.pb;
        C.pa = A.pa * B.pb + A.pb * B.pa;
        return C;
    }

    public static void main(String[] args) {
        System.out.print("Nhap vao So phuc 1:");
        SoPhuc A = new SoPhuc();
        A = A.nhapSP();
        System.out.print("Nhap vao So phuc 2:");
        SoPhuc B = new SoPhuc();
        B = B.nhapSP();
        System.out.println("So phuc 1:");
        A.hthi(A);

        System.out.println("So phuc 2:");
        B.hthi(B);

        System.out.println("Tong 2 So phuc= ");
        SoPhuc T = new SoPhuc();
        T = T.congSP(A, B);
        T.hthi(T);
        System.out.println("Tich 2 So phuc= ");
        SoPhuc K = new SoPhuc();
        K = K.tichSP(A, B);
        K.hthi(K);

    }
}
