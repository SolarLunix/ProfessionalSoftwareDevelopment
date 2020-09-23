/*
 *    Week1
 *    Created by: Melissa Melaugh
 *    Created on: 23/09/2020
 *    Updated on: 23/09/2020
 *    Project Description: This project is just to show how print and print ln work. I have added each one into its own
 *          method in order to maintain readibility and keep from creating a number of different classes.
 */
package Week1;

public class DisplayLesson
{
    public static void main(String... args)
    {
        printE1();
        System.out.println();
        printE2();
        System.out.println();
        printE3();
        System.out.println();
        countDown();
        System.out.println();
        showInfo();
    }

    private static void printE1()
    {
        //a series of asterisks print statements to print out a letter E
        System.out.println("*****");
        System.out.println("*");
        System.out.println("*");
        System.out.println("****");
        System.out.println("*");
        System.out.println("*");
        System.out.println("*****");
    }

    private static void printE2()
    {
        //a series of asterisks print statements to print out a letter E
        System.out.print("*****\n");
        System.out.print("*\n");
        System.out.print("*\n");
        System.out.print("****\n");
        System.out.print("*\n");
        System.out.print("*\n");
        System.out.print("*****\n");
    }

    private static void printE3()
    {
        //a series of asterisks print statements to print out 2 letter Es
        System.out.print("*****\t*****\n");
        System.out.println("*\t\t*");
        System.out.print("*\t\t*\n");
        System.out.print("*****\t*****\n");
        System.out.print("*\t\t*\n");
        System.out.print("*\t\t*\n");
        System.out.print("*****\t*****\n");
    }

    private static void countDown()
    {
        //This is the count down program for a rocket take off!
        System.out.print("Three... ");
        System.out.print("Two... ");
        System.out.print("One... ");
        System.out.print("Zero... ");
        System.out.println("Liftoff!");
        System.out.println("Houston, we have a problem.");
    }

    private static void showInfo()
    {
        //This is the programming challenge from the end of chapter 2 where we want to display information
        System.out.println("Name \t\t\tAge \tAddress");
        System.out.println("Johnny Genius \t1+ \t\tRoom MS101");
        System.out.println("\t\t\t\t\t\tUniversity of Ulster");
        System.out.println("\t\t\t\t\t\tMagee");
        System.out.println("\nProgramming in Java is a piece of cake......");
    }
}
