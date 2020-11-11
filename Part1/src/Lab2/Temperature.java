package Lab2;

import java.text.DecimalFormat;
import java.util.Scanner;

/*******
 *   ProfessionalSoftwareDevelopment:Lab2
 *   File: Temperature
 *   Created by: Melissa Melaugh
 *   Created on: 25/09/2020
 *   Updated on: 30/09/2020
 *   Project Description: Asks you what your base temperatue is and converts it between F and C.
 *******/

public class Temperature {
    private static final double RATIO = (9.0/5), ADJUSTMENT = 32;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        double celcius=0, farenheight=0;
        char type;
        DecimalFormat df = new DecimalFormat("0.0");

        System.out.println("What is your input type? Type C for Celcius and F for Farienheight then press enter");
        type = sc.next().charAt(0);
        type = Character.toLowerCase(type);
        System.out.println("What is the temperature you want converted? (Press enter when done)");

        if (type == 'c'){
            celcius = sc.nextDouble();
            farenheight = celciusToFarenheight(celcius);
        } else if (type == 'f') {
            farenheight = sc.nextDouble();
            celcius = farenheightToCelcius(farenheight);
        } else {
            System.out.println("Unsupported temperature!");
            System.exit(1);
        }
        System.out.println("Celsius: " + df.format(celcius));
        System.out.println("Farenheight: " + df.format(farenheight));
    }//end main

    private static double celciusToFarenheight(double celcius){
        double farenheight;
        farenheight = (celcius * RATIO) + ADJUSTMENT;
        return farenheight;
    }//end celciusToFarenheight

    private static double farenheightToCelcius(double farenheight){
        double celcius;
        celcius = ((farenheight - ADJUSTMENT) / RATIO);
        return celcius;
    }//end farenheightToCelcius
}//end Temperature
