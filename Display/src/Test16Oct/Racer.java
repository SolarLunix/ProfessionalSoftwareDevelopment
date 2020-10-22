package Test16Oct;

import java.rmi.activation.ActivationGroup;

/*******
 *   ProfessionalSoftwareDevelopment:Test16Oct
 *   File: Racer
 *   Created by: SolarLunix
 *   Created on: 16/10/2020
 *   Updated on: 16/10/2020
 *   Project Description: To store information about a racer.
 *******/
public class Racer
{
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private double bestTime;
    private char startZone;

    public void Racer(String firstName, String lastName, int age, String gender, double bestTime, char startZone)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.bestTime = bestTime;
        this.startZone = startZone;
    }

    public void listRacer()
    {
        String fullname = this.firstName + " " + this.lastName;
        System.out.println("Runner's Details:");
        System.out.println("Name: " + fullname);
        System.out.println("Age: " + this.age);
        System.out.println("Gender: " + this.gender);
        System.out.println("Best Personal Time: " + this.bestTime + " secs");
        System.out.println("Designated start zone for this race: Zone " + startZone);
    }
}
