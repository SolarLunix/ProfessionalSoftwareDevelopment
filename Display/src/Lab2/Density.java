/*
 *   ProfessionalSoftwareDevelopment:Lab2
 *   File: Density
 *   Created by: Melissa Melaugh
 *   Created on: 25/09/2020
 *   Updated on: 25/09/2020
 *   Project Description: Takes the mass and volume and calculates the density, storing all values.
 */
package Lab2;

public class Density {
    private double mass;
    private double volume;
    private double density;

    public Density(double mass, double volume){
        this.mass = mass;
        this.volume = volume;
        this.density = mass / volume;
    }//end constructor

    public double getDensity() {
        return density;
    }//end getDensity

    public double getMass() {
        return mass;
    }//end getMass

    public double getVolume() {
        return volume;
    }//end getVolume
}
