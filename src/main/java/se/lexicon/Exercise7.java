package se.lexicon;

import java.util.ArrayList;
import java.util.List;

public class Exercise7 {
    //Task:
    //Create a program that manages a list of names.
    //
    //Implement:
    //
    //A method to find a name in the list
    //Throw NameNotFoundException if the name is not found
    //A method to add a name to the list
    //Throw DuplicateNameException if the name already exists

    List<String> names = new ArrayList<>();

    //Method to add names
    public void addNames(String name){
        if(names.stream().anyMatch(n -> n.equalsIgnoreCase(name))){
            throw new DuplicateNameException("Name already exist." +name);
        }
        names.add(name);
        IO.println("Name added: " +name);
    }

    public void findName(String name){
        if(names.stream().noneMatch(n -> n.equalsIgnoreCase(name))){
            throw new NameNotFoundException("Name not found." +name);
        }
        IO.println("Name " +name +" is found in the list");
    }
    void main(){

        try{
            addNames("Ali");
            addNames("Sara");
            addNames("Ahmed");
            String name = IO.readln("Enter the name to find: ");
            findName(name);

            String newName = IO.readln("Enter the name to add: ");
            addNames(newName);
        }catch(NameNotFoundException|DuplicateNameException e){
            IO.println(e.getMessage());
        }

    }

}
