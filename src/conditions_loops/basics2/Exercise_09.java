package conditions_loops.basics2;


/**
 * Part 2 Exercise 9:
 *
 *      Use a do-while loop to print out the letters of the alphabet in reverse order.
 *
 */
public class Exercise_09 {
    public static void main(String[] args) {
  char ch = 'z';
      do {
        System.out.println("Reverse alphabet is: " + ch);
        ch--;
    } while (ch > 'a');
}
}





