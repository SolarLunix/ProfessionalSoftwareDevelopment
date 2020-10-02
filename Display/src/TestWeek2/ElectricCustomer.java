package TestWeek2;

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
    private final BigDecimal UNIT_COST = new BigDecimal("0.22");
    private final BigDecimal DISCOUNT = new BigDecimal(".1"); //.1 == 10%
    private String firstName, lastName;
    private String supplier;
    private int accountNumber, units;
    private BigDecimal cost;
    private BigDecimal discount;
    private BigDecimal totalCost;

    public ElectricCustomer(String firstName, String lastName, String supplier, int accountNumber, int units){
        //initialise everything
        this.firstName = firstName;
        this.lastName = lastName;
        this.supplier = supplier;
        this.accountNumber = accountNumber;
        this.units = units;

        //calculate cost, discount, and finalcost
        this.cost = BigDecimal.valueOf(this.units).multiply(UNIT_COST);
        this.discount = this.cost.multiply(DISCOUNT);
        this.totalCost = this.cost.subtract(this.discount);
    }//end constructor ElectricCustomer

    public void displayCustomerInformation(){
        String fullName = firstName + " " + lastName;
        System.out.println(this.supplier);
        System.out.println("Bill for: " + fullName);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Total units of electric for this quarter: " + this.units);
        System.out.println("\tTotal Cost: £" + this.cost.setScale(2, BigDecimal.ROUND_HALF_UP));
        System.out.println("\tDiscount Ammount: £" + this.discount.setScale(2, BigDecimal.ROUND_HALF_UP));
        System.out.println("Final cost for electric this quarter:\t£" + this.totalCost.setScale(2, BigDecimal.ROUND_HALF_UP));
    }//end displayCustomerInformation

    public BigDecimal getUNIT_COST() {
        return UNIT_COST;
    }//end getUNIT_COST

    public BigDecimal getDISCOUNT() {
        return DISCOUNT;
    }//end getDISCOUNT

    public String getFirstName() {
        return firstName;
    }//end getFirstName

    public String getLastName() {
        return lastName;
    }//end getLastName

    public String getSupplier() {
        return supplier;
    }//end getSupplier

    public int getAccountNumber() {
        return accountNumber;
    }//end getAccountNumber

    public int getUnits() {
        return units;
    }//end getUnits

    public BigDecimal getCost() {
        return cost;
    }//end getCost

    public BigDecimal getDiscount() {
        return discount;
    }//end getDiscount

    public BigDecimal getTotalCost() {
        return totalCost;
    }//end getTotalCost

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }//end setFirstName

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }//end setLastName

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }//end setSupplier

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }//end setAccountNumber

    public void setUnits(int units) {
        this.units = units;
    }//end setUnits

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }//end setCost

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }//end setDiscount

    public void setTotalCost(BigDecimal totalCost) {
        this.totalCost = totalCost;
    }//end setTotalCost
}//end ElectricCustomer
