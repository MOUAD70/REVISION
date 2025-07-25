import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int target; // Variable to store the number to search
        String fruitTarget; // Variable (commented out) to store fruit input
        boolean isFound = false; // Flag to track if the target is found

        // Ask the user to input a number to search for
        System.out.print("Check if the number is in the array: ");
        target = scanner.nextInt();

        // Array of numbers to search in
        int[] numbers = { 1, 9, 6, 2, 10, 5, 3, 4 };

        // Commented-out section for searching fruits
        // String[] fruits = { "Apple", "Banana", "Coconut" };
        // System.out.print("Check if the fruit is in the array: ");
        // fruitTarget = scanner.nextLine();

        // Search through the numbers array
        for (int i = 0; i < numbers.length; i++) {
            if (target == numbers[i]) {
                // If match found, print success message and set flag to true
                System.out.println(numbers[i] + " = " + target + " The number " + target + " is in the array!");
                isFound = true;
                break; // Stop searching once found
            }
        }

        // Commented-out block to search in fruits array
        /*
         * for (int i = 0; i < fruits.length; i++) {
         * if (fruits[i].equals(fruitTarget)) {
         * System.out.println(fruits[i] + " = " + fruitTarget);
         * isFound = true;
         * break;
         * }
         * }
         */

        // If the number wasn't found in the array
        if (!isFound) {
            System.out.println("Could not find the number.");
        }

        scanner.close(); // Close the scanner to free resources
    }
}
