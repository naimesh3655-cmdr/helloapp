/**
 * HelloApp.java - A simple Java application that:
 * UC1: Displays "Hello, World!"
 * UC2: Accepts a name as argument
 * UC4: Accepts multiple names
 * UC5: Uses enhanced for-loop
 * UC6: Uses substring method to remove trailing delimiter
 */

public class HelloApp {

    public static void main(String[] args) {

        // Check if no arguments are passed
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } 
        else {

            // String to store names
            String names = "";

            // Enhanced for loop to append names
            for (String name : args) {
                names = names + name + ", ";
            }

            // Remove trailing comma and space using substring
            names = names.substring(0, names.length() - 2);

            // Print final greeting
            System.out.println("Hello, " + names + "!");
        }
    }
}