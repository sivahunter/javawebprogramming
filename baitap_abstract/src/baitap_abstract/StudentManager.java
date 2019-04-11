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
public class StudentManager extends Manager {

   

    public StudentManager(Student[] st) {
        this.list = new Student[MAX];

    }

    @Override
    public void add() {
        Student st = new Student();
        st.input();
        this.list[this.currQuantity] = st;
        currQuantity++;

    }

    @Override
    public void show() {
        for (Person student : list) {
            System.out.println(student);
        }

    }

    @Override
    public void search(String name) {
        boolean found = false;
        for (int i = 0; i < this.currQuantity; i++) {
            Student temp = (Student) this.list[i];
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
