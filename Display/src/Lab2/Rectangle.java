package Lab2;

/*******
 *   ProfessionalSoftwareDevelopment:Lab2
 *   File: Rectangle
 *   Created by: Melissa Melaugh
 *   Created on: 25/09/2020
 *   Updated on: 30/09/2020
 *   Project Description: Create and hold a rectangle and calculate its area and perimeter
 *******/

public class Rectangle {
    private final int SIDES = 2;
    private double width;
    private double height;
    private double area;
    private double perimeter;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
        this.area = width * height;
        this.perimeter = this.SIDES * (width + height);
    }//end constructor

    public double getArea() {
        return area;
    }//end getArea

    public double getHeight() {
        return height;
    }//end getHeight

    public double getPerimeter() {
        return perimeter;
    }//end getPerimeter

    public double getWidth() {
        return width;
    }//end getWidth
}//end Rectangle
