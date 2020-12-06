package Tutorials;

/*******
 *   Part2:Tutorials
 *   File: Methods
 *   Created by: Melissa Melaugh
 *   Created on: 29/11/2020
 *   Updated on: 29/11/2020
 *   Project Description: This class is just going over methods.
 *******/
public class Methods {
    public static void main(String[] args) {
        String insturment = "Piano";
        System.out.println("Your current insturment: " + insturment);
        playBlueBird(insturment);
        insturment = changeInsturment(insturment); //This is my String (Piano) Can I have a string back please?
        System.out.println("Your current insturment: " + insturment);
        playBlueBird(insturment);
    }

    public static String changeInsturment(String currentInstrument){ //"can I have a string?"
        String newInstrument = "Guitar";
        System.out.println("Your old instrument was: " + currentInstrument);
        System.out.println("Your new instrument is: " + newInstrument);
        return newInstrument; //"Here you can have this back"
    }

    public static void playBlueBird(String instrument){ //Can I have an String to play?
        if(instrument.equals("Guitar")){
            System.out.println("AAAA AAAA AAAA DDDD AAAA AAAA AAAA EEEE");
        } else {
            System.out.println("I don't know how to play: " + instrument);
        }
    }

    public static void playBlueBird(String instrument, int timesToPlay){ //Can I have an String to play? and a number of times to play it!
        if(instrument.equals("Guitar")){
            for(int numberPlayed = 0; numberPlayed < timesToPlay; numberPlayed++) {
                System.out.println("AAAA AAAA AAAA DDDD AAAA AAAA AAAA EEEE");
            }
        } else {
            System.out.println("I don't know how to play: " + instrument);
        }
    }
}
