package com.eugeniaqa.operations_and_loops;

public class AssignmentOperations {

    public static void main(String[] args) {
        int a = 8;
        int b = 4;

        int c = a;
        System.out.println("Atribuire simpla: " + c);

        a += c;         // a = a + c
        System.out.println("Atribuire cu adunare: " + a);

        a -= b;        // a = a - b
        System.out.println("Atribuire cu scadere: " + a);

        a *= c;        // a = a * c;
        System.out.println("Atribuire cu inmultire: " + a);

        a /= a;        // a = a / a;
        System.out.println("Attribuire cu impartire: " + a);

        a %= b;        // a = a % b;
        System.out.println("Atribuire cu restul impartirii: " + a);

    }
}
