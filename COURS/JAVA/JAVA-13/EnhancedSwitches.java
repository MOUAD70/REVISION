import java.util.Scanner;

public class EnhancedSwitches {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a day of the week
        System.out.print("Enter the day of the week: ");
        String day = scanner.nextLine(); // Read the input as a full line (e.g., "Monday")

        // Use an enhanced switch expression (Java 14+) to handle multiple values per case
        switch (day) {
            // If the input matches any weekday, print "It is a weekday"
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" ->
                System.out.println("It is a weekday");

            // If the input is "Saturday" or "Sunday", print "It is the weekend"
            case "Saturday", "Sunday" ->
                System.out.println("It is the weekend");

            // If the input doesn't match any known day, print an error message
            default ->
                System.out.println(day + " is not a day");
        }

        // Close the scanner to free system resources
        scanner.close();
    }
}
