package com.eugeniaqa.operations_and_loops;

public class IncrementDecrement {
    public static void main(String[] args) {
        int a = 5;

        //Inrementare
        int b = a++;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        ////Inrementare pre-fixata
        int c = ++a;
        System.out.println("a = " + a);
        System.out.println("c = " + c);

        //Decrementare
        int d = a--;
        System.out.println("a = " + a);
        System.out.println("d = " + d);

        //Decrementare pre-fixata
        int e = --a;
        System.out.println("a = " + a);
        System.out.println("e = " + e);
    }
}
