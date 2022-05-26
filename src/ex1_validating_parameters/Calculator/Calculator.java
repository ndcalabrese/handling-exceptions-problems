package ex1_validating_parameters.Calculator;

public class Calculator {

    public static int factorial(int num) {

        if (num < 0) {
            throw new IllegalArgumentException("Number cannot be less than zero");
        }
        int answer = 1;
        for (int i = 1; i <= num; i++) {
            answer *= i;
        }

        return answer;
    }

    public static int binomialCoefficient(int setSize, int subsetSize) {

        if (setSize < 0 || subsetSize < 0) {
            throw new IllegalArgumentException("Number cannot be less than zero");
        }
        if (subsetSize > setSize) {
            throw new IllegalArgumentException("Subset size cannot be larger than set size");
        }
        int numerator = factorial(setSize);
        int denominator = factorial(subsetSize) * factorial(setSize - subsetSize);

        return numerator / denominator;
    }
}
