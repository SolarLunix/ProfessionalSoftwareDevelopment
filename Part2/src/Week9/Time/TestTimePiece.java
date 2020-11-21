package Week9.Time;

/*******
 *   Part2:Week9.Time
 *   File: TestTimePiece
 *   Created by: Melissa Melaugh
 *   Created on: 21/11/2020
 *   Updated on: 21/11/2020
 *   Project Description: A class to test the TimePiece class
 *******/
public class TestTimePiece {
    public static void main(String[] args) {
        TimePiece myWatch = new TimePiece("watch", 12.99, "digital", 9, 45, false);
        TimePiece bigBen = new TimePiece("clock", 100_000, "analog", false);

        System.out.println(bigBen);
        System.out.println(myWatch.showTime());

        myWatch.setMinutes(50);
        myWatch.setHours(10);

        bigBen.setTime(22, 55);
        bigBen.increaseTime(2, 5);

        System.out.println(myWatch);
        System.out.println(bigBen);
    }
}
