package TestWeek4;

/*******
 *   ProfessionalSoftwareDevelopment:TestWeek4
 *   File: RaceZonesV2
 *   Created by: SolarLunix
 *   Created on: 16/10/2020
 *   Updated on: 16/10/2020
 *   Project Description: A new RaceZones
 *******/
public class RaceZonesV2 {
    private static char ZONEA = 'A';
    private static char ZONEB = 'B';

    public static void main(String[] args) {
        
    }

    private static char getZone(int bestTime, int timeCategory){
        if(bestTime <= timeCategory){
            return ZONEA;
        } else {
            return ZONEB;
        }
    }

    private static char getCategory(int age, int bestTime, String gender)
    {
        final int YOUNG = 30;
        final int MID = 40;
        final int OLD = 50;
        final int YOUNG_BESTTIME_FEMALE = 2800;
        final int YOUNG_BESTTIME_MALE = 2700;
        final int MID_BESTTIME_FEMALE = 3330;
        final int MID_BESTTIME_MALE = 2950;
        final int OLD_BESTTIME_FEMALE = 3502;
        final int OLD_BESTTIME_MALE = 3250;

        if(age >= OLD){
            switch(gender){
                case "male":
                    return getZone(bestTime, OLD_BESTTIME_MALE);
                default:
                    return getZone(bestTime, OLD_BESTTIME_FEMALE);
            }
        } else if (age >= MID) {
            switch(gender){
                case "male":
                    return getZone(bestTime, MID_BESTTIME_MALE);
                default:
                    return getZone(bestTime, MID_BESTTIME_FEMALE);
            }
        } else if (age >= YOUNG){
            switch(gender){
                case "male":
                    return getZone(bestTime, YOUNG_BESTTIME_MALE);
                default:
                    return getZone(bestTime, YOUNG_BESTTIME_FEMALE);
            }
        } else {
            return ZONEA;
        }
    }
}
