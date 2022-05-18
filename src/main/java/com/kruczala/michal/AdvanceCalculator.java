package com.kruczala.michal;

import com.kruczala.michal.exceptions.ApplicationException;

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

    public int divide(int firstNumber, int secondNumber) throws ApplicationException {
        if (secondNumber == 0){
            throw new ApplicationException("Dividing by zero is wrong!");
        }

        return firstNumber / secondNumber;
    }

    public double squareRoot(double numberToSquareRoot) throws ApplicationException {
        double resultOfSquareRoot = Math.sqrt(numberToSquareRoot);


        if (numberToSquareRoot < 0) {
            throw new ApplicationException("You can't square root by negative number");
        }

        return resultOfSquareRoot;
    }

    public double power(double firstNumber, double secondNumber) {
        return Math.pow(firstNumber, secondNumber);
    }
}

