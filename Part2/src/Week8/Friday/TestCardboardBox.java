package Week8.Friday;

import Week8.Wednesday.Car;

import java.util.Scanner;

/*******
 *   Part2:Week8.Friday
 *   File: TestCardboardBox
 *   Created by: Melissa Melaugh
 *   Created on: 13/11/2020
 *   Updated on: 13/11/2020
 *   Project Description: A place to test the creation of cardboard boxes.
 *******/
public class TestCardboardBox {
    private static Scanner in = new Scanner(System.in);

    private static int getNextInt(String reqest){
        int nextint = 0;
        System.out.println(reqest);
        nextint = in.nextInt();
        in.nextLine();
        return nextint;
    }

    private static String getNextString(String reqest){
        String nextString;
        System.out.println(reqest);
        nextString = in.nextLine();
        return nextString;
    }

    public static void main(String[] args) {
        CardboardBox myBox = new CardboardBox();
        CardboardBox yourBox = new CardboardBox(15, 5,25);
        CardboardBox aBox = new CardboardBox(20, 15, 10, "brown");
        CardboardBox companyBox = new CardboardBox(2, 3, 4);

        myBox.showAllDetails();
        yourBox.showAllDetails();
        aBox.showAllDetails();
        System.out.println(CardboardBox.noBoxes);

        //myBox.setColour(getNextString("What is the colour of your box?"));
        //myBox.setWidth(getNextInt("How wide is your box?"));
        //myBox.setHeight(getNextInt("How high is your box?"));
        //myBox.setDepth(getNextInt("How deep is your box?"));

        myBox.showAllDetails();
        myBox.printFrontArea();
        myBox.printSideArea();
        myBox.printTopArea();

        int sugarVol = 4000;
        companyBox.showAllDetails();
        System.out.println("To store " + sugarVol + " units cubed of sugar you will need " + companyBox.requiredBoxes(sugarVol) + " boxes.");

    }
}
