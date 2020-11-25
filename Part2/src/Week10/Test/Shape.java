package Week10.Test;

/*******
 *   Part2:Week10.Test
 *   File: Shape
 *   Created by: Melissa Melaugh
 *   Created on: 25/11/2020
 *   Updated on: 25/11/2020
 *   Project Description: Stores information on geometric shapes
 *******/
public abstract class Shape {
    //Create instance variables
    private String colour;
    private static int numberOfShapes = 0;

    @Override
    public String toString(){
        //Create the desired String for the object
        String out = String.format("Shape colour is %s in colour.", this.colour);

        return out; //return the string that was created
    }//end toString

    public String getColour() {
        return colour; //return the colour of the object
    }//end getColour

    public void setColour(String colour) {
        this.colour = colour; //return the colour of the object
    }//end getColour

    protected void increaseNumberOfShapes(){
        numberOfShapes++;
    }

    public static int getNumberOfShapes(){
        return numberOfShapes;
    }
}//end Shape
