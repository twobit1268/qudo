package com.example;

import com.example.utils.Calculator;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class CalculatorTest extends TestCase {
    private Calculator calculator;

    public CalculatorTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(CalculatorTest.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        calculator = new Calculator();
    }

    @Override
    protected void tearDown() throws Exception {
        calculator = null;
        super.tearDown();
    }

    public void testAddTwoPositiveNumbers() {
        assertEquals(7, calculator.add(3, 4));
    }

    public void testAddWithNegativeNumber() {
        assertEquals(-2, calculator.add(-5, 3));
    }

    public void testSubtractProducesNegativeResult() {
        assertEquals(-2, calculator.subtract(3, 5));
    }

    public void testMultiplyWithZero() {
        assertEquals(0, calculator.multiply(12345, 0));
    }

    public void testMultiplyWithNegative() {
        assertEquals(-15, calculator.multiply(3, -5));
    }

    public void testDivideProducesDoubleResult() {
        assertEquals(2.5, calculator.divide(10, 4), 1e-9);
    }

    public void testDivideByZeroThrows() {
        try {
            calculator.divide(1, 0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            // expected
        }
    }

    public void testPowerWithPositiveExponent() {
        assertEquals(27.0, calculator.power(3, 3), 1e-9);
    }

    public void testPowerWithZeroExponent() {
        assertEquals(1.0, calculator.power(5, 0), 1e-9);
    }

    public void testPowerZeroToZero() {
        assertEquals(1.0, calculator.power(0, 0), 1e-9);
    }
}
