package Lab2;

/*******
 *   ProfessionalSoftwareDevelopment:Lab2
 *   File: Circle
 *   Created by: Melissa Melaugh
 *   Created on: 25/09/2020
 *   Updated on: 30/09/2020
 *   Project Description: An object that takes and holds the radius and calculates the diameter, circumference, and area
 *******/

public class Circle {
    private final int RADIUS_TO_DIAMETER = 2;
    private double radius;
    private double diameter;
    private double circumference;
    private double area;

    public Circle(double radius){
        this.radius = radius;
        this.diameter = this.RADIUS_TO_DIAMETER * radius;
        this.circumference = this.RADIUS_TO_DIAMETER * Math.PI * radius;
        this.area = Math.PI * Math.pow(radius, 2);
    }//end constructor

    public double getArea() {
        return area;
    }//end getArea

    public double getCircumference() {
        return circumference;
    }//end getCircumference

    public double getDiameter() {
        return diameter;
    }//end getDiameter

    public double getRadius() {
        return radius;
    }//end getRadius
}//end Circle
