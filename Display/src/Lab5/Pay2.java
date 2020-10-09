package Lab5;

import java.math.BigDecimal;
import java.util.Scanner;

/*******
 *   ProfessionalSoftwareDevelopment:Lab5
 *   File: Pay2
 *   Created by: SolarLunix
 *   Created on: 07/10/2020
 *   Updated on: 07/10/2020
 *   Project Description: Calculates someone's pay based on their usual pay and overtime pay
 *******/
public class Pay2 {
    public static void main(String[] args) {
        final BigDecimal BASICPAY = new BigDecimal("5.95");
        final BigDecimal OVERTIMEPAY = new BigDecimal("8.50");
        final int OVERTIMEMIN = 40;
        double hoursWorked;
        double overtimeHours;
        double basicHours;
        BigDecimal basicpay;
        BigDecimal overtimepay;
        BigDecimal pay;
        String name;

        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to pay calculator, please enter your name:");
        name = in.nextLine();

        System.out.println("How many hours have you worked:");
        hoursWorked = in.nextDouble();
        in.nextLine();

        if(hoursWorked > OVERTIMEMIN){
            basicHours = OVERTIMEMIN;
            overtimeHours = hoursWorked - OVERTIMEMIN;
        } else {
            overtimeHours = 0;
            basicHours = hoursWorked;
        }

        basicpay = BASICPAY.multiply(BigDecimal.valueOf(basicHours));
        overtimepay = OVERTIMEPAY.multiply(BigDecimal.valueOf(overtimeHours));
        pay = basicpay.add(overtimepay);

        System.out.println(name + " your pay for this week is: £" + pay.setScale(2, BigDecimal.ROUND_HALF_UP));
    }
}//end Pay2
