package main.calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    public static List<Integer> primeFactorsOf(int number) {
        ArrayList<Integer> primeFactors = new ArrayList<>();

        for (int divisor = 2; number > 1; divisor++) {
            for (; number % divisor == 0; number /= divisor) {
                primeFactors.add(divisor);
            }
        }

        return primeFactors;
    }
}
