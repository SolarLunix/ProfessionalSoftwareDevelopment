package Lab3;

//imports
import java.util.Scanner;

/*******
 *   ProfessionalSoftwareDevelopment:Lab3
 *   File: HolidayCost
 *   Created by: Melissa Melaugh
 *   Created on: 30/09/2020
 *   Updated on: 30/09/2020
 *   Project Description: Create a program to calculate prices for a flight
 *******/

public class HolidayCost {
    public static void main(String ... args){
        //Variables
        final double VAT_ADJUSTOR = 1.2;
        int peopleTraveling, costOfFlight, costOfTransfer, totalCost;
        double totalFlightCost, totalTransferCost;
        Scanner keyboard = new Scanner(System.in);

        //get number of people, save it, clear buffer
        System.out.println("How many people are traveling? Type in a number and press enter.");
        peopleTraveling = keyboard.nextInt();
        keyboard.nextLine();

        //get cost of flight, save it, clear buffer
        System.out.println("What is the cost of your flight? Type in a number and press enter");
        costOfFlight = keyboard.nextInt();
        keyboard.nextLine();

        //get cost of layover, save it, clear buffer
        System.out.println("What is the cost of your transfer? Type in a number and press enter");
        costOfTransfer = keyboard.nextInt();
        keyboard.nextLine();

        //Do the calculations, remembering to round and cast properly.
        totalFlightCost = VAT_ADJUSTOR * peopleTraveling * costOfFlight;
        totalTransferCost = VAT_ADJUSTOR * peopleTraveling * costOfTransfer;
        totalCost = (int) Math.round(totalFlightCost + totalTransferCost);

        //Display costs:
        System.out.println("For " + peopleTraveling + " people it will cost £" + totalCost);
    }//end main
}//end HolidayCost
