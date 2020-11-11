package Week8;

import java.text.DecimalFormat;
import java.util.Scanner;

/*******
 *   Part2:Week8
 *   File: MethodOverloading
 *   Created by: Melissa Melaugh
 *   Created on: 11/11/2020
 *   Updated on: 11/11/2020
 *   Project Description: Just a way of showing method overloading
 *******/
public class MethodOverloading {
    //Method to calculate the area of an equilateral triangle
    public static double calculateArea(int pside) {
        //Calculate and return area of equilateral triangle
        double halfside = 3 * pside;
        double area = Math.sqrt(halfside * 3*(halfside - pside));
        return area;
    }//calculateArea

    // Method to calculate the area of an isosceles triangle
    public static double calculateArea(int pside1, int pside2) {
        //Calculate and return area of isosceles triangle
        double halfside = (2 * pside1) + pside2;
        double area = Math.sqrt(halfside * (2*(halfside - pside1)) * (halfside - pside2));
        return area;
    }//calculateArea

    // Method to calculate the area of a scalene triangle
    public static double calculateArea(int pside1, int pside2, int pside3) {
        //Calculate and return area of scalene triangle
        double halfside = pside1 + pside2 + pside3;
        double area = Math.sqrt(halfside * (halfside - pside1) * (halfside - pside2) * (halfside - pside3));
        return area;
    }//calculateArea

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        int equilateralside;

        System.out.println("Equilateral Triangle");
        System.out.println("********************");
        System.out.print("Enter the length of the side of the equilateral triangle: ");
        equilateralside = keyboard.nextInt();
        System.out.println("The area of the triangle is " + df.format(calculateArea(equilateralside)) + " units squared\n ");
    }
}
