package Replit;

import java.text.DecimalFormat;

/*******
 *   ProfessionalSoftwareDevelopment:Replit
 *   File: KiloToPound
 *   Created by: SolarLunix
 *   Created on: 14/10/2020
 *   Updated on: 14/10/2020
 *   Project Description: Show the kilo to pounds for every 5 kilos
 *******/
public class KiloToPound {
    public static void main(String[] args) {
        final double POUND_PER_KILO = 2.205;
        double pound;
        int kilo;
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Kilograms\tPounds");
        for(kilo = 5; kilo <= 100; kilo+=5){
            pound = POUND_PER_KILO * kilo;
            System.out.println(kilo + "\t\t\t" + df.format(pound));
        }
    }
}
