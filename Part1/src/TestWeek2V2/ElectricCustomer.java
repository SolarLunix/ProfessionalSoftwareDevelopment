package TestWeek2V2;

import java.math.BigDecimal;

/*******
 *   ProfessionalSoftwareDevelopment:TestWeek2
 *   File: ElectricCustomer
 *   Created by: Melissa Melaugh
 *   Created on: 02/10/2020
 *   Updated on: 02/10/2020
 *   Project Description: This is the ElectricCustomer object used to store information for the Electricity.java
 *******/

public class ElectricCustomer {
    private String firstName;
    private String lastName;
    private String supplier;
    private int accountNumber;
    private int units;
    private BigDecimal cost;
    private BigDecimal discount;
    private BigDecimal totalCost;

    public ElectricCustomer(String firstName, String lastName, String supplier, int accountNumber, int units){
        final BigDecimal UNIT_COST = new BigDecimal("0.22");
        final BigDecimal DISCOUNT = new BigDecimal(".1"); //.1 == 10%

        //initialise everything else
        this.firstName = firstName;
        this.lastName = lastName;
        this.supplier = supplier;
        this.accountNumber = accountNumber;
        this.units = units;

        //calculate cost, discount, and finalcost
        this.cost = BigDecimal.valueOf(this.units).multiply(UNIT_COST);
        this.discount = this.cost.multiply(DISCOUNT);
        this.totalCost = this.cost.subtract(this.discount);
    }

    public void displayCustomerInformation(){
        //Create the full name
        String fullName = firstName + " " + lastName;

        //Display the information
        System.out.println(this.supplier);
        System.out.println("Bill for: " + fullName);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Total units of electric for this quarter: " + this.units);
        System.out.println("\tTotal Cost: £" + this.cost.setScale(2, BigDecimal.ROUND_HALF_UP));
        System.out.println("\tDiscount Amount: £" + this.discount.setScale(2, BigDecimal.ROUND_HALF_UP));
        System.out.println("Final cost for electric this quarter:\t£" + this.totalCost.setScale(2, BigDecimal.ROUND_HALF_UP));
    }
}
