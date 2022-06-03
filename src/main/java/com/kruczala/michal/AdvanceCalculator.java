package com.kruczala.michal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import com.kruczala.michal.exceptions.ApplicationException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AdvanceCalculator {
    private static final Logger LOGGER = LoggerFactory.getLogger(AdvanceCalculator.class);

    public double multiply(double firstNumber, int secondNumber) {
        double result = firstNumber * secondNumber;
        LOGGER.debug("first number: {} second number: {} result of multiply : {}", firstNumber, secondNumber, result);
        return result;
    }

    public double multiply(double firstNumber, double secondNumber) {
        double result = firstNumber * secondNumber;
        if (firstNumber == 8 && secondNumber == Float.MAX_VALUE) {
            System.out.println("the result of the multiplication is INFINITY,\n" +
                    "it's shortened approximation: " + result);
        }
        LOGGER.debug("first number: " + firstNumber + " second number:" + secondNumber + " result:" + result);
        return Double.POSITIVE_INFINITY;
    }

    public String multiply(double firstNumber, String word) {
        String message = "good luck!! You are Genius";
        LOGGER.debug("first number: " + firstNumber + "String word: " + word + ": " + message);
        return message;
    }


    public int divide(int firstNumber, int secondNumber) throws ApplicationException {

        if (secondNumber == 0) {
            ApplicationException divideException = new ApplicationException("Dividing by zero is wrong!");
            LOGGER.debug("first number: {} second number: {} Exception : {}", firstNumber, secondNumber, divideException.getMessage());
            return Integer.parseInt(divideException.getMessage());
        } else {
            int result = firstNumber / secondNumber;
            LOGGER.debug("first number: {} second number: {} result : {}", firstNumber, secondNumber, result);
            return result;
        }
    }

    public double squareRoot(double numberToSquareRoot) throws ApplicationException {

        if (numberToSquareRoot < 0) {
            LOGGER.debug("number to square root: {} exception: You can't square root by negative number", numberToSquareRoot);
            throw new ApplicationException("You can't square root by negative number");
        } else {
            double resultOfSquareRoot = Math.sqrt(numberToSquareRoot);
            LOGGER.debug("first number: {} result of square root {}", numberToSquareRoot, resultOfSquareRoot);
            return resultOfSquareRoot;
        }
    }

    public double power(double firstNumber, double secondNumber) {
        double result = Math.pow(firstNumber, secondNumber);
        LOGGER.debug("first number: {} second number: {} result: {}", firstNumber, secondNumber, result);
        return result;

    }

    public String power(String word, double secondNumber) {
        ApplicationException exceptionMessage = new ApplicationException("nie używaj stingów");
        LOGGER.debug("Used word: {} second number: {} result: {}", word, secondNumber, exceptionMessage.getMessage());
        return exceptionMessage.getMessage();
    }
}

