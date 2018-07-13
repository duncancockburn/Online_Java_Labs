package input_output.examples;

// Use a BufferedReader to read characters from the console.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ReadChars {
    public static void main(String args[])
            throws IOException {


        char c = 'a';
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //input stream reads charaters and buffered reader is a wrapper class which means you can read line by line

        System.out.println("Enter characters, period to quit.");


        // read characters

        do {
            try {
                c = (char) br.read();
                throw new CustomExcept();
            }
            catch (CustomExcept e) {
                System.out.println(e.toString());
            }}
            while
                (c != '.');



    }
}