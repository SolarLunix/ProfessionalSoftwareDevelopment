/*
 *   ProfessionalSoftwareDevelopment:Lab2
 *   File: //TODO
 *   Created by: Melissa Melaugh
 *   Created on: 25/09/2020
 *   Updated on: 25/09/2020
 *   Project Description: //TODO
 */
package Lab2;

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Temperature {
    static private double RATIO = (9.0/5), ADJUSTMENT = 32;
    static private Scanner sc = new Scanner(System.in);

    static public void main(String[] args){
        double c=0, f=0;
        char type;
        DecimalFormat df = new DecimalFormat("0.0");

        System.out.println("What is your input type? Type C for Celcius and F for Farienheight then press enter");
        type = sc.next().charAt(0);
        type = Character.toLowerCase(type);
        System.out.println("What is the temperature you want converted? (Press enter when done)");

        if (type == 'c'){
            c = sc.nextDouble();
            f = celciusToFarenheight(c);
        } else if (type == 'f') {
            f = sc.nextDouble();
            c = farenheightToCelcius(f);
        } else {
            System.out.println("Unsupported temperature!");
            System.exit(1);
        }
        System.out.println("Celsius: " + df.format(c));
        System.out.println("Farenheight: " + df.format(f));
    }

    static private double celciusToFarenheight(double c){
        return (c * RATIO) + ADJUSTMENT;
    }

    static private double farenheightToCelcius(double f){
        return ((f - ADJUSTMENT) / RATIO);
    }
}
