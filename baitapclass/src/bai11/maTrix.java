/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai11;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class maTrix {

    static int n, m, matrix[][];

    public static void nhapmatrix() {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap so hang: ");
        n = input.nextInt();
        System.out.println("nhap so cot: ");
        m = input.nextInt();
        matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("  a[" + i + "," + j + "]=");
                matrix[i][j] = input.nextInt();
            }
            System.out.println();
        }
    }

    public static void xuatmatrix() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println("");
        }
    }

    public void tongMT(int a[][], int b[][], int c[][], int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }

        }

    }

    public void tichMT(int a[][], int b[][], int c[][]) {
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < m; k++) {
                c[i][k] = 0;
                for (int j = 0; j < n; j++) {
                    c[i][k] = c[i][k] + a[i][j] * b[j][k];
                }
            }
        }
    }

    public static int minle() {
        int minle = 1000;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if ((matrix[i][j] < minle) && (matrix[i][j] % 2 == 1)) {
                    minle = matrix[i][j];
                }
            }
        }
        return minle;
    }

    public static int tongdong(int row) {
        int tong = 0;
        for (int i = 0; i < m; i++) {
            tong += matrix[row][i];
        }
        return tong;
    }
}
