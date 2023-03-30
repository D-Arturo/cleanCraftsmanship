package main.year;

public class Year {
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 == 0 && year % 400 != 0) return false;
        return year % 4 == 0;
    }
}
