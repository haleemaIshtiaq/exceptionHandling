package se.lexicon;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Exercise8 {
    //Task:
    //Create a Java application that writes a string of text to a file.
    //
    //Use the try-with-resources statement to ensure resources are automatically closed after the operation is complete.
    //
    //Hint:
    //Try-with-resources works with classes that implement AutoCloseable.

    public static void writeTextToFileNew() {
        try (
                BufferedWriter writer = Files.newBufferedWriter(Paths.get("try.txt"), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        ) {
            writer.append("Test to write in file");
            writer.append(".");
            IO.println("Data written successfully.");

        }catch(IOException e){
            IO.println(e.getMessage());

        }

        }
        void main(){
        writeTextToFileNew();
        }
}
