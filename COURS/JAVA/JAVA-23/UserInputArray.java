import java.util.Scanner;

public class UserInputArray {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Declare the array and its size
        String[] foods;
        int size;

        // Ask the user how many food items they want to enter
        System.out.print("What # of food do you want ? ");
        size = scanner.nextInt(); // Read the number of items
        scanner.nextLine(); // Consume the leftover newline character

        // Initialize the array with the given size
        foods = new String[size];

        // Prompt the user to enter each food item
        for (int i = 0; i < foods.length; i++) {
            System.out.print("Enter a food: ");
            foods[i] = scanner.nextLine(); // Read each food input and store it in the array
        }

        // Display all the food items entered by the user
        System.out.println("**** YOUR CHOICES ****");
        for (String food : foods) {
            System.out.println(food); // Print each food from the array
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
