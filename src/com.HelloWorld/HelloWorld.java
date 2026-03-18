/**
 * HelloApp.java - A simple Java application that:
 * UC1: Displays "Hello World"
 * UC2: Accepts a name as argument
 * UC4: Accepts multiple names and displays greeting
 */

public class HelloApp {

    public static void main(String[] args) {

        // If no arguments → default
        if (args.length == 0) {
            System.out.println("Hello World");
            return;
        }

        // If names are provided
        System.out.print("Hello ");

        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i]);

            if (i != args.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
    }
}