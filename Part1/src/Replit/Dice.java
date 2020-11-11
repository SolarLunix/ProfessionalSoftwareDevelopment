package Replit;

import java.util.Scanner;

/*******
 *   ProfessionalSoftwareDevelopment:Replit
 *   File: Dice
 *   Created by: SolarLunix
 *   Created on: 14/10/2020
 *   Updated on: 14/10/2020
 *   Project Description: Roll 2 dice as many times as you want.
 *******/
public class Dice {
    public static void main(String[] args) {
        int input;
        int dice1;
        int dice2;

        Scanner keyboard = new Scanner(System.in);

        do{
            dice1 = (int)(Math.random() * 6) + 1;
            dice2 = (int)(Math.random() * 6) + 1;

            System.out.println("Your dice are [" + dice1 + "] and [" + dice2 + ']');

            System.out.println("If you want to role dice again, type y, to exit type n");
            input = keyboard.nextLine().charAt(0);
        }while (input == 'Y' || input == 'y');
    }
}
