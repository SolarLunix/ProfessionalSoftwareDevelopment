package TestWeek4;

import java.util.ArrayList;
import java.util.Scanner;

/*******
 *   ProfessionalSoftwareDevelopment:TestWeek4
 *   File: RaceZones
 *   Created by: SolarLunix
 *   Created on: 16/10/2020
 *   Updated on: 16/10/2020
 *   Project Description: Prepare for a race
 *******/
public class RaceZones
{
    private static final char ZONEA = 'A';
    private static final char ZONEB = 'B';
    private static final int numRacers = 3; //this can be changed from a final and updated by the usr instead

    private static String race;

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Welcome to RaceZones!");
        System.out.println("What is the name of your race?");
        race = keyboard.nextLine();

        ArrayList<String> racerList = new ArrayList<String>();
        for (int participantNumber = 1; participantNumber <= numRacers; participantNumber++)
            racerList.add(createRacer());


        System.out.println();
        System.out.println(race);
        for(String participant : racerList)
        {
            System.out.println(participant);
            System.out.println(".....");
        }
    }

    private static char getCategory(int age, double bestTime, boolean female)
    {
        final int THIRTY = 30;
        final int THIRTYNINE = 39;
        final int FOURTY = 40;
        final int FOURTYNINE = 49;
        final int FIFTY = 50;
        final int YOUNG_BESTTIME_FEMALE = 2800;
        final int YOUNG_BESTTIME_MALE = 2700;
        final int MID_BESTTIME_FEMALE = 3330;
        final int MID_BESTTIME_MALE = 2950;
        final int OLD_BESTTIME_FEMALE = 3502;
        final int OLD_BESTTIME_MALE = 3250;

        if ((age >= THIRTY) && (age <= THIRTYNINE))
        {
            if(female)
            {
                if (bestTime <= YOUNG_BESTTIME_FEMALE)
                    return ZONEA;
                else
                    return ZONEB;
            }
            else
            {
                if (bestTime <= YOUNG_BESTTIME_MALE)
                    return ZONEA;
                else
                    return ZONEB;
            }
        }
        else if ((age >= FOURTY) && (age <= FOURTYNINE))
             {
                 if(female)
                 {
                     if (bestTime <= MID_BESTTIME_FEMALE)
                         return ZONEA;
                     else
                         return ZONEB;
                 }
                 else
                 {
                     if (bestTime <= MID_BESTTIME_MALE)
                         return ZONEA;
                     else
                         return ZONEB;
                 }
             }
        else if ((age >= FIFTY))
             {
                 if(female)
                 {
                     if (bestTime <= OLD_BESTTIME_FEMALE)
                         return ZONEA;
                     else
                         return ZONEB;
                 }
                 else
                 {
                     if (bestTime <= OLD_BESTTIME_MALE)
                         return ZONEA;
                     else
                         return ZONEB;
                 }
             }
        return 'C';
    }

    private static String createRacer()
    {
        String firstName, lastName, gender;
        boolean female = false;
        char genderHold;
        int age;
        int bestTime;
        char startZone;
        String details = "Racer Details: ";

        System.out.println("What is the racer's first name?");
        firstName = keyboard.next();
        keyboard.nextLine();

        System.out.println("What is the racer's last name?");
        lastName = keyboard.next();
        keyboard.nextLine();

        System.out.println("How old is the racer?");
        age = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("What is the racer's gender? M/F");
        genderHold = keyboard.nextLine().charAt(0);
        if(genderHold == 'M' || genderHold == 'm')
        {
            gender = "male";
        }
        else
        {
            gender = "female";
            female = true;
        }

        System.out.println("What is the racer's personal best time in seconds?");
        bestTime = keyboard.nextInt();
        keyboard.nextLine();

        startZone = getCategory(age, bestTime, female);

        details += "\nName: " + firstName + " " + lastName;
        details += "\nAge: " + age;
        details += "\nGender: " + gender;
        details += "\nBest Personal Time: " + bestTime + " secs";
        details += "\nDesignated start zone for this race: Zone " + startZone;
        return details;
    }
}
