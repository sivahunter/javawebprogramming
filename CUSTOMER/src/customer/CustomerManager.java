/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DUC
 */
public class CustomerManager {

    private String dir = "cust.dat";
    private List<Customer> list = new ArrayList<>();

    public boolean load(String file) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            List<Customer> data = (List<Customer>) ois.readObject();
            this.list = data;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public void add() {
        Scanner input = new Scanner(System.in);
        Customer cus = new Customer();
        System.out.print("id > ");
        cus.setId(Integer.parseInt(input.nextLine()));
        System.out.print("name > ");
        cus.setName(input.nextLine());
        System.out.print("Address  > ");
        cus.setAddress(input.nextLine());
        System.out.print("Age > ");
        cus.setAge(Integer.parseInt(input.nextLine()));

        list.add(cus);

    }

    public Customer search(int id) {
        for (Customer customer : list) {
            if (customer.getId() == id) {
                return customer;
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
}
