package Week12.Test;

import java.util.Arrays;

/**
 * A demonstration of lists
 * Created by: Melissa Melaugh
 * Created on: 11/12/2020
 * Updated on: 11/12/2020
 * Part2:Week12.Test:Assessment2
 */
public class Assessment2 {
    private static void method1(){
        int[] list = {34, 56, 23, 35, 78, 44, 60, 20, 31, 61};
        Arrays.sort(list); //sort the list from smallest to largest
        int smallest = list[0];
        int secondSmallest = list[1];
        System.out.println(String.format("The two smallest numbers are %d and %d", smallest, secondSmallest));
    }//end method1

    private static void method2(){
        int[] list = {34, 67, 23, 45, 69, 30};
        int[] newList = new int[list.length];
        System.out.print("\nThe list is ");
        for(int index = 0; index < list.length; index++){
            System.out.print(list[index] + " ");
            if(index == 0){
                newList[(list.length-1)] = list[index];
            } else {
                newList[(index-1)] = list[index];
            }//end if/else
        }//end for

        System.out.print("\nThe new list is ");
        for(int number : newList){
            System.out.print(number + " ");
        }//end for
    }// end method2

    public static void main(String[] args) {
        method1();
        method2();
    }//end main
}//end Assessment2
