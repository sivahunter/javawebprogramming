
package array;

import java.util.Random;


public class bai4 {
    public static void main(String[] args) {
        Random rd= new Random();
        int sochan=0,sole=0;
        int[] a= new int[15];
        for (int i = 0; i < 15; i++) {
        a [i]= rd.nextInt(100);
        System.out.println("a " + (i+1) + "=" + a[i]);
        }
        int temp = a[0];
        for (int i = 0 ; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            } System.out.println(a[i]);
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i]%2==0) {
                sochan++;
            }
            else
            {
                sole++;
            }
            
        }
        System.out.println("so chẵn = "+sochan);
        System.out.println("số lẻ = "+sole);
    }
}
