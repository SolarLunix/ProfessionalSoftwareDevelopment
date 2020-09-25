/*
 *   ProfessionalSoftwareDevelopment:Lab2
 *   File: Box
 *   Created by: Melissa Melaugh
 *   Created on: 24/09/2020
 *   Updated on: 24/09/2020
 *   Project Description: Creates a Box object and calculates its area and perimeter
 */
package Lab2;

public class Box {
    private double length;
    private double width;
    private double height;
    private double area;
    private double perimeter; //sometimes called perimeter

    public Box(double length, double width, double height){
        this.length = length;
        this.width = width;
        this.height = height;
        this.area = length * width * height;
        this.perimeter = (4 * length) + (4 * width) + (4 * height);
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
