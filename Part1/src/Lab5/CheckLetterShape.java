package Lab5;

import java.util.Scanner;

/*******
 *   ProfessionalSoftwareDevelopment:Lab5
 *   File: CheckLetterShape
 *   Created by: SolarLunix
 *   Created on: 07/10/2020
 *   Updated on: 07/10/2020
 *   Project Description: Check if a letter is curved, straight, or mixed
 *******/
public class CheckLetterShape {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char userCharacter;
        String type;

        System.out.println("Please type the letter you'd like to check: ");
        userCharacter = in.nextLine().charAt(0);

        userCharacter = Character.toUpperCase(userCharacter);

        switch (userCharacter){
            case 'C': case 'O': case 'S':
                type = "Curved";
                break;
            case 'B': case 'D': case 'G': case 'J': case 'P': case 'Q': case 'R': case 'U':
                type = "Mixture";
                break;
            default:
                type = "Straight";
        }

        System.out.println("The letter " + userCharacter + " is a " + type + " letter.");
    }
}
