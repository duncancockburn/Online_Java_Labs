package conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 1: Even or Odd
 *
 *      Write a program that gets a number between 1 and 1,000,000,000
 *      from the user and determines whether it is odd
 *      or even using an if statement. Print the result.
 *
 *      NOTE: We will be using the Scanner class to collect user input. This is demonstrated below.
 */

public class Exercise_01{
    public static void main(String[] args)
        throws java.io.IOException{

        System.out.println("Please enter a number between 1 and 1,000,000,000");

        Scanner scan = new Scanner(System.in);
        long inputNumber = scan.nextLong();


        try{
            if (inputNumber <=0){
                throw new Exception("Please enter a possitive integer");
            }
        }
            catch (Exception e){
                System.out.println("Please enter a possitive integer");
            }


        try{
            if (inputNumber > 1000000000){
                throw new SpecificException("Number is too big");
            }
        } catch (SpecificException e) {
            System.out.println("Number is too big");
        }




            if(inputNumber % 2 == 0 ){
                System.out.println("even");}
                else {
                System.out.println("odd");
            }
    }
}



        // write completed code here


