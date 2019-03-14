/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai11;

/**
 *
 * @author ASUS
 */
public class main {
    public static void main(String[] args) {
        maTrix mt1= new maTrix();
        maTrix mt2= new maTrix();
                
//        int max = tongdong(0),chiso=0;
        mt1.nhapmatrix();
        mt2.nhapmatrix();
        mt1.xuatmatrix();
        mt1.tichMT(mt1, mt2,);
        
       
        
    }
}
