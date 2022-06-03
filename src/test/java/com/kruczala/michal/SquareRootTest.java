package com.kruczala.michal;

import com.kruczala.michal.exceptions.ApplicationException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareRootTest {
    @Test
    public void squareRootByPositiveNumber() throws ApplicationException {
        AdvanceCalculator advanceCalculator = new AdvanceCalculator();
        double numberToSquareRoot = 9;
        double resultOfSquareRoot = advanceCalculator.squareRoot(numberToSquareRoot);
        double requiredResultOfSquareRoot = 3;
        Assertions.assertEquals(requiredResultOfSquareRoot, resultOfSquareRoot);
    }

    @Test
    public void squareRootByZero() throws ApplicationException {
        AdvanceCalculator advanceCalculator = new AdvanceCalculator();
        double numberToSquareRoot = 0;
        double resultOfSquareRoot = advanceCalculator.squareRoot(numberToSquareRoot);
        double requiredResultOfSquareRoot = 0;
        Assertions.assertEquals(requiredResultOfSquareRoot, resultOfSquareRoot);
    }

    @Test
    void squareRootByNegativeNumber() {

        ApplicationException thrown = Assertions.assertThrows(ApplicationException.class, () -> {
            AdvanceCalculator advanceCalculator = new AdvanceCalculator();
            double numberToSquareRoot = -9;
            advanceCalculator.squareRoot(numberToSquareRoot);
        });

        Assertions.assertEquals("You can't square root by negative number", thrown.getMessage());
    }

//    @Test
//    public void squareRootByString() throws ApplicationException {
//        ApplicationException thrown = Assertions.assertThrows(ApplicationException.class, () -> {
//        AdvanceCalculator advanceCalculator = new AdvanceCalculator();
//        String word = "ble ble";
//        advanceCalculator.squareRoot(Double.parseDouble(word));
//        });
//
//        Assertions.assertEquals("String is not required tupe of data", thrown.getMessage());
        //mam dostarczyć double a przetestować mam Stringa,jak tnapisac ten test?


    }
}