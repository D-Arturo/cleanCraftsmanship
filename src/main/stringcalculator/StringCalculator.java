package main.stringcalculator;

import static java.lang.Integer.parseInt;

public class StringCalculator {
    public int add(String stringReceived) {
        if (stringReceived.equals("")) return 0;
        int result = parseInt(stringReceived);
        return result;
    }
}
