package com.kruczala.michal.exceptions;

public class SquareRootByNegativeNumberIsWrong extends Throwable {
    public SquareRootByNegativeNumberIsWrong(String wiadomosc, double resultOfSquareRoot) {
        super("pierwiastekz z liczby ujemnej niee istnieje",null);

    }
}
