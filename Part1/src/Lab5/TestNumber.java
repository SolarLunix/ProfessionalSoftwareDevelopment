package Lab5;

import java.util.Scanner;

/*******
 *   ProfessionalSoftwareDevelopment:Lab5
 *   File: TestNumber
 *   Created by: SolarLunix
 *   Created on: 07/10/2020
 *   Updated on: 07/10/2020
 *   Project Description: Checks if a number is greater or equal to some value
 *******/
public class TestNumber {
    public static void main(String[] args) {
        final int SOMENUMBER = 0;
        int userNumber;

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter an integer and then hit enter:");
        userNumber = in.nextInt();
        in.nextLine();

        if (userNumber > SOMENUMBER){
            System.out.println("The number " + userNumber + " is greater than " + SOMENUMBER);
        } else if (userNumber == SOMENUMBER){
            System.out.println("The number " + userNumber + " is equal to " + SOMENUMBER);
        } else {
            System.out.println("The number " + userNumber + " is not greater than " + SOMENUMBER);
        }
    }
}
