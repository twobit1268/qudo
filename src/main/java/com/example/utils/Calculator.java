package com.example.utils;

public class Calculator {
    /**
     * Adds two numbers
     *
     * @param a first number
     * @param b second number
     * @return sum of a and b
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts second number from the first
     *
     * @param a first number
     * @param b second number
     * @return difference between a and b
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two numbers
     *
     * @param a first number
     * @param b second number
     * @return product of a and b
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides a by b
     *
     * @param a numerator
     * @param b denominator (must not be zero)
     * @return quotient as a double
     * @throws IllegalArgumentException if b is zero
     */
    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed");
        }
        return (double) a / b;
    }

    public double power(double base, int exponent) {
        return Math.pow(base, exponent);
    }
}
