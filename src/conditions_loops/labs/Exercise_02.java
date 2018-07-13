package conditions_loops.labs;

import java.io.IOException;
import java.util.Scanner;

/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use a "nested-if" statement.
 *
 */

public class Exercise_02 {

    public static void main(String[] args)
        throws java.io.IOException {
        int weekday;
        System.out.println("What day of the week is it?");
        Scanner scan = new Scanner(System.in);
        weekday = scan.nextInt();

        Exercise_02 object = new Exercise_02();
        System.out.print("the weekday is" + object.method1(weekday));
    }



    String method1 (int weekday) {
        if(weekday == 1) {
            return ("Monday");
        }
        else if (weekday== 2 ){
            return ("Tuesday");}
        else if (weekday== 3 ){
            return ("Wednesday");}
        else {
            return ("Other");}
    }
}





        // assign input to variable as int


        // write completed code here

