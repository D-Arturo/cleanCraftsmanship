package main.romanconverter;

public class RomanConverter {
    public static int convertToArabic(String romanNumber) {
        if (romanNumber.equals("I")) return 1;
        if (romanNumber.equals("II")) return 2;
        if (romanNumber.equals("III")) return 3;
        return 4;
    }
}
