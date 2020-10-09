package Lab5;

import java.util.Scanner;

/*******
 *   ProfessionalSoftwareDevelopment:Lab5
 *   File: GuessNumber
 *   Created by: SolarLunix
 *   Created on: 07/10/2020
 *   Updated on: 07/10/2020
 *   Project Description: A game where you try to guess a generated number.
 *******/
public class GuessNumber {
    public static void main(String[] args) {
        final int NUMBER = (int)(Math.random() * 100);
        int guess;

        Scanner in = new Scanner(System.in);
        System.out.println("Please guess a value between 0 and 100 then hit enter!");
        guess = in.nextInt();
        in.nextLine();

        if (guess == NUMBER){
            System.out.println("CONGRATS! The number was " + NUMBER);
        } else {
            System.out.println("Sorry, your guess of " + guess + " was wrong, the answer was " + NUMBER);
        }
        System.out.println("\nThanks for playing!");
    }
}//end GuessNumber
