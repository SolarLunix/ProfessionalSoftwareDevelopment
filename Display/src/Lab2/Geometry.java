/*
 *   ProfessionalSoftwareDevelopment:Lab2
 *   File: Geometry
 *   Created by: Melissa Melaugh
 *   Created on: 24/09/2020
 *   Updated on: 24/09/2020
 *   Project Description: Geometry connects the different geometric objects and displays the calculations for their information
 */
package Lab2;

import java.text.DecimalFormat;

public class Geometry {
    public static void main(String[] args){
        makeBox(5, 4, 3);
        newLine();
        makeBox(4, 4, 4);
        newLine();
        makeBox(10, 25, 30);
        newLine();
        makeRectangle(20, 20);
        newLine();
        makeRectangle(5.2, 4.3);
        newLine();
        makeRectangle(34.55, 23.67);
        newLine();
        makeCircle(4.5);
        newLine();
        makeCircle(5);
        newLine();
        makeCircle(5.5);
        newLine();
        makeCircle(8.25);
    }//end main

    private static void newLine(){
        System.out.println();
    }//end newLine

    private static void makeBox(double length, double width, double height){
        DecimalFormat df = new DecimalFormat("0.00");
        Box box = new Box(length, width, height);
        System.out.println("The box is " + box.getHeight() + "cm high, " + df.format(box.getWidth()) +
                "cm wide and " + df.format(box.getLength()) + "cm deep");
        System.out.println("The volume of the box is " + df.format(box.getArea()) + " cms cubed");
        System.out.println("The perimeter of the box is " + df.format(box.getPerimeter()) + " cms");
    }//end makeBox

    private static void makeRectangle(double length, double width){
        Rectangle rectangle = new Rectangle(length, width);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Rectangle length = " + df.format(rectangle.getHeight()));
        System.out.println("Rectangle breadth = " + df.format(rectangle.getWidth()));
        System.out.println("Rectangle Area = " + df.format(rectangle.getArea()));
        System.out.println("Rectangle Perimeter " + df.format(rectangle.getPerimeter()));
    }//end makeRectangle

    private static void makeCircle(double radius){
        Circle circle = new Circle(radius);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("The radius is " + df.format(circle.getRadius()) + " units");
        System.out.println("The diameter is " + df.format(circle.getDiameter()) + " units");
        System.out.println("The circumference is " + df.format(circle.getCircumference()) + " units");
        System.out.println("The area is " + df.format(circle.getArea()) + " units squared");
    }
}//end Geometry
