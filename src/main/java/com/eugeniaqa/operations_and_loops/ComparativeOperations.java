package com.eugeniaqa.operations_and_loops;

public class ComparativeOperations {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        //Egal cu
        boolean isEqual = a == b;
        System.out.println("Egal cu: " + isEqual);

        //Diferit de
        boolean isNotEqual = a != b;
        System.out.println("Diferit de: " + isNotEqual);

        boolean isGreaterThan = a > b;
        System.out.println("Mai mare decat: " + isGreaterThan);

        boolean isLessThan = a < b;
        System.out.println("Mai mic decat: " + isLessThan);

        boolean isGreaterThanOrEqual = a >= b;
        System.out.println("Mai mare sau egal cu: " + isGreaterThanOrEqual);

        boolean isLessThanOrEqual = a <= b;
        System.out.println("Mai mic sau egal cu: " + isLessThanOrEqual);

    }
}
