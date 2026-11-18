package se.lexicon;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise2 {
    /*Task:
    Create a method that reads an integer from the user and checks whether it is within a certain range (e.g., 1 to 100).

    Handle exceptions for:

    Invalid input (non-integer input)
    Out-of-range values
    Hint:
    Use try-catch to handle InputMismatchException and a custom exception for out-of-range values.*/

    void main(){
      readInteger();
    }
    public static void readInteger() {
        Scanner scanner = new Scanner(System.in);
        int input;
        while (true)
            try {

                 IO.println("Enter a number (1-100): ");
                 input = scanner.nextInt();
                if (input < 1 || input > 100) {
                    throw new OutOfRangeException("You cannot write values out of range");
                }
                break;
            } catch (InputMismatchException e) {
                IO.println("Input must be integer");
                scanner.nextLine();
            } catch (OutOfRangeException e) {
                IO.println(e.getMessage());
            }
        IO.println("Entered number: " +input);
    }

    }


