/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract_class;

/**
 *
 * @author ASUS
 */
public class Caculimpl extends Caculate{
    int s= 0;
    @Override
            
    public double sum (int[] arr)
    { 
        
        for (int i : arr) {
            s+=i;
        }
        return s;
    }

    @Override
    public double avarage(int[] arr) {
       
        return (double)this.s /arr.length; 
    }
}
