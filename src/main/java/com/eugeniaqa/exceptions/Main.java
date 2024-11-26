package com.eugeniaqa.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        int stringLength = TextManager.getTextLength("");
        System.out.println(stringLength);

        String data = null;
        System.out.println(TextManager.getTextLengthWithTryCatchFinally(data));
        System.out.println("!!!Caught exception!!!");

        System.out.println(ArithmeticOperation.divisionNoExceptionHandling(10, 5));
        System.out.println(ArithmeticOperation.divisionWithExceptionHandling(10, 0));
        System.out.println("!!!Caught exception!!!");


        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader("fisier.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException ex) {
            System.out.println("Eroare la citirea fisierului: " + ex.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException ex) {
                System.out.println("Eroare la inchiderea fisierului: " + ex.getMessage());
            }
        }
    }
}
