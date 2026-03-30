/**
 * HelloApp.java - A simple Java application that:
 * UC1: Displays "Hello, World!"
 * UC2: Accepts a name as argument
 * UC4: Accepts multiple names
 * UC5: Uses enhanced for-loop
 * UC6: Uses substring method to remove trailing delimiter
 * UC7: Uses String.join() method
 */

public class HelloApp {

    public static void main(String[] args) {

        // Check if no arguments
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } 
        else {

            // Using String.join() method
            String names = String.join(", ", args);

            // Print greeting
            System.out.println("Hello, " + names + "!");
        }
    }
}