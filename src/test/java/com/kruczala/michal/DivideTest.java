package com.kruczala.michal;

import com.kruczala.michal.exceptions.DivideByZeroIsWrongException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

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

//    @Test
//    public void divideByZero() {
//        AdvanceCalculator advancedCalculator = new AdvanceCalculator();
//        int firstNumber = 6;
//        int secondNumber = 0;
//        Assertions.assertThrows(DivideByZeroIsWrongException.class, advancedCalculator.divide(firstNumber, secondNumber));

}
