package conditions_loops.basics2;

import java.util.Scanner;

/**
 * Part 2 Exercise 8:
 *
 *      Receive a number between 0 and 1,000,000,000 from the user.
 *      Use while loop to find the number - when the number is found
 *      exit the loop and print the number to the console.
 *
 */
public class Exercise_08 {
    public static void main(String[] args)
        throws java.io.IOException{
        System.out.println("enter a number between 0 and 1000000000");

        Scanner scan = new Scanner(System.in);
        int numMinutes = scan.nextInt();

        int b=0;
        while( b!= numMinutes ) {
            b++;
        }
        System.out.println("value of b : " + b);
    }


}

