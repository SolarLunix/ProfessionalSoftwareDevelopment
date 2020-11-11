package Week8;

import java.text.DecimalFormat;
import java.util.Scanner;

/*******
 *   Part2:Week8
 *   File: Transport
 *   Created by: SolarLunix
 *   Created on: 11/11/2020
 *   Updated on: 11/11/2020
 *   Project Description: Program to read in the weights of containers until -1 is entered and calculate the cost of
 *   haulage depending on the number of containers and the total weight
 *******/
public class Transport {
    private static int getWeight(int number){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the weight of container " + number + " (in kg) or -1 to finish: ");
        return keyboard.nextInt();
    }

    private static double calculateCost(int number, int weight){
        final int HIGHWEIGHT = 1000;
        final int LOWWEIGHT = 500;
        final int HIGHCOST = 1200;
        final int MIDDLECOST = 750;
        final int LOWCOST = 400;
        final int DISCOUNTNUMBER = 5;
        final double DISCOUNTRATE = 0.25;

        double cost;

        if(weight > HIGHWEIGHT){
            cost = HIGHCOST;
        } else {
            if(weight > LOWWEIGHT){
                cost = MIDDLECOST;
            } else {
                cost = LOWCOST;
            }
        }

        if (number <= DISCOUNTNUMBER){
            cost -= (cost * DISCOUNTRATE);
        }

        return cost;
    }

    public static void main(String[] args) {
        final int TERMINATOR = -1;
        DecimalFormat df = new DecimalFormat("0.00");
        int weight;
        int totalWeight = 0;
        int numberOfContainers = 0;
        double cost;

        weight = getWeight(1);
        while(weight != TERMINATOR){
            totalWeight += weight;
            numberOfContainers++;
            weight = getWeight(numberOfContainers);
        }
        cost = calculateCost(numberOfContainers, totalWeight);

        System.out.println("The total number of containers is " + numberOfContainers);
        System.out.println("The total weight of the containers is " + totalWeight);
        System.out.println("The total cost of transport is " + df.format(cost));
    }
}
