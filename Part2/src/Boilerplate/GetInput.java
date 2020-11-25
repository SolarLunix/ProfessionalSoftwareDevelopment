package Boilerplate;

import java.util.Scanner;

/*******
 *   ProfessionalSoftwareDevelopment:Boil
 *   File: GetInput
 *   Created by: Melissa Melaugh
 *   Created on: 21/10/2020
 *   Updated on: 25/11/2020
 *   Project Description: This is boilerplate code for things that I need done quickly.
 *******/
public class GetInput {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        
    }

    private static int getNextInt(String reqest){
        int nextint = 0;
        System.out.println(reqest);
        if(in.hasNextInt()) {
            nextint = in.nextInt();
        }
        in.nextLine();
        return nextint;
    }

    private static double getNextDouble(String reqest){
        double nextdouble = 0;
        System.out.println(reqest);
        if(in.hasNextDouble()) {
            nextdouble = in.nextDouble();
        }
        in.nextLine();
        return nextdouble;
    }

    private static String getNextString(String reqest){
        String nextString;
        System.out.println(reqest);
        nextString = in.nextLine();
        return nextString;
    }
}
