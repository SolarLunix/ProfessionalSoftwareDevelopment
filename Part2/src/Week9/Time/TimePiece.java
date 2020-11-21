package Week9.Time;

import java.text.DecimalFormat;
import java.time.chrono.MinguoChronology;

/*******
 *   Part2:Week9.Time
 *   File: TimePiece
 *   Created by: Melissa Melaugh
 *   Created on: 21/11/2020
 *   Updated on: 21/11/2020
 *   Project Description: Creates an object that holds information about a Timepiece
 *******/
public class TimePiece {
    private static final int MIN_IN_HOUR = 60;
    private static final int HOUR_IN_DAY = 24;
    private String kind;
    private double price;
    private String readout;
    private int hours;
    private int minutes;
    private boolean canTalk;

    public TimePiece(String kind, double price, String readout, int hours, int minutes, boolean canTalk){
        this.kind = kind;
        this.price = price;
        this.readout = readout;
        this.hours = hours;
        this.minutes = minutes;
        this.canTalk = canTalk;
    }

    public TimePiece(String kind, double price, String readout, boolean canTalk){
        this(kind, price, readout, 0, 0, canTalk);
    }

    public TimePiece(){
        this("", 0, "", false);
    }

    public String showTime(){
        DecimalFormat df = new DecimalFormat("00");
        String out = df.format(this.hours) + ":" + df.format(this.minutes);
        return out;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,###.00");
        String separator = "==============================";
        String out = "\nDetails of clock";
        out += "\n" + separator;
        out += "\nCost Price:\t\t\t£" + df.format(this.price);
        out += "\nType of Readout:\t" + this.readout;
        out += "\nCurrent Time:\t\t" + showTime();
        out += "\nThis time piece " + (this.canTalk ? "can" : "cannot") + " talk.";
        out += "\n" + separator;
        return out;
    }

    protected void setHours(int hours){
        this.hours = hours;
    }

    protected void setMinutes(int minutes){
        this.minutes = minutes;
    }

    protected void setTime(int hours, int minutes){
        this.hours = hours;
        this.minutes = minutes;
    }

    protected void increaseTime(int hours, int minutes){
        this.hours += hours;
        this.minutes += minutes;
        this.hours += (this.minutes/MIN_IN_HOUR);
        this.hours %= HOUR_IN_DAY;
        this.minutes %= MIN_IN_HOUR;
    }
}
