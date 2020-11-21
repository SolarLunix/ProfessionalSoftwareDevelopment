package Week9.University;

import java.text.DecimalFormat;

/*******
 *   Part2:Week9.University
 *   File: Staff
 *   Created by: Melissa Melaugh
 *   Created on: 18/11/2020
 *   Updated on: 21/11/2020
 *   Project Description: A Staff member object of the university.
 *******/
public class Staff extends Member{
    private static int nextStaffNumber = 100001;
    private static int numberOfStaff = 0;
    private int staffNumber;
    private String jobTitle;
    private String room;
    private double salary;

    public Staff (String name, String email, String jobTitle, String room, double salary){
        super(name, email);
        this.jobTitle = jobTitle;
        this.room = room;
        this.salary = salary;
        this.staffNumber = nextStaffNumber++;
        numberOfStaff++;
    }

    public Staff(String name, String email){
        this(name, email, "", "", 0);
    }

    public Staff(){
        this("", "", "", "", 0);
    }

    public int getID(){
        return this.staffNumber;
    }

    protected void setJobTitle(String jobTitle){
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return this.jobTitle;
    }

    protected void setRoom(String room){
        this.room = room;
    }

    public String getRoom(){
        return this.room;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    protected double getSalary() {
        return this.salary;
    }

    @Override
    protected String getStatus() {
        return "Staff";
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0,000.00");
        String out = "\nThe Staff ID is " + this.staffNumber;
        out += "\nName:\t\t" + this.getName();
        out += "\nEmail:\t\t" + this.getEmail();
        out += "\nJob Title:\t" + this.jobTitle;
        out += "\nRoom:\t\t" + this.room;
        out += "\nSalary:\t\t£" + df.format(this.salary);
        return out;
    }

    public static int getNumberOfStaff() {
        return numberOfStaff;
    }
}
