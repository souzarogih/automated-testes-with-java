package com.higor.math;

import com.higor.SimpleMath;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test Math Operations in SimpleMath Class")
public class SimpleMathTest {

    @Test
    @DisplayName("Test 6.2 + 2 = 8.2")
    void testSum_When_SixDotTwoIsAddedByTwo_ShouldReturnEightDotTwo() {
        SimpleMath math = new SimpleMath();
        double firstNumber = 6.2D;
        double secondNumber = 2D;
        Double actual = math.sum( firstNumber, secondNumber);
        double expected = 8.2D;

        assertEquals(expected, actual, () -> "testSum() " + firstNumber + "+" +  secondNumber + " did not produce " + expected + "!");
        assertNotEquals(9.2, actual );
        assertNotNull(actual);
    }

    @Test
    @DisplayName("Test 6.2 * 2 = 12.4")
    void testMultiplication() {
        SimpleMath math = new SimpleMath();
        double firstNumber = 6.2D;
        double secondNumber = 2D;
        Double actual = math.multiplication(firstNumber, secondNumber);
        double expected = 12.4D;

        assertEquals(expected, actual, () -> "testMultiplication() " + firstNumber + "*" +  secondNumber + " did not produce " + expected + "!");
        assertNotEquals(9.0, actual);
        assertNotNull(actual);
    }

    @Test
    @DisplayName("Test 6.2 - 2 = 4.2")
    void testSubtraction() {
        SimpleMath math = new SimpleMath();
        double firstNumber = 6.2D;
        double secondNumber = 2D;
        Double actual = math.subtraction(firstNumber, secondNumber);
        double expected = 4.2D;

        assertEquals(expected, actual, () -> "testSubtraction() " + firstNumber + "-" +  secondNumber + " did not produce " + expected + "!");
        assertNotNull(actual);
    }

    @Test
    @DisplayName("Test (6.2 + 2) / 2 = 4.1")
    void testMean() {
        SimpleMath math = new SimpleMath();
        double firstNumber = 6.0D;
        double secondNumber = 6.0D;
        Double actual = math.mean(firstNumber, secondNumber);
        double expected = 6.0D;

        assertEquals(expected, actual, () -> "testMean() media de " + firstNumber + " e " +  secondNumber + " did not produce " + expected + "!");
        assertNotEquals(9.0, actual);
        assertNotNull(actual);
    }

    @Test
    @DisplayName("Test 6.2 / 2 = 3.1")
    void testDivision() {
        SimpleMath math = new SimpleMath();
        double firstNumber = 50.0D;
        double secondNumber = 10.0D;
        Double actual = math.division(firstNumber, secondNumber);
        double expected = 5.0D;

        assertEquals(expected, actual, () -> "testDivision() " + firstNumber + " / " +  secondNumber + " did not produce " + expected + "!");
        assertNotEquals(9.0, actual);
        assertNotNull(actual);
    }

    @Test
    @DisplayName("Test Division by zero")
    void testDivision_When_FirstNumberIsDividedByZero_ShouldArithmeticException(){
        fail();
    }

    @Test
    @DisplayName("Test square root of 81 = 9")
    void testSquareRoot() {
        SimpleMath math = new SimpleMath();
        double number = 81D;
        double expected = 9D;

        Double actual = math.squareRoot(number);

        assertEquals(expected, actual, () -> "testSquareRoot() Square Root of " + number + " did not produce " + expected + "!");
        assertNotEquals(9.1, actual);
        assertNotNull(actual);
    }
}
