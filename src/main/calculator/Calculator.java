package main.calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    public static List<Integer> primeFactorsOf(int number) {
        ArrayList<Integer> primeFactors = new ArrayList<>();
        if (number > 1) {
            for (; number % 2 == 0 && number / 2 != 1; number /= 2) {
                primeFactors.add(2);
            }
            for (; number % 3 == 0 && number / 3 != 1; number /= 3) {
                primeFactors.add(3);
            }
            if (number > 1)
                primeFactors.add(number);
        }
        return primeFactors;
    }
}
