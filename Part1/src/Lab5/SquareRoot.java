package Lab5;

import java.text.DecimalFormat;
import java.util.Scanner;

/*******
 *   ProfessionalSoftwareDevelopment:Lab5
 *   File: SquareRoot
 *   Created by: SolarLunix
 *   Created on: 07/10/2020
 *   Updated on: 07/10/2020
 *   Project Description: Calculate a number's square root if it has one!
 *******/
public class SquareRoot {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner in = new Scanner(System.in);
        double userIn;
        double squareroot;

        System.out.println("Please provide a number and then hit enter:");
        userIn = in.nextDouble();
        in.nextLine();

        if(userIn >= 0){
            squareroot = Math.pow(userIn, 0.5);
            System.out.println("The square root of " + df.format(userIn) + " = " + df.format(squareroot));
        } else {
            System.out.println("Your number does not have a square root!");
        }
    }
}//end SquareRoot
