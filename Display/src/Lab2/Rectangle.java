/*
 *   ProfessionalSoftwareDevelopment:Lab2
 *   File: //TODO
 *   Created by: Melissa Melaugh
 *   Created on: 25/09/2020
 *   Updated on: 25/09/2020
 *   Project Description: //TODO
 */
package Lab2;

public class Rectangle {
    private double width;
    private double height;
    private double area;
    private double perimeter;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
        this.area = width * height;
        this.perimeter = (2 * width) + (2 * height);
    }

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
