/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file_java;

import java.io.File;
import java.util.Date;

/**
 *
 * @author DUC
 */
public class FileUtil {

    String link;

    public FileUtil() {
        this.link = link;
    }

    public void getFolder(String link) {

        File apath1 = new File(link);
        if (apath1.exists()) {
            File[] folder = apath1.listFiles();
            for (File file : folder) {
                if (apath1.isDirectory()) {
                    System.out.println(file.getName());
                }
            }
        } else {
            boolean create = apath1.mkdir();
        }
    }

    public void getFile(String link) {
        File apath2 = new File(link);
        if (apath2.exists()) {
            File[] f1 = apath2.listFiles();
            for (File file : f1) {
                System.out.println(file.getAbsolutePath());
            }
            String[] paths = apath2.list();
            for (String path : paths) {
                System.out.println(path);
            }
        }

    }

    public void file_anh(String link) {
        File apath3 = new File(link);
        if (apath3.isDirectory()) {
            File[] f2 = apath3.listFiles();
            for (File file : f2) {
                if (file.getName().endsWith(".png") || file.getName().endsWith(".jpg") || file.getName().endsWith(".jpeg")) {
                    System.out.println(file);
                }

            }

        }
    }

    public boolean EXT(File file_ext) {
        if (!file_ext.isFile()) {
            return false;
        }
        if (file_ext.getAbsolutePath().endsWith(".txt")) {
            System.out.println(file_ext);
            return true;
        }
        return false;
    }

    public void lastModifi() {
        File f2 = new File("c:/mydocument/test.txt");
        long lastMofifyInMillis = f2.lastModified();
        Date lastModifyDate = new Date(lastMofifyInMillis);

        System.out.println("Last modify date: " + lastModifyDate);
        System.out.println("length(MB)" + f2.length() / (1024 * 1024));
    }

}
