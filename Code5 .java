package days;

import java.util.Scanner;

enum Weekdays {
    ONE("Monday"),
    TWO("Tuesday"),
    THREE("Wednesday"),
    FOUR("Thursday"),
    FIVE("Friday"),
    SIX("Saturday"),
    SEVEN("Sunday");

    private final String dayName;

    Weekdays(String dayName) {
        this.dayName = dayName;
    }

    public String getDayName() {
        return dayName;
    }
}

public class Days {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the day number (ONE,TWO,THREE,FOUR,FIVE,SIX,SEVEN) in string");
        
        try {
            String code = in.next().toUpperCase();
            Weekdays weekday = Weekdays.valueOf(code);
            System.out.println("The day is: " + weekday.getDayName());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input. Please enter a valid day code.");
        }

        // Print all days using enum
        System.out.println("All days of the week:");
        for (Weekdays day : Weekdays.values()) {
            System.out.println(day.getDayName());
        }
    }
}