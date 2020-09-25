/*
 *   ProfessionalSoftwareDevelopment:Lab2
 *   File: //TODO
 *   Created by: Melissa Melaugh
 *   Created on: 24/09/2020
 *   Updated on: 24/09/2020
 *   Project Description: //TODO
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
    }

    private static void makeRectangle(double length, double width){
        Rectangle rectangle = new Rectangle(length, width);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Rectangle length = " + df.format(rectangle.getHeight()));
        System.out.println("Rectangle breadth = " + df.format(rectangle.getWidth()));
        System.out.println("Rectangle Area = " + df.format(rectangle.getArea()));
        System.out.println("Rectangle Perimeter " + df.format(rectangle.getPerimeter()));
    }
}//end Geometry
