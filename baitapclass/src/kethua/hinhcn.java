/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kethua;

/**
 *
 * @author ASUS
 */
public class hinhcn extends hinhoc{
    private double dai;
    private double rong;

    public hinhcn() {
    }

    public hinhcn(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public double getDai() {
        return dai;
    }

    public void setDai(double dai) {
        this.dai = dai;
    }

    public double getRong() {
        return rong;
    }

    public void setRong(double rong) {
        this.rong = rong;
    }
    
    public double caculate()
    {
        return this.dai*this.rong;
    }
    
//    public double area()
//    {
//        return this.dai*this.rong;
//    }
}
