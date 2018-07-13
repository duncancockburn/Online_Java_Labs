package conditions_loops.basics2;

/**
 * Part 2 Exercise 1:
 *      Celsius to Fahrenheit
 *
 *      Write the necessary code to read a degree in Celsius (as a double) from the console
 *      then convert it to fahrenheit and print it to the console.
 *
 *          F = 9 * (C / 5) + 32;
 *
 *      Output should read like - "27.4 degrees celsius = 81.32 degrees fahrenheit"
 */

public class Exercise_01 {
    public static void main(String[] args) {
        double c = 27.4;
        double f = (9 * (c / 5) + 32);
        System.out.print(c + " degrees celsius = ");
        System.out.println(f + " degrees fahrenheit");
    }


}