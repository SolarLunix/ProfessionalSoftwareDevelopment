package Week12.Test;

import java.util.Scanner;

/**
 * Takes in names and prints them both in order and then in reverse order
 * Created by: Melissa Melaugh
 * Created on: 11/12/2020
 * Updated on: 11/12/2020
 * Part2:Week12.Test:ReverseName
 */
public class ReverseName {
    private static Scanner in = new Scanner(System.in);

    private static String getNextString(String reqest){
        String nextString;
        System.out.println(reqest);
        nextString = in.nextLine();
        return nextString;
    }//end getNextString

    public static void main(String[] args) {
        final int MAX_NAMES = 5;

        //Read the names in
        String[] names = new String[MAX_NAMES];
        for(int name = 0; name < MAX_NAMES; name++){
            names[name] = getNextString("Please input a name: ");
        }//end for

        //Print the names out in order
        System.out.println("Names entered are:");
        for(String name: names){
            System.out.print(String.format("    %s", name));
        }//end for

        //Print the names out in reverse
        System.out.println("");
        System.out.println("Names entered in reverse are:");
        for(int name = MAX_NAMES-1; name >= 0; name--){
            System.out.print(String.format("    %s", names[name]));
        }//end for
    }//end main
}//end Reverse Name
