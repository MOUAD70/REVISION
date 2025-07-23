import java.util.Scanner;

public class SubStr {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their email
        System.out.print("Enter your full email: ");
        String email = scanner.nextLine(); // Read the entire line as a string

        // Check if the input contains the '@' symbol
        if (email.contains("@")) {
            // Extract the username (before the '@')
            String userName = email.substring(0, email.indexOf("@"));

            // Extract the domain (after the '@')
            String domain = email.substring(email.indexOf("@") + 1);

            // Print the extracted parts
            System.out.println("Your name is: " + userName);
            System.out.println("Your domain is: " + domain);
        } else {
            // If '@' is missing, it's not a valid email
            System.out.println("Email invalid!");
        }

        // Close the scanner to free resources
        scanner.close();
    }
}
