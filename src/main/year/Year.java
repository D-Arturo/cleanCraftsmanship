package main.year;

public class Year {
    public static boolean isLeapYear(int year) {
        if (isDivisibleBy(year, 4)) {
            return notDivisibleBy(year, 100) || isDivisibleBy(year, 400);
        }
        return false;
    }

    private static boolean notDivisibleBy(int year, int factor) {
        return year % factor != 0;
    }

    private static boolean isDivisibleBy(int year, int factor) {
        return year % factor == 0;
    }
}
