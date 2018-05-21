package conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use a "nested-if" statement.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // create scanner
        System.out.print("Enter a number between 1 and 7");
        String userinput = scanner.nextLine();
        // prompt user
        if( userinput == ("Monday")) {
            System.out.println(1);
        }
            else if( userinput == "Tuesday");
        {System.out.println(2);
            else if( userinput == "Wednesday");
            System.out.println(3);}
            else {
            System.out.println("Other");


        }

        // assign input to variable as int


        // write completed code here

    }
}
