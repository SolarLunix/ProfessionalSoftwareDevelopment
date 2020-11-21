package Week9.University;

import java.util.Scanner;

/*******
 *   Part2:Week9.University
 *   File: TestMember
 *   Created by: Melissa Melaugh
 *   Created on: 21/11/2020
 *   Updated on: 21/11/2020
 *   Project Description: A class for testing the member objects
 *******/
public class TestMember {
    private static Scanner in = new Scanner(System.in);

    private static double getNextDouble(String reqest){
        double nextdouble = 0;
        System.out.println(reqest);
        nextdouble = in.nextDouble();
        in.nextLine();
        return nextdouble;
    }

    private static String getNextString(String reqest){
        String nextString;
        System.out.println(reqest);
        nextString = in.nextLine();
        return nextString;
    }

    public static Staff[] testStaff(boolean getInput){

        Staff staff1 = new Staff("George McMullan", "g.mcmullan@ulster.ac.uk", "Lecturer", "F34", 30_000);
        Staff staff2 = new Staff("James Hollinger", "j.hollinger@ulster.ac.uk");
        Staff staff3;

        if(getInput) {
            String name = getNextString("Please enter the Staff member's name:");
            String email = getNextString("Please enter " + name + "'s email:");
            String jobTitle = getNextString("Please enter " + name + "'s job title:");
            String room = getNextString("Please enter " + name + "'s room:");
            double salary = getNextDouble("Please enter " + name + "'s salary:");

            staff3 = new Staff(name, email, jobTitle, room, salary);
        } else {
            staff3 = new Staff();
        }

        Staff[] staffList = {staff1, staff2, staff3};
        for(Staff staff : staffList){
            System.out.println(staff);
        }

        System.out.println("\nThere are " + Staff.getNumberOfStaff() + " staff members.");
        return staffList;
    }

    public static Student[] testStudent(){
        Student student1 = new Student("Fred Johnston", "johnston.f1@email.ulster.ac.uk", "Computing", 56, 67, 44);
        Student student2 = new Student("Jane Robinson", "robinson.j6@email.ulster.ac.uk", "Media Studies");

        Student[] studentList = {student1, student2};

        for(Student student : studentList){
            System.out.println(student);
        }

        System.out.println("\nThere are " + Student.numberOfStudents() + " students.");
        return studentList;
    }

    public static void main(String[] args) {
        Staff[] staffList = testStaff(false);
        Student[] studentList = testStudent();

        studentList[1].setMarks(80, 75, 77);
        System.out.println(studentList[1]);
        studentList[0].setMark2(76);
        System.out.println(studentList[0]);
        staffList[1].setSalary(45000);
        System.out.println(staffList[1]);
        System.out.println(staffList[2]);
    }
}
