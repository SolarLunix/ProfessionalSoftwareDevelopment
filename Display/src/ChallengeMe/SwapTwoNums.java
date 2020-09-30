package ChallengeMe;

/*******
 *   ProfessionalSoftwareDevelopment:ChallengeMe
 *   File: SwapTwoNums
 *   Created by: Melissa Melaugh
 *   Created on: 24/09/2020
 *   Updated on: 30/09/2020
 *   Project Description: Create a program that swaps two numbers without using an intermediary variable.
 *******/

public class SwapTwoNums {
    public static void main (String ... args){
        int num1 = 5;
        int num2 = 6;
        System.out.println("Num1: " + num1 + "\nNum2: " + num2);
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("Num1: " + num1 + "\nNum2: " + num2);
    }//end main
}//end SwapTwoNums
