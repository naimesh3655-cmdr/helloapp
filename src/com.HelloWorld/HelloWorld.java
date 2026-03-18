/**
 * UC5: Use enhanced for-loop to handle multiple names
 */

public class HelloApp {

    public static void main(String[] args) {

        // Default case
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Greeting with multiple names using enhanced for-loop
        System.out.print("Hello ");

        boolean first = true;

        for (String name : args) {
            if (!first) {
                System.out.print(", ");
            }
            System.out.print(name);
            first = false;
        }

        System.out.println();
    }
}