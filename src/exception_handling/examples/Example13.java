package exception_handling.examples;

// Use throws.
class ThrowsDemo {

    public static int prompt(String str)
            throws java.io.IOException {                //any method that called this method- telling other methods that
        System.out.print(str + ": ");                   //there might be an exception associated
        return ((char) System.in.read());
    }


    public static void main(String args[]) {
        int ch;


        try {
            ch = prompt("Enter a letter");
        }
        catch(Exception exc) {
            System.out.println("I/O exception occurred.");
            ch = 'X';
        }

        System.out.println("You pressed " + ch);
    }
}
