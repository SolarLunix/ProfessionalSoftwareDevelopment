package Boil;

import java.util.Scanner;

/*******
 *   ProfessionalSoftwareDevelopment:Boil
 *   File: BoilerPlateCode
 *   Created by: Melissa Melaugh
 *   Created on: 21/10/2020
 *   Updated on: 21/10/2020
 *   Project Description: This is boilerplate code for things that I need done quickly.
 *******/
public class BoilerPlateCode {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        
    }

    private static int getNextInt(String reqest){
        int nextint = 0;
        System.out.println(reqest);
        nextint = in.nextInt();
        in.nextLine();
        return nextint;
    }

    private static double getNextDouble(String reqest){
        double nextdouble = 0;
        System.out.println(reqest);
        nextdouble = in.nextDouble();
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
