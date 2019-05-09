/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai12.pkg2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DUC
 */
public class StudentManager {
    private String dir="stdnt.txt";
    private List<Student> list= new ArrayList<>();
     public boolean load(String file) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            List<Student> data = (List<Student>) ois.readObject();
            this.list = data;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }
     public void add()
     {
     Scanner input = new Scanner(System.in);
        Student std = new Student();
        System.out.print("rollnumber > ");
        std.setRollnumber(input.nextLine());
        System.out.print("name > ");
        std.setName(input.nextLine());
        System.out.print("dat of birth  > ");
        std.setDob(Date.valueOf(input.nextLine()));
        System.out.print("email > ");
        std.setEmail(input.nextLine());

        list.add(std);

     }
    public Student search(String name) {
        for (Student student : list) {
            if (student.getName() == name) {
                return student;
            }
        }
        return null;

    }
    public boolean save() throws FileNotFoundException, IOException {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(dir));
            oos.writeObject(this.list);
            oos.flush();
            oos.close();

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;

    }
    public Student delete(String name)
    {
        for (Student student : list) {
            if(student.getName()==name)
            {
                list.remove(student);
            }
        }
        return null;
    }
    
    public void update()
    {
        
    }
    public void readFile() throws FileNotFoundException, IOException
    {
        try {
            FileInputStream fis = new FileInputStream(dir);
            ObjectInputStream ois = new ObjectInputStream(fis);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
    }
}
