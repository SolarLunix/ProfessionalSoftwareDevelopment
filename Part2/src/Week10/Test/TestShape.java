package Week10.Test;

/*******
 *   Part2:Week10.Test
 *   File: TestShape
 *   Created by: Melissa Melaugh
 *   Created on: 25/11/2020
 *   Updated on: 25/11/2020
 *   Project Description: Tests the shapes
 *******/
public class TestShape {
    public static void main(String[] args) {
        //Create Two Rectangles and One Shape object
        Rectangle myRectangle = new Rectangle();
        Rectangle myRectangle2 = new Rectangle("blue", 6, 4);
        Shape myShape = new Shape();

        //Print out the details of the shapes using toString()
        System.out.println(); //extra space for visibility
        System.out.println(myRectangle.toString());
        System.out.println(); //extra space for visibility
        System.out.println(myRectangle2.toString());
        System.out.println(); //extra space for visibility
        System.out.println(myShape.toString());
        System.out.println(); //extra space for visibility

        //Print out the number of rectangles created using numberOfRectangles() method
        System.out.printf("There have been %d rectangles created.\n", Rectangle.numberOfRectangles());
    }//end main
}//end TestShape
