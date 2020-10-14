package Lab5;

import java.util.Scanner;

/*******
 *   ProfessionalSoftwareDevelopment:Lab5
 *   File: DaysInMonth1
 *   Created by: SolarLunix
 *   Created on: 12/10/2020
 *   Updated on: 12/10/2020
 *   Project Description: Print out the days in a month for a given year.
 *******/
public class DaysInMonth1 {
    public static void main(String[] args) {
        int days;
        int month;
        int year;
        boolean leapYear;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What year are you interested in learning about?");
        year = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("What month are you interested in learning about (as its number 01)?");
        month = keyboard.nextInt();
        keyboard.nextLine();

        switch (month){
            case 2:
                leapYear = isLeapYear(year);
                if(leapYear){
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            default:
                days = 31;
        }
        
        /*
        //OR It could be like this:
        if (month == 2){
            leapYear = isLeapYear(year);
            if(leapYear){
                days = 29;
            } else {
                days = 28;
            }
        } else if (month == 4  || month == 6 || month == 9 || month == 11){
            days = 30;
        } else {
            days = 31;
        }
           */

        System.out.println("In " + year + ", month " + month + " there were " + days + " days.");
    }

    public static boolean isLeapYear(int year){
        /**
         1. If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
         2. If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
         3. If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
         4. The year is a leap year (it has 366 days).
         5. The year is not a leap year (it has 365 days).
         */
        boolean leapYear = false;

        if (year%4 ==0) {
            if(year%100 == 0){
                if(year%400 == 0){
                    leapYear = true;
                }
            } else {
                leapYear = true;
            }
        }
        return leapYear;
    }

}
