package se.lexicon;

public class Exercise6 {
    //Task:
    //Write a method that takes a string as input and checks if it is a valid email address.
    //
    //If the input is invalid, throw an IllegalArgumentException with an appropriate message.
    //
    //Hint:
    //Use the throw keyword to manually throw the exception.
    void main(){
        String input = IO.readln("Enter email address: ");
        validEmail(input);

    }
    static void validEmail(String input) {
        try {
            if (input == null || !input.matches("^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$")) {
                throw new IllegalArgumentException("It is not a valid address");
            }
            IO.println("email: " + input + " is valid");
        } catch (IllegalArgumentException e) {
            IO.println(e.getMessage());
        }
    }
}
