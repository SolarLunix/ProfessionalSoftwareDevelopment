package Lab3;

import java.util.Scanner;
import java.text.DecimalFormat;
/*******
 *   ProfessionalSoftwareDevelopment:Lab3
 *   File: Hours Worked
 *   Created by: Melissa Melaugh
 *   Created on: 30/09/2020
 *   Updated on: 30/09/2020
 *   Project Description: A program that calculates someone's pay after they input their name and hours worked
 *******/

public class HoursWorked {
    static public void main(String args[]){
        /** Next we need to design and develop a program which prompts the user for their name and hours worked.
         * The program should store this information as variables. The program should also store the hourly rate of
         * £5.95 as a CONSTANT and then use this constant to calculate the user’s pay.
         * The program should output informative text including the user’s name and print out their pay to 2 decimal places.
         * */

        //Variables:
        final double HOURLY_RATE = 5.95;
        String name;
        double hoursWorked, totalPay;
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner keyboard = new Scanner(System.in);

        //Get the user's name
        System.out.println("Please enter your name and press enter when done:");
        name = keyboard.nextLine();

        //Get hours worked
        System.out.println("Please enter how many hours you've worked and press enter when done:");
        hoursWorked = keyboard.nextDouble();

        //Calculate pay
        totalPay = hoursWorked * HOURLY_RATE;

        //Print out information
        System.out.println(name + ", you've worked " + df.format(hoursWorked) + " hours, and earned £" + df.format(totalPay));
    }//end main
}//end HoursWorked
