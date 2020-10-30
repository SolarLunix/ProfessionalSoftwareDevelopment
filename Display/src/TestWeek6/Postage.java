package TestWeek6;

import java.text.DecimalFormat;
import java.util.Scanner;

/*******
 *   ProfessionalSoftwareDevelopment:Boil
 *   File: Postage
 *   Created by: Melissa Melaugh
 *   Created on: 30/10/2020
 *   Updated on: 30/10/2020
 *   Project Description: This application is designed to read in key customer details and  then calculate  how much
 *   postage a customer is  required  to  pay  to  send  some  parcels  using  the  Fast  Delivery Company
 *******/
public class Postage {
    private static Scanner in = new Scanner(System.in);

    private static String getName(String reqest){
        String nextString;
        System.out.print(reqest);
        nextString = in.nextLine();
        return nextString.toUpperCase();
    }

    private static int getNumber(String reqest){
        int nextint = 0;
        System.out.print(reqest);
        nextint = in.nextInt();
        in.nextLine(); //clear the line
        return nextint;
    }

    private static double calculateParcelCost(double weight){
        final double SMALL_PRICE = 4.00;
        final double SMALL_WEIGHT_MAX = 5; //kg
        final double MEDIUM_PRICE = 7.50;
        final double MEDIUM_WEIGHT_MAX = 10; //kg
        final double LARGE_PRICE = 10.00;

        double cost = SMALL_PRICE; //Default to small parcel

        if(weight > MEDIUM_WEIGHT_MAX)   //If it's actually a large parcel
            cost = LARGE_PRICE;
        else if (weight > SMALL_WEIGHT_MAX)  //If it's actually a medium parcel
                 cost = MEDIUM_PRICE;

        return cost;
    }

    public static void main(String[] args) {
        String name;
        int parcels;
        double weight;
        double totalweight = 0;
        double totalcost = 0.00;

        DecimalFormat df = new DecimalFormat("0.00");

        //Get primary information:
        name = getName("Please enter your name: ");
        parcels = getNumber(("How many parcels have you? "));

        //Get parcel information:
        for(int count = 1; count <= parcels; count++){
            System.out.print("Please enter the weight of parcel " + count + " (in kg): ");
            weight = in.nextDouble();
            in.nextLine(); //clear the line

            totalcost += calculateParcelCost(weight);
            totalweight += weight;
        } //this could have been a do while loop, but to me it made more sense to use a for loop

        //Print out the information as specified:
        System.out.println("\n");
        System.out.println("Name: \t\t\t\t\t\t" + name);
        System.out.println("Number of parcels: \t\t\t" + parcels);
        System.out.println("Total weight of parcels: \t" + df.format(totalweight) + "kg");
        System.out.println("Total cost of postage: \t\t£" + df.format(totalcost));

    }
}
