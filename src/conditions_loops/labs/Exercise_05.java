package conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {
    public static void main(String args[])
            throws java.io.IOException {
        int a, b, c;

        System.out.println("enter 2 numbers");
        a = System.in.read();
        System.out.println("enter another number");
        b = System.in.read();
        c = a + b;

        System.out.println(c);
        System.out.println(c / 2);
    }
}
