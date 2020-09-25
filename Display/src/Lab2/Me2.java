/*
 *   ProfessionalSoftwareDevelopment:Lab2
 *   File: Me2
 *   Created by: Melissa Melaugh
 *   Created on: 25/09/2020
 *   Updated on: 25/09/2020
 *   Project Description: Print out personal identifiable information using variables
 */
package Lab2;

public class Me2 {
    public static void main(String[] args){
        String name = "Melissa Melaugh";
        String addressLine1 = "1 Cloudfoot Lane";
        String addressLine2 = "Rainbow, Co. Antrim BT1 IDC";
        String addressLine3 = "Ireland";
        String phoneNumber = "0123456789";
        String email = "solarlunix@fakeemail.com";
        int heightFeet = 5;
        double heightInches = 6.5;
        double weight = 1;
        String weightUnit = "Feather";

        System.out.println();
        System.out.print("Name: \t" + name);
        System.out.print("\t\t\t\t");
        System.out.println("Address: \t" + addressLine1);
        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t");
        System.out.println(addressLine2);
        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t");
        System.out.println(addressLine3);
        System.out.println();
        System.out.println("Phone: \t" + phoneNumber);
        System.out.println();
        System.out.println("eMail: \t" + email);
        System.out.println();
        System.out.print("Height: " + heightFeet + "'" +heightInches + "\"");
        System.out.print("\t\t\t\t\t\t");
        System.out.println("Weight: \t" + weight + " " + weightUnit);
    }
}
