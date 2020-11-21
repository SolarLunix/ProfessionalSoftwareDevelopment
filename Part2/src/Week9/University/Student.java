package Week9.University;

import java.text.DecimalFormat;

/*******
 *   Part2:Week9.University
 *   File: Student
 *   Created by: Melissa Melaugh
 *   Created on: 18/11/2020
 *   Updated on: 21/11/2020
 *   Project Description: A Student member object of the university.
 *******/
public class Student extends Member{
    private static int nextStudentID = 1;
    private static int numberOfStudents = 0;
    private int studentID;
    private String course;
    private int mark1;
    private int mark2;
    private int mark3;

    public Student(String name, String email, String course, int mark1, int mark2, int mark3){
        super(name, email);
        this.setMarks(mark1, mark2, mark3);
        this.course = course;
        this.studentID = nextStudentID++;
        numberOfStudents++;
    }

    public Student(String name, String email, String course){
        this(name, email, course, -1, -1, -1);
    }

    public int getID(){
        return studentID;
    }

    protected void setCourse(String course){
        this.course = course;
    }

    public String getCourse() {
        return this.course;
    }

    protected void setMark1(int mark){
        this.mark1 = mark;
    }

    public int getMark1() {
        return this.mark1;
    }

    protected void setMark2(int mark){
        this.mark2 = mark;
    }

    public int getMark2() {
        return this.mark2;
    }

    protected void setMark3(int mark){
        this.mark3 = mark;
    }

    public int getMark3() {
        return this.mark3;
    }

    protected void setMarks(int mark1, int mark2, int mark3){
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    public double getAverage(){
        return (mark1 + mark2 + mark3)/3.0;
    }

    @Override
    protected String getStatus() {
        return "Student";
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        String out = "\nThe Student ID is " + this.studentID;
        out += "\nName:\t" + this.getName();
        out += "\nEmail:\t" + this.getEmail();
        out += "\nCourse:\t" + this.course;
        out += "\nThe student's three marks are:";
        out += "\n\t" + mark1 + "%";
        out += "\n\t" + mark2 + "%";
        out += "\n\t" + mark3 + "%";
        out += "\nThe average mark of the student is " + df.format(getAverage()) + "%";

        if(!(mark1 >= 0 && mark2 >= 0 && mark3 >= 0)) {
            out += "\n\tAt least one mark is not set, the average mark is incorrect.";
        }

        return out;
    }

    public static int numberOfStudents(){
        return numberOfStudents;
    }
}
