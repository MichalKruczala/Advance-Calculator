package com.kruczala.michal;

import com.kruczala.michal.exceptions.SquareRootByStringIsWrong;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareRootTest {
    @Test
    public void SquareRootByPositiveNumber() {
        AdvanceCalculator advanceCalculator = new AdvanceCalculator();
        double numberToSquareRoot = 9;
        double resultOfSquareRoot = advanceCalculator.squareRoot(numberToSquareRoot);
        double requiredResultOfSquareRoot = 3;
        Assertions.assertEquals(requiredResultOfSquareRoot, resultOfSquareRoot);
    }

    @Test
    public void SquareRootByZero() {
        AdvanceCalculator advanceCalculator = new AdvanceCalculator();
        double numberToSquareRoot = 0;
        double resultOfSquareRoot = advanceCalculator.squareRoot(numberToSquareRoot);
        double requiredResultOfSquareRoot = 0;
        Assertions.assertEquals(requiredResultOfSquareRoot, resultOfSquareRoot);
    }

    @Test
    public void SquareRootByNegativeNumber() {
        AdvanceCalculator advanceCalculator = new AdvanceCalculator();
        double numberToSquareRoot = -9;
        advanceCalculator.squareRoot(numberToSquareRoot);
        throw new IllegalArgumentException("Square Root from negative number does not exist");
        // nie przechodzi mi ten test dalej...:
    }

    @Test
    public double SquareRootByString() throws SquareRootByStringIsWrong {
        AdvanceCalculator advanceCalculator =new AdvanceCalculator();
        //advanceCalculator.squareRoot();
        String word = "ble ble";

        throw new SquareRootByStringIsWrong(word);
        //mam dostarczyć double a przetestować mam Stringa,jak tnapisac ten test?


    }
}