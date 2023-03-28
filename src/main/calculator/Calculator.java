package main.calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    public static List<Integer> primeFactorsOf(int number) {
        ArrayList<Integer> primeFactors = new ArrayList<>();
        if (number > 1) {
            if (number % 2 == 0 && number / 2 != 1) {
                primeFactors.add(number / 2);
                number /= 2;
            }
            if (number > 1)
                primeFactors.add(number);

        }
        return primeFactors;
    }
}
