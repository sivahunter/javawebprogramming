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
public class Employee extends Person {
    private int id;
    private String name;
    private double salary;

    public Employee() {
    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public void input()
    {
    super.input();
        System.out.print("nhap luong > ");
        this.salary=sc.nextDouble();
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", salary=" + salary + '}';
    }
    
}
