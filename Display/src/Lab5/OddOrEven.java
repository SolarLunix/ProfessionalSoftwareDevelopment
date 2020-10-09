package Lab5;

import java.util.Scanner;

/*******
 *   ProfessionalSoftwareDevelopment:Lab5
 *   File: OddOrEven
 *   Created by: SolarLunix
 *   Created on: 07/10/2020
 *   Updated on: 07/10/2020
 *   Project Description: Test a number to see if it is odd or even
 *******/
public class OddOrEven {
    public static void main(String[] args) {
        int userNumber;
        Scanner in = new Scanner(System.in);

        System.out.println("Please provide an number and then hit enter:");
        userNumber = in.nextInt();
        in.nextLine();

        if(userNumber%2 == 0){
            System.out.println("Your number is even!");
        }else{
            System.out.println("Your number is odd!");
        }
    }
}
