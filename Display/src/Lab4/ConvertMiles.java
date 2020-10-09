package Lab4;

import java.text.DecimalFormat;
import java.util.Scanner;

/*******
 *   ProfessionalSoftwareDevelopment:Lab4
 *   File: ConvertMiles
 *   Created by: Melissa Melaugh
 *   Created on: 06/10/2020
 *   Updated on: 06/10/2020
 *   Project Description: Convert from miles to kilometres
 *******/
public class ConvertMiles {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner scan = new Scanner(System.in);
        final double MILES_TO_KILOMETERS = 1.609;
        double miles;
        double kilometers;

        System.out.println("Enter the number of miles you've traveled and then press Enter:");
        miles = scan.nextDouble();
        scan.nextLine();

        kilometers = miles * MILES_TO_KILOMETERS;
        System.out.println("In " + miles + " miles, you have traveled " + df.format(kilometers) + "km.");
    }//end main
}//end ConvertMiles
