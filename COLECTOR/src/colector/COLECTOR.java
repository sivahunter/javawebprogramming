/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colector;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DUC
 */
public class COLECTOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("book");
        list.add("Student");
        System.out.println("list size > " + list.size());
        System.out.println(list.get(0));
        System.out.println(list.size());

        System.out.println(list);
        list.remove("hello");
        System.out.println(list.size());
        list.clear();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        List<Student> stud= new ArrayList<>();
        stud.add(new Student(1,"duc"));
        stud.add(new Student(2,"luy"));
        stud.add(new Student(3,"trung"));
        
        
            
    }

}
