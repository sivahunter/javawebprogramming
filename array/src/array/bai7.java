/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author ASUS
 */
public class bai7 {

    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {5, 6, 4}, {5, 4, 2}};
        int[][] b = {{2, 4, 3}, {1, 2, 5}, {2, 3, 1}};
        int tonghang = 0;
        int tongcot = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + b[i][j] + "   ");
            }
            System.out.println("");
        }
        System.out.println("----------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] * b[i][j] + "   ");
            }
            System.out.println(" ");
        }

    }
}
