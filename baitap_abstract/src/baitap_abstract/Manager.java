/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap_abstract;

/**
 *
 * @author DUC
 */
public abstract class Manager {
     protected Person[] list;
    public static final int MAX = 50;
    protected int currQuantity = 0;
    public abstract void add();
    public abstract void show();
    public abstract void search(String name);
}
