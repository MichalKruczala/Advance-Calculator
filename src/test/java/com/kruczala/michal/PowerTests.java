package com.kruczala.michal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class PowerTests {
    @ParameterizedTest
    @MethodSource("methodSourceForPower")
    public void parameterizetPowerWithMethodSourceTest(double firstNumber, double secondNumber, double expectedValue) {
        AdvanceCalculator advanceCalculator = new AdvanceCalculator();
        double result = advanceCalculator.power(firstNumber, secondNumber);
        Assertions.assertEquals(expectedValue, result);
    }

    private static Stream<Arguments> methodSourceForPower() {
        return Stream.of(
                Arguments.of(2, 1, 2),
                Arguments.of(2, 2, 4),
                Arguments.of(2, 3, 8),
                Arguments.of(3, 2, 9),
                Arguments.of(-2, 3, -8),
                Arguments.of(2, 0, 1),
                Arguments.of(-5, -5, -3.2E-4)
        );
    }

    @Test
    public void powerZeroToRandomNumber() {
        AdvanceCalculator advanceCalculator = new AdvanceCalculator();
        double secondNumber = 6;
        double zero = 0;
        double result = advanceCalculator.power(zero,secondNumber);
        Assertions.assertEquals(0, result);


    }
    @Test
    public void powerZeroToZero() {
        AdvanceCalculator advanceCalculator = new AdvanceCalculator();
        double secondNumber = 0;
        double zero = 0;
        double result = advanceCalculator.power(zero,secondNumber);
        Assertions.assertEquals(1, result);


    }


}
