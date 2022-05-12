package com.kruczala.michal;

import com.kruczala.michal.exceptions.DivideByZeroIsWrongException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class DivideTest {

    @Test
    public void divideByPositiveNumber() {
        AdvanceCalculator advancedCalculator = new AdvanceCalculator();
        int firstNumber = 6;
        int secondNumber = 3;
        int realResultOfDivide = advancedCalculator.divide(firstNumber, secondNumber);
        int requestedResultOfDividing = 2;
        Assertions.assertEquals(requestedResultOfDividing, realResultOfDivide);
    }

    @Test
    public void divideByNegativeNumber() {
        AdvanceCalculator advancedCalculator = new AdvanceCalculator();
        int firstNumber = 6;
        int secondNumber = -3;
        int realResultOfDivide = advancedCalculator.divide(firstNumber, secondNumber);
        int requestedResultOfDividing = -2;
        Assertions.assertEquals(requestedResultOfDividing, realResultOfDivide);
    }

    @Test
    public void divideByZero() throws DivideByZeroIsWrongException {
        AdvanceCalculator advancedCalculator = new AdvanceCalculator();
        int firstNumber = 6;
        int secondNumber = 0;
        throw new DivideByZeroIsWrongException();
    }

    @ParameterizedTest
    @CsvSource(value = {"1:1:1", "2:2:1"}, delimiter = ':')
    public void parameterizedDivideTest(String firstNumber, String secondNumber, String expectedValue) {
        int first = Integer.valueOf(firstNumber);
        int second = Integer.valueOf(secondNumber);
        int expected = Integer.valueOf(expectedValue);
        AdvanceCalculator advancedCalculator = new AdvanceCalculator();
        int result = advancedCalculator.divide(first, second);
        Assertions.assertEquals(expected, result);
        //TODO zmodyfikowac tak, zeby testowal wiecej mozliwosci
    }

    @ParameterizedTest
    @MethodSource("methodSourceForDivide")
    public void parameterizetDivideWithMethodSourceTest(int firstNumber, int secondNumber, int expectedValue){
        AdvanceCalculator advanceCalculator = new AdvanceCalculator();
        int result = advanceCalculator.divide(firstNumber, secondNumber);
        Assertions.assertEquals(expectedValue, result);
        //TODO zmodyfikowac tak, zeby testowal wiecej mozliwosci
    }

    private static Stream<Arguments> methodSourceForDivide(){
        return Stream.of(
                Arguments.of(1,1,1),
                Arguments.of(2,2,1)
        );
    }

}


