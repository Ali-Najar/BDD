package calculator;

public class Calculator {

    public double add(int a, int b) {
        return a + b;
    }

    public double multiply(int a, int b) {
        return (double) a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return (double) a / b;
    }

    /**
     * Integer exponentiation implemented only with repeated multiplication.
     * Math.pow is deliberately not used.
     */
    public double power(int base, int exponent) {
        if (base == 0 && exponent < 0) {
            throw new ArithmeticException("Zero cannot be raised to a negative power");
        }

        if (exponent == 0) {
            return 1.0;
        }

        long exp = exponent;
        boolean negativeExponent = exp < 0;
        if (negativeExponent) {
            exp = -exp;
        }

        double result = 1.0;
        for (long i = 0; i < exp; i++) {
            result *= base;
        }

        return negativeExponent ? 1.0 / result : result;
    }

    public double calculate(int first, int second, char operator) {
        switch (operator) {
            case '*':
                return multiply(first, second);
            case '/':
                return divide(first, second);
            case '^':
                return power(first, second);
            default:
                throw new IllegalArgumentException("Unsupported operator: " + operator);
        }
    }
}
