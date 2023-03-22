package main.stringcalculator;

import java.util.Arrays;

import static java.lang.Integer.parseInt;

public class StringCalculator {
    public int add(String stringReceived) {
        if (isEmptyString(stringReceived)) return 0;
        String[] numbers = stringReceived.split(",|\n");
//        if (isSingleNumber(numbers)) return parseInt(stringReceived);
        return Arrays.stream(numbers).mapToInt(value -> parseInt(value)).sum();
//        int result = 0;
//        for (String number : numbers) {
//            result = result + parseInt(number);
//        }
//        return result;
    }
//
//    private boolean isSingleNumber(String[] numbers) {
//        return numbers.length == 1;
//    }

    private boolean isEmptyString(String stringReceived) {
        return stringReceived.equals("");
    }
}
