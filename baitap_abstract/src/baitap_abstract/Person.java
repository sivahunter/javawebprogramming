/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap_abstract;

import java.util.Scanner;

/**
 *
 * @author DUC
 */
public class Person {
    private int id;
    private String name;
    public Scanner sc= new Scanner (System.in);

    public Person() {
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void input()
    {
        System.out.print(" nhap id > ");
        this.id=sc.nextInt();
        sc.nextLine();
        System.out.print("nhap ten > ");
        this.name=sc.nextLine();
    }
}
