package conditions_loops.labs;

/**
 * Conditions and Loops Exercise 3: Months of the year
 *
 *      Take in a number from the user and print "January", "February", ... "December", or "Other"
 *      if the number from the user is 1, 2,... 12, or other respectively. Use a "switch" statement.
 *
 */

public class Exercise_03 {
    public static void main(String args[])
        throws java.io.IOException{
        int month;
        System.out.println("Enter a number between 1 and 12");
        month = System.in.read();
            switch (month){
                case '0':
                    System.out.println("Month is Jan");
                    break;
                case '1':
                    System.out.println("Month is Feb");
                    break;
                case '2':
                    System.out.println("Month is March");
                    break;
                default:
                    System.out.println("moth is other");
            }
    }

}
