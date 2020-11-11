package Lab4;

import java.util.Scanner;

/*******
 *   ProfessionalSoftwareDevelopment:Lab4
 *   File: FizzBuzz1
 *   Created by: Melissa Melaugh
 *   Created on: 06/10/2020
 *   Updated on: 06/10/2020
 *   Project Description: A game of FizzBuzz
 *******/
public class FizzBuzz1 {
    public static void main(String[] args) {
        final int FIZZ = 3;
        final int BUZZ = 7;
        Scanner scan = new Scanner(System.in);
        int input;

        System.out.println("Please input a number and hit enter:");
        input = scan.nextInt();

        if ((input%FIZZ == 0) || (input%BUZZ == 0)){
            if ((input%FIZZ == 0) && (input%BUZZ == 0)){
                System.out.println("FIZZ BUZZ");
            }else if(input%FIZZ == 0) {
                System.out.println("FIZZ");
            }else{
                System.out.println("BUZZ");
            }//end if/else
        } else {
            System.out.println(input);
        }//end if/else
    }//end main
}//end FizzBuzz1
