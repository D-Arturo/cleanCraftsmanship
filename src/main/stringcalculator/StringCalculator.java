package main.stringcalculator;

import static java.lang.Integer.parseInt;

public class StringCalculator {
    public int add(String stringReceived) {
        if (stringReceived.equals("")) return 0;
        String[] numbers = stringReceived.split(",");
        if (numbers.length == 1) return parseInt(stringReceived);
        int result = 0;
        for (String number : numbers) {
            result = result + parseInt(number);
        }
        return result;
    }
}
