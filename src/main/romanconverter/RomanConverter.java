package main.romanconverter;

public class RomanConverter {

    public static int convertToArabic(String romanNumber) {
        int result = 0;
        for (int i = 0; i < romanNumber.length(); i++) {
//            if(romanNumber.charAt(i) == Numeral.ONE.roman) {
//                result += Numeral.ONE.arabic;
//            }
//            if(romanNumber.charAt(i) == Numeral.FIVE.roman) {
//                result += Numeral.FIVE.arabic;
//            }
            for (Numeral numeral : Numeral.values()) {
                if (romanNumber.charAt(i) == numeral.roman) result += numeral.arabic;
            }
        }

        return result;
    }

    private enum Numeral {
        ONE(1, 'I'),
        FIVE(5, 'V');

        public final int arabic;
        public final char roman;

        Numeral(int arabic, char roman) {
            this.arabic = arabic;
            this.roman = roman;
        }
    }
}
