package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Check user entry
        while (true) {
            try {
                System.out.println("Please enter a number between 0-9: ");
                Scanner myscan = new Scanner(System.in);

                // Read user input as a String
                String input = myscan.nextLine();

                // Parse the input to an integer
                int myNum = Integer.parseInt(input);

                // Check if the number is between 0 and 9
                if (myNum >= 0 && myNum <= 9) {
                    System.out.println("You entered " + myNum);
                    break;
                }
                else {
                    System.out.println("Not a valid number");
                }
            }
            // Output error message if a non-numerical character is entered
            catch (NumberFormatException character) {
                System.out.println("You must enter a number between 0 and 9, you entered another type of character");
            }
        }
    }
}