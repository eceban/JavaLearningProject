package com.eugeniaqa.operations_and_loops;

public class DayOfTheWeek {
    public static void main(String[] args) {

        int dayNumber = 9;
        String dayName;

        switch (dayNumber) {
            case 1:
                dayName = "Luni";
                break;
            case 2:
                dayName = "Marti";
                break;
            case 3:
                dayName = "Miercuri";
                break;
            case 4:
                dayName = "Joi";
                break;
            case 5:
                dayName = "Vineri";
                break;
            case 6:
                dayName = "Sambata";
                break;
            case 7:
                dayName = "Duminica";
                break;
            default:
                dayName = "Not defined";
        }
        System.out.println("The day for number" + dayNumber + " is " + dayName);
    }
}

