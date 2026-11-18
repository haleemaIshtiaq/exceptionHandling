package se.lexicon;

public class Exercise5 {
     void main() {

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
            }finally{
                IO.println("Finally block executed");
            }
        }
        IO.println("Program Finished");

    }
}
