package se.lexicon;


public class Exercise1 {

    //Task:
    //Write a program that asks the user to input two integers and then divides the first number by the second.
    //Implement exception handling to manage the scenario where the user inputs zero as the second number.
    //
    //Hint:
    //Use try-catch to handle ArithmeticException.
    static void main() {

        int firstNumber ;
        int secondNumber;
        int result;
        while(true){
            try {
                firstNumber = Integer.parseInt(IO.readln("Enter the first number: "));
                secondNumber = Integer.parseInt(IO.readln("Enter the second number: "));
                result = firstNumber / secondNumber;
                IO.println("Result: " + result);
                break;
            }catch (ArithmeticException e){
                IO.println("Number cannot divide by zero");
            }
        }
        IO.println("Program Finished");
        }

    }

