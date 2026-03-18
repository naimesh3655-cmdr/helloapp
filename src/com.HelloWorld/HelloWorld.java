public class HelloWorld {

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

            // Add comma except for last element
            if (i != args.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println(); // new line
    }
}