package Replit;

import java.util.Scanner;
/*******
 *   ProfessionalSoftwareDevelopment:Lab6
 *   File: AddNumbers
 *   Created by: SolarLunix
 *   Created on: 09/10/2020
 *   Updated on: 09/10/2020
 *   Project Description: This is used to add numbers
 *******/
public class AddNumbers {
    public static void main(String[] args) {
        final int HOWMANY = 4;
        int count;
        int number;
        int total=0;

        Scanner keyboard = new Scanner(System.in);

        for(count = 0; count <HOWMANY; count ++){
            System.out.println("Enter a number -");
            number = keyboard.nextInt();
            total += number; //(total = total + number)
        }
        System.out.println("Total of numbers = " + total);
    }
}