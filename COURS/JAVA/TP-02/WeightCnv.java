import java.util.Scanner;

public class WeightCnv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weight;      // Variable to store input weight
        double newWeight;   // Variable to store converted weight
        int choice;         // User's conversion choice

        // Welcome message and options
        System.out.println("***** Welcome to the weight conversion program *****");
        System.out.println("1. Convert lbs to kg");
        System.out.println("2. Convert kg to lbs");

        // Ask the user for their choice
        System.out.print("Choose an option (1, 2): ");
        choice = scanner.nextInt();

        // Handle invalid choice
        if (choice != 1 && choice != 2) {
            System.out.print("Invalid choice.");
        } else {
            if (choice == 1) {
                // User chose to convert pounds to kilograms
                System.out.print("Enter your weight (lbs): ");
                weight = scanner.nextDouble();

                // Check for invalid weight input
                if (weight <= 0) {
                    System.out.println("Weight couldn't be negative or null.");
                } else {
                    // Perform conversion
                    newWeight = weight * 0.453592;
                    System.out.printf("The new weight in KG is: %.2f ", newWeight);
                }

            } else if (choice == 2) {
                // User chose to convert kilograms to pounds
                System.out.print("Enter your weight (Kg): ");
                weight = scanner.nextDouble();

                // Check for invalid weight input
                if (weight <= 0) {
                    System.out.println("Weight couldn't be negative or null.");
                } else {
                    // Perform conversion
                    newWeight = weight / 0.453592;
                    System.out.printf("The new weight in lbs is: %.2f ", newWeight);
                }
            }
        }

        // Close the scanner to free up resources
        scanner.close();
    }
}
