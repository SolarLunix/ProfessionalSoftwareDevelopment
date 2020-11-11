package TestWeek2;

import java.util.Scanner;

/*******
 *   ProfessionalSoftwareDevelopment:TestWeek2
 *   File: Electricity
 *   Created by: Melissa Melaugh
 *   Created on: 02/10/2020
 *   Updated on: 02/10/2020
 *   Project Description: This application is designed to read in key customer details and then calculate
 *   and print out the electric costs for a customer for one quarter.
 *******/
public class Electricity {
    public static void main(String[] args) {
        ElectricCustomer customer = createCustomerFromPrompt();
        customer.displayCustomerInformation();
    }//end main

    private static ElectricCustomer createCustomerFromPrompt(){
        Scanner input = new Scanner(System.in);
        String firstName, lastName, supplier;
        int accountNumber, units;

        //Greet User
        System.out.println("Welcome to Electricity, we are happy to calculate your bill for you!");

        //Get their first name and clear input field
        System.out.print("Please enter your first name: ");
        firstName = input.next();
        input.nextLine();

        //Get their last name and clear input field
        System.out.print("Please enter your last name: ");
        lastName = input.next();
        input.nextLine();

        //Get their Supplier
        System.out.print("Please enter your electricity supplier: ");
        supplier = input.nextLine();

        //Get their account number and clear input field
        System.out.print("Please enter your account number: ");
        accountNumber = input.nextInt();
        input.nextLine();

        //Get the number of units they used and clear input field
        System.out.print("Please enter the number of units you've used: ");
        units = input.nextInt();
        input.nextLine();

        ElectricCustomer customer = new ElectricCustomer(firstName, lastName, supplier, accountNumber, units);

        System.out.println("Thank you for using Electric.\n");

        return customer;
    }//end createCustomer

    private static ElectricCustomer testCustomer(){
        //Used to test formatting
        ElectricCustomer customer = new ElectricCustomer("Jane", "Peoples", "Electric Ireland", 2002001, 102);
        return customer;
    }//end testCustomer
}//end Electricity
