package com.kruczala.michal.exceptions;

public class SquareRootByStringIsWrong extends Throwable {
    public SquareRootByStringIsWrong(String s) {
        System.out.println("Square root by string is wrong!");
    }
}
