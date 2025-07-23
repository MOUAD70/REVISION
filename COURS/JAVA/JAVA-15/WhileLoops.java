import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Repeat asking the user if the input is empty
        // This loop checks the condition *before* running the body
        while (name.isEmpty()) {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }

        // Alternatively, you could use a do-while loop instead:
        // This loop runs the body *at least once*, then checks the condition
        /*
         * do {
         * System.out.print("Enter your name: ");
         * name = scanner.nextLine();
         * } while (name.isEmpty());
         */

        // You could also display a confirmation message if needed
        System.out.println("Hello, " + name + "!");

        // Always close the Scanner to release resources
        scanner.close();
    }
}
