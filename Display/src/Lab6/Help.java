import java.util.Scanner;
/*******
 *   Lab5:PACKAGE_NAME
 *   File: DaysInMonth1
 *   Created by: Muyiwa Akin-Fatoki
 *   Created on: 07/10/2020
 *   Updated on: 07/10/2020
 *   Project Description: //TODO
 *******/
public class Help
{
    public static void main(String[] args)
    {
        int userMonth;
        int userYear;
        int leap1 = 100, leap2 = 4, leap3 = 400;
        int leapYear = 29;
        int notLeapYear = 28;
        int set31 = 31;
        int set30 = 30;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the year ");
        userYear = keyboard.nextInt();
        System.out.println("Enter the month (1 - 12) : ");
        userMonth = keyboard.nextInt();
        if ((userMonth == 2))
        {
            if (userYear % leap2 == 0) {
                if (userYear % leap1 == 0) {
                    if (userYear % leap3 == 0) {
                        System.out.println("There are " + leapYear + " days in " + userMonth + "in " + userYear);
                    }
                } else {
                    System.out.println("There are " + leapYear + " days in " + userMonth + "in " + userYear);
                }
            } else {
                System.out.println("There are " + notLeapYear + " days in " + userMonth + "in " + userYear);
            }
        }
        else if ((userMonth == 1) || (userMonth == 3) || (userMonth == 5) || (userMonth == 7) || (userMonth == 8) ||
                (userMonth == 10) || (userMonth == 12) )
            userMonth = set31;
        else if ((userMonth == 2) || (userMonth == 4) || (userMonth == 6) || (userMonth == 9) || (userMonth == 11))
        {
            userMonth = set30;
            System.out.println("There are " + notLeapYear + " days in month " + userMonth + " in " + userYear);
        }
///////////////////////////////////////////////////////////////////////////////////////////
        /**  Enter the year :
         Enter the month (1 - 12) :
         There are 29 days in month 2 in 2000**/
////////////////////////////////////////////////////////////////////////////////////////////
    }//main
}//class