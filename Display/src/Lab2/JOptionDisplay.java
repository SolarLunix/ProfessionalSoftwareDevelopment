/*
 *   ProfessionalSoftwareDevelopment:Lab2
 *   File: JOptionDisplay
 *   Created by: Melissa Melaugh
 *   Created on: 25/09/2020
 *   Updated on: 25/09/2020
 *   Project Description: A test for the JOptionPane display.
 */
package Lab2;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class JOptionDisplay {
    static public void main (String[] args){
        makeRectangle(3, 4);
        changeSeconds(5000);
    }//end main

    private static void makeRectangle(double length, double width){
        Rectangle rectangle = new Rectangle(length, width);
        DecimalFormat df = new DecimalFormat("0.00");
        String output = "Rectangle length = " + df.format(rectangle.getHeight()) +
                "\nRectangle breadth = " + df.format(rectangle.getWidth()) +
                "\n\nRectangle Area = " + df.format(rectangle.getArea()) +
                "\nRectangle Perimeter = " + df.format(rectangle.getPerimeter());
        JOptionPane.showMessageDialog(null, output, "Rectangle", JOptionPane.INFORMATION_MESSAGE);
    }//end makeRectangle

    private static void changeSeconds(int seconds){
        final int SEC_IN_MIN = 60;
        int min = seconds / SEC_IN_MIN;
        int sec = seconds % SEC_IN_MIN;
        String output = seconds + " seconds is " + min + " minutes and " + sec + "seconds";
        JOptionPane.showMessageDialog(null, output, "Time", JOptionPane.INFORMATION_MESSAGE);
    }//end changeSeconds
}//end JOptionDisplay
