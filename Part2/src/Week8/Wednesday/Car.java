package Week8.Wednesday;

import java.text.DecimalFormat;
import java.util.Calendar;

/*******
 *   Part2:Week8
 *   File: Car
 *   Created by: Melissa Melaugh
 *   Created on: 11/11/2020
 *   Updated on: 11/11/2020
 *   Project Description: To store information about a Car
 *******/
public class Car {
    private static int noOfCars = 0;
    private int id;
    private String make;
    private String ownerName;
    private String colour;
    private int yearOfManufacture;
    private int topSpeed;
    private double costPrice;

    Car(int id, String make, String ownerName, String colour, int yearOfManufacture, int topSpeed, double costPrice){
        noOfCars++;
        this.id = id;
        this.make = make;
        this.ownerName = ownerName;
        this.colour = colour;
        this.yearOfManufacture = yearOfManufacture;
        this.topSpeed = topSpeed;
        this.costPrice = costPrice;
    }

    Car(int id, String make, String ownerName, String colour){
        noOfCars++;
        this.id = id;
        this.make = make;
        this.ownerName = ownerName;
        this.colour = colour;
    }

    Car(int id, String make, int topSpeed){
        noOfCars++;
        this.id = id;
        this.make = make;
        this.topSpeed = topSpeed;
    }

    Car(){
        noOfCars++;
    }

    public void printCarInfo(){
        DecimalFormat df = new DecimalFormat("0,000.00");
        System.out.println("***********************************");
        System.out.println("ID - " + this.id);
        System.out.println("Make - " + this.make);
        System.out.println("Owner - " + this.ownerName);
        System.out.println("Colour - " + this.colour);
        System.out.println("Year - " + this.yearOfManufacture);
        System.out.println("Speed - " + this.topSpeed);
        System.out.println("Cost - £" + df.format(this.costPrice));
        System.out.println("***********************************");
    }

    public int ageOfCar(){
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int age = -1;

        if(this.yearOfManufacture > 1900){
            age = year - this.yearOfManufacture;
        }

        return age;
    }

    public double currentValue(int depricationRate){
        if (this.yearOfManufacture == 0 || this.costPrice == 0){
            return -1;
        }
        double currentValue = this.costPrice - (this.costPrice * (depricationRate/100) * this.ageOfCar());
        return currentValue;
    }

    public void setID(int itsID) {
        this.id = itsID;
    }

    public void setMake(String itsMake) {
        this.make = itsMake;
    }

    public void setOwner(String whoOwns) {
        this.ownerName = whoOwns;
    }

    public void setColour(String itsColour) {
        this.colour = itsColour;
    }

    public void setYear(int whenBuild) {
        this.yearOfManufacture = whenBuild;
    }

    public void setSpeed(int maxSpeed) {
        this.topSpeed = maxSpeed;
    }

    public void setCost(double price) {
        this.costPrice = price;
    }

    public int getID() {
        return id;
    }

    public String getMake() {
        return make;
    }

    public String getOwner() {
        return ownerName;
    }

    public String getColour() {
        return colour;
    }

    public int getYear() {
        return yearOfManufacture;
    }

    public int getSpeed() {
        return topSpeed;
    }

    public double getCost() {
        return costPrice;
    }

    public int getNoOfCars(){
        return noOfCars;
    }
}
