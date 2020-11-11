package Replit;

import java.text.DecimalFormat;
import java.util.Scanner;

/*******
 *   ProfessionalSoftwareDevelopment:Replit
 *   File: Pay2
 *   Created by: SolarLunix
 *   Created on: 14/10/2020
 *   Updated on: 14/10/2020
 *   Project Description: Calculate a person's pay for the week.
 *******/
public class Pay2 {
    public static void main(String[] args) {
        final double BASIC_RATE = 5.95;
        final double OVERTIME_RATE = 8.50;
        final int NON_OVERTIME_HOURS = 40;

        DecimalFormat df = new DecimalFormat("0.00");
        Scanner in = new Scanner(System.in);

        String name;
        double hoursWorked;
        double hoursOvertime = 0;
        double pay;

        System.out.println("What is your name?");
        name = in.nextLine();

        System.out.println("How many hours did you work this week?");
        hoursWorked = in.nextDouble();
        in.nextLine();

        if (hoursWorked > NON_OVERTIME_HOURS){
            hoursOvertime = hoursWorked - NON_OVERTIME_HOURS;
            pay = (hoursOvertime * OVERTIME_RATE) + (NON_OVERTIME_HOURS * BASIC_RATE);
        } else {
            pay = hoursWorked * BASIC_RATE;
        } //end if/else

        System.out.println( name + ", your total pay for this week is: £" + df.format(pay));

    }//end main
}//end Pay2
