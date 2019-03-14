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
public class hinhtron extends hinhoc{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
   
    public double caculate()
    {
        return Math.PI*Math.pow(radius, 2);
    }
}
