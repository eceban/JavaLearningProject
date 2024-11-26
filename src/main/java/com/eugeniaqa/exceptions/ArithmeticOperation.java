package com.eugeniaqa.exceptions;

public class ArithmeticOperation {
    public static int divisionNoExceptionHandling(int a, int b) {
        return a / b;
    }

    public static int divisionWithExceptionHandling(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException ex) {
            System.out.println("An exception has occurred: " + ex.getMessage());
            return 0;
        }
    }
}
