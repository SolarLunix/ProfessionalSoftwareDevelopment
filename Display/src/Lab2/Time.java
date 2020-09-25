/*
 *   ProfessionalSoftwareDevelopment:Lab2
 *   File: Time
 *   Created by: Melissa Melaugh
 *   Created on: 25/09/2020
 *   Updated on: 25/09/2020
 *   Project Description: Takes in seconds and converts it to minutes and seconds
 */
package Lab2;

public class Time {
    static public void main(String[] args){
        convert(5000);
    }//end main

    static private void convert(int seconds){
        final int SEC_IN_MIN = 60;
        int min = seconds / SEC_IN_MIN;
        int sec = seconds % SEC_IN_MIN;
        System.out.println(seconds + " seconds is " + min + " minutes and " + sec + "seconds");
    }//end convert
}//end Time
