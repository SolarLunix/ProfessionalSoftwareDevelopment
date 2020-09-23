/*
*    SwingTest
*    Created by: Melissa Melaugh
*    Created on: 23/09/2020
*    Updated on: 23/09/2020
*    Project Description: This program is simply to test using the swing dispaly as we were shown in the lecture.
*/
package SwingTest;

import javax.swing.JOptionPane;

public class SwingDisplay {
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null, "Message", "Dialog Box", JOptionPane.INFORMATION_MESSAGE);
        System.out.println("Using println means you don't need to use \\n at the end of your out-statements");
    }//end main
}//end SwingDisplay
