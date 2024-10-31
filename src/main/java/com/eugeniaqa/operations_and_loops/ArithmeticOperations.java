package com.eugeniaqa.operations_and_loops;

public class ArithmeticOperations {

    public static void main(String[] args) {
        int a = 43;
        int b = 3;

        // Sum
        System.out.println("The sum is: " + (a + b));

        // Substruction
        System.out.println("The dif is: " + (a - b));

        // Division
        int div1 = a / b;
        System.out.println("The div is: " + div1);

        double div2 = (double) a / b;
        System.out.println("The div is: " + div2);

        // Multiplication
        System.out.println("The multiplication is: " + (b * a));

        // Remainder
        System.out.println("The remainder is: " + ( a % b));
    }

}
