package Week10.Test;

/*******
 *   Part2:Week10.Test
 *   File: Shape
 *   Created by: Melissa Melaugh
 *   Created on: 25/11/2020
 *   Updated on: 25/11/2020
 *   Project Description: Stores information on geometric shapes
 *******/
public class Shape {
    //Create instance variables
    private String colour;

    public Shape(){
        //Create defaults (yellow colour) for the Shape and pass them to the complex constructor
        this("yellow");
    }//end default constructor

    public Shape(String colour){
        //Initialise the colour with the given value
        this.colour = colour;
    }//end complex constructor

    @Override
    public String toString(){
        //Create the desired String for the object
        String out = String.format("Shape colour is %s in colour.", this.colour);

        return out; //return the string that was created
    }//end toString

    public String getColour() {
        return colour; //return the colour of the object
    }//end getColour
}//end Shape
