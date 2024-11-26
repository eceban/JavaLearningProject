package com.eugeniaqa.exceptions;

public class TextManager {
    public static int getTextLength(String inputString) {
        return inputString.length();
    }

    public static int getTextLengthWithTryCatchFinally(String inputString) {
        try {
            return inputString.length();
        } catch (NullPointerException exception) {
            System.out.println("An exception has been captured: " + exception);
            return 0;
        } finally {
            System.out.println("This block is executed no matter what.");
        }
    }

    public static int getTextLengthWithIfElse(String inputString) {
        if (inputString == null) {
            System.out.println("Input string is a null value, be careful!");
            return 0;
        } else {
            return inputString.length();
        }
    }
}
