package Week10.Test;

/*******
 *   Part2:Week10.Test
 *   File: Rectangle
 *   Created by: Melissa Melaugh
 *   Created on: 25/11/2020
 *   Updated on: 25/11/2020
 *   Project Description: Stores information on rectangles
 *******/
public class Rectangle extends Shape {
    //create static variables
    static private int numberOfRectangles = 0;

    //create instance variables
    private int length;
    private int width;

    public Rectangle(){
        //Create defaults for the Rectangle and pass them to the complex constructor
        this("yellow", 1, 1);
    }//end default constructor

    public Rectangle(String colour, int length, int width){
        super(colour);  // Intialise the colour to default colour

        //Initialise length and width with given values
        this.length = length;
        this.width = width;

        numberOfRectangles++;  //adjust number of rectangles
    }//end complex instructor

    private int area(){
        return length * width; //calculate and return the area
    }//end area

    @Override
    public String toString() {
        //Create the desired String for the object
        String out = String.format("Shape colour is %s in colour. \n", super.getColour());
        out += String.format("The length is %d units.\n", this.length); //(Removed as it wasn't asked for)
        out += String.format("The width is %d units.\n", this.width); //(Removed as it wasn't asked for)
        out += String.format("The area is %d units squared.", area());

        return out; //return the string that was created
    }//end toString

    static public int numberOfRectangles(){
        return numberOfRectangles; //return the numberOfRectangles
    }//end numberOfRectangles
}//end Rectangle
