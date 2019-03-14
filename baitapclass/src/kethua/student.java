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
public class student extends human{
    private String studentid;
    public student(){}

    public student(String studentid, String name, int age) {
        super(name, age);
        this.studentid = studentid;
    }
    
    public student (String studentid)
    {
        this.studentid=studentid;
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }
    @Override
    public void print()
    {
        super.print();
        System.out.println(this.studentid +" ");
        
    }
    @Override
    public String toString() {
        return this.studentid;
    }
    
    
}
