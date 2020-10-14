package Lab5;

import java.text.DecimalFormat;
import java.util.Scanner;

/*******
 *   ProfessionalSoftwareDevelopment:Lab5
 *   File: Tax3
 *   Created by: SolarLunix
 *   Created on: 07/10/2020
 *   Updated on: 07/10/2020
 *   Project Description: Create a tax-mock up to the specifications laid out in the lab.
 *******/
public class Tax3 {
    public static void main(String[] args) {
        final int HIGHTAX = 40000;
        final double HIGHRATE = 0.40;
        final int LOWTAX = 10000;
        final double LOWRATE = 0.20;
        double grosspay;
        double netpay;
        double tax;

        DecimalFormat df = new DecimalFormat("0.00");
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your gross pay and hit enter: £");
        grosspay = input.nextDouble();

        if (grosspay >= HIGHTAX){
            tax = (grosspay - HIGHTAX) * HIGHRATE;
            tax += ((HIGHTAX - LOWTAX) * LOWRATE);
        } else if (grosspay >= LOWTAX){
            tax = (grosspay - LOWTAX) * LOWRATE;
        } else {
            tax = 0;
        }

        netpay = grosspay - tax;

        System.out.println();
        System.out.println("You have earned £" + df.format(grosspay));
        System.out.println("You owe £" + df.format(tax) + " in taxes");
        System.out.println("Your net pay is £" + df.format(netpay));
    }
}
