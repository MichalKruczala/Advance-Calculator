package com.kruczala.michal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MultiplyTest {
    public AdvanceCalculator advanceCalculator = new AdvanceCalculator();

    @Test
    public void multiplyDoubleByZero() {
        //dane wejsciowe do testu
        double firstNumber = 5;
        int zero = 0;
        // uruchomienie aplikacji
        double result = advanceCalculator.multiply(firstNumber, zero);
        // sprawdzenie wynik
        Assertions.assertEquals(0, result, "Wrong result in method multiplyDoubleByZero");
    }

    @Test
    public void multiplyIntByZero() {
        int firstNumber = 6;
        int zero = 0;
        double result = advanceCalculator.multiply(firstNumber, zero);
        Assertions.assertEquals(0, result, "Wrong result in method multiplyIntByZero");


    }

    @Test
    public void multiplyZeroByZero() {
        int zero1 = 0;
        int zero2 = 0;
        double result = advanceCalculator.multiply(zero1, zero2);
        Assertions.assertEquals(0, result, "Wrong result in method multiplyZeroByZero");

    }

    @Test
    public void multiplyBySting() {
        int firstNumber = 6;
        String Word = "HJHUH";
        String result = advanceCalculator.multiply(firstNumber, Word);
        Assertions.assertEquals("good luck!! You are Genius", result);
    }

    @Test
    public void multiplyByMinInt() {
        int firstNumber = 6;
        int minInt = Integer.MIN_VALUE;
        double result = advanceCalculator.multiply(firstNumber, minInt);
        Assertions.assertEquals((double) firstNumber * minInt, result, "Wrong result in method multiplyIntByZero");
    }

    @Test
    public void multiplyByMaxInt() {
        int firstNumber = 3;
        int maxInt = Integer.MAX_VALUE;
        double result = advanceCalculator.multiply(firstNumber, maxInt);
        Assertions.assertEquals((double) firstNumber * maxInt, result, "Wrong result in method multiplyIntByZero");
    }

    @Test
    public void multiplyMinFloat() {
        int firstNumber = 7;
        Float minFloat = Float.MIN_VALUE;
        Double result = advanceCalculator.multiply(firstNumber, minFloat);
        Assertions.assertEquals(firstNumber * minFloat, result, "Wrong result in method multiplyIntByZero");
    }

    @Test
    public void multiplyMaxFloat() {
        int firstNumber = 8;
        Float maxFloat = Float.MAX_VALUE;
        double result = advanceCalculator.multiply(firstNumber, maxFloat);
        Assertions.assertEquals(1500100900, result, "Wrong result in method multiplyIntByZero");
    }

    @Test
    public void zeromultiplyBy() {
        int zero = 0;
        int secondNumber = 800;
        double result = advanceCalculator.multiply(zero, secondNumber);
        Assertions.assertEquals(0, result, "Wrong result in method multiplyIntByZero");
    }

    @Test
    public void multiplyMinDouble() {
        int firstNumber = 3566;
        double minDouble = Double.MIN_VALUE;
        double result = advanceCalculator.multiply(firstNumber, minDouble);
        Assertions.assertEquals(firstNumber * minDouble, result, "Wrong result in method multiplyIntByZero");
    }

    @Test
    public void multiplyMaxDouble() {
        int firstNumber = 5657767;
        double maxDouble = Double.MAX_VALUE;
        double result = advanceCalculator.multiply(firstNumber, maxDouble);
        Assertions.assertEquals(firstNumber * maxDouble, result, "Wrong result in method multiplyIntByZero");
    }

    @Test
    public void multiplyMaxIntByMaxDouble() {
        int maxInt = Integer.MAX_VALUE;
        double maxDouble = Double.MAX_VALUE;
        double result = advanceCalculator.multiply(maxInt, maxDouble);
        Assertions.assertEquals(maxInt * maxDouble, result, "Wrong result in method multiplyIntByZero");
    }

    @Test
    public void multiplyMaxDoubleByMaxInt() {
        double maxDouble = Double.MAX_VALUE;
        int maxInt = Integer.MAX_VALUE;
        double result = advanceCalculator.multiply(maxDouble, maxInt);
        Assertions.assertEquals(maxDouble * maxInt, result, "Wrong result in method multiplyIntByZero");

    }

    @Test
    public void zeromultiplyByMinInt() {
        int zero = 0;
        int minInt = Integer.MIN_VALUE;
        double result = advanceCalculator.multiply(zero, minInt);
        Assertions.assertEquals(-0.0, result, "Wrong result in method multiplyIntByZero");
    }

    @Test
    public void zeromultiplyByMaxInt() {
        int zero = 0;
        int minInt = Integer.MIN_VALUE;
        double result = advanceCalculator.multiply(zero, minInt);
        Assertions.assertEquals(-0.0, result, "Wrong result in method multiplyIntByZero");
    }

    @Test
    public void multiplyMinIntByMinDouble() {

        int minInt = Integer.MIN_VALUE;
        double minDouble = Double.MIN_VALUE;
        double result = advanceCalculator.multiply(minInt, minDouble);
        Assertions.assertEquals(minInt * minDouble, result, "Wrong result in method multiplyIntByZero");


    }

    @Test
    public void multiplyMinDoubleByMinInt() {
        int minInt = Integer.MIN_VALUE;
        double minDouble = Double.MIN_VALUE;
        double result = advanceCalculator.multiply(minInt, minDouble);
        Assertions.assertEquals(minDouble * minInt, result, "Wrong result in method multiplyIntByZero");
    }


}
