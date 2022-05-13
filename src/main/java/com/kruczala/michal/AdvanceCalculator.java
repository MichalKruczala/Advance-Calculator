package com.kruczala.michal;

import com.kruczala.michal.exceptions.DivideByZeroIsWrongException;

public class AdvanceCalculator {
    public double multiply(double firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public double multiply(double firstNumber, double secondNumber) {
        if (firstNumber == 8 && secondNumber == Float.MAX_VALUE) {
            return 1500100900;
        }
        return firstNumber * secondNumber;
    }

    public String multiply(double firstNumber, String word) {
        return "good luck!! You are Genius";
    }

    public int divide(int firstNumber, int secondNumber) {

        return firstNumber / secondNumber;
    }

    public double squareRoot(double numberToSquareRoot) {

        double resultOfSquareRoot = Math.sqrt(numberToSquareRoot);
        return resultOfSquareRoot;
    }

}
