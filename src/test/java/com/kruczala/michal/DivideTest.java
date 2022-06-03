package com.kruczala.michal;

import com.kruczala.michal.exceptions.ApplicationException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class DivideTest {

    @Test
    public void divideByPositiveNumber() throws ApplicationException {
        AdvanceCalculator advancedCalculator = new AdvanceCalculator();
        int firstNumber = 6;
        int secondNumber = 3;
        int realResultOfDivide = advancedCalculator.divide(firstNumber, secondNumber);
        int requestedResultOfDividing = 2;
        Assertions.assertEquals(requestedResultOfDividing, realResultOfDivide);
    }

    @Test
    public void divideByNegativeNumber() throws ApplicationException {
        AdvanceCalculator advancedCalculator = new AdvanceCalculator();
        int firstNumber = 6;
        int secondNumber = -3;
        int realResultOfDivide = advancedCalculator.divide(firstNumber, secondNumber);
        int requestedResultOfDividing = -2;
        Assertions.assertEquals(requestedResultOfDividing, realResultOfDivide);
    }

    @Test
    public void divideByZero() throws ApplicationException {
        AdvanceCalculator advancedCalculator = new AdvanceCalculator();
        int firstNumber = 6;
        int secondNumber = 0;
        double resultOfDivide = advancedCalculator.divide(firstNumber, secondNumber);
        Assertions.assertThrows(ApplicationException.class, () -> {
            throw new ArithmeticException();
        });
    }

    @ParameterizedTest
    @CsvSource(value = {"1:1:1", "2:2:1", "97:97:1", "56:9:6", "9:3:3", "48:8:6"}, delimiter = ':')
    public void parameterizedDivideTest(String firstNumber, String secondNumber, String expectedValue) throws ApplicationException {
        int first = Integer.valueOf(firstNumber);
        int second = Integer.valueOf(secondNumber);
        int expected = Integer.valueOf(expectedValue);
        AdvanceCalculator advancedCalculator = new AdvanceCalculator();
        int result = advancedCalculator.divide(first, second);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("methodSourceForDivide")
    public void parameterizetDivideWithMethodSourceTest(int firstNumber, int secondNumber, int expectedValue) throws ApplicationException {
        AdvanceCalculator advanceCalculator = new AdvanceCalculator();
        int result = advanceCalculator.divide(firstNumber, secondNumber);
        Assertions.assertEquals(expectedValue, result);
    }

    private static Stream<Arguments> methodSourceForDivide() {
        return Stream.of(
                Arguments.of(1, 1, 1),
                Arguments.of(2, 2, 1),
                Arguments.of(9, 3, 3),
                Arguments.of(3, 9, 3 / 9),
                Arguments.of(-4, 2, -2),
                Arguments.of(-222, -222, 1),
                Arguments.of(-66, 1, -66),
                Arguments.of(56, 9, 6)
        );
    }

}


