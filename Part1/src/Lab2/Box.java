package Lab2;

/*******
 *   ProfessionalSoftwareDevelopment:Lab2
 *   File: Box
 *   Created by: Melissa Melaugh
 *   Created on: 24/09/2020
 *   Updated on: 30/09/2020
 *   Project Description: Creates a Box object and calculates its area and perimeter
 *******/

public class Box {
    private final int SIDES = 4;
    private double length;
    private double width;
    private double height;
    private double area;
    private double perimeter;

    public Box(double length, double width, double height){
        this.length = length;
        this.width = width;
        this.height = height;
        this.area = length * width * height;
        this.perimeter = this.SIDES * (length + width + height);
    }//end constructor

    public double getArea() {
        return area;
    }//end getArea

    public double getPerimeter() {
        return perimeter;
    }//end getSurfaceArea

    public double getHeight() {
        return height;
    }//end getHeight

    public double getLength() {
        return length;
    }//end getLength

    public double getWidth() {
        return width;
    }//end getWidth
}
