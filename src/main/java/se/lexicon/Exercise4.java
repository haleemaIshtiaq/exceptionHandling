package se.lexicon;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;

public class Exercise4 {
    //Task:
    //Write a program that attempts to read a file and parse its contents as integers.
    //
    //Implement nested try-catch blocks to handle:
    //
    //NoSuchFileException
    //IOException
    //NumberFormatException
    //Hint:
    //Use an outer try-catch for file-related exceptions and an inner try-catch for parsing-related exceptions.

    void main() {

            Path path = Path.of("numbers.txt");
            //try-with-resources,Java closes the file automatically even if exception occurs
            try(
            BufferedReader reader = Files.newBufferedReader(path);){

            IO.println("----------------------");

            reader.lines().forEach(line-> {
                //Inner try catch for parsing errors
                try {
                    int number = Integer.parseInt(line);
                    IO.println("Number: " +number);

                } catch (NumberFormatException e) {
                    IO.println("Invalid number: " +line);
                }
            });
        } catch (NoSuchFileException e) {
            IO.println("Error: File not found or invalid path - " + e.getMessage());
        } catch (IOException e) {
            IO.println("Error reading file.");
            IO.println("Reason: " + e.getMessage());

        }
    }
}
