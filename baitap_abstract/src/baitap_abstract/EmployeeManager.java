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
public class EmployeeManager extends Manager  {
   

    public EmployeeManager(Employee[] epl) {
        this.list = new Employee[MAX];
    }

    @Override
    public void add() {
      Employee ep= new Employee();
      ep.input();
      this.list[this.currQuantity]=ep;
      currQuantity++;
      
    }

    @Override
    public void show() {
        for (Person employee : list) {
            System.out.println(employee);
        }
    }

    @Override
    public void search(String name) {
        boolean found = false;
        for (int i = 0; i < this.list.length; i++) {
            Employee temp = (Employee) this.list[i];
            if (temp == null) {
                continue;
            }
            if (list[i].getName().equals(name)) {
                System.out.println(temp);
                found = true;
            }
            if (!found) {
                System.out.println("ko tim thay!!");
            }
        }
    }
    
}
