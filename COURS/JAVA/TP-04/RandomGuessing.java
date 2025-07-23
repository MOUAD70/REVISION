import java.util.Random;
import java.util.Scanner;

public class RandomGuessing {
    public static void main(String[] args) {
        // Create a Random object to generate random numbers
        Random random = new Random();

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        int guess;          // Variable to store the user's guess
        int attempts = 0;   // Counter for the number of attempts

        // Generate a random number between 1 and 10 (inclusive)
        int randomNumber = random.nextInt(1, 11); // nextInt(min, max+1) in Java 17+

        // Welcome message and instructions
        System.out.println("***** NUMBER GUESSING GAME *****");
        System.out.print("You might want to guess a number between 1 and 10: \n");

        // Start the guessing loop
        do {
            System.out.println("Guess the number: ");
            guess = scanner.nextInt(); // Read the user's guess
            attempts++;                // Increment attempt count

            // Provide feedback based on the guess
            if (guess < randomNumber) {
                System.out.println("TOO LOW! Try again");
            }
            else if (guess > randomNumber) {
                System.out.println("TOO HIGH! Try again");    
            }
            else {
                // User guessed correctly
                System.out.println("CORRECT! The number was " + randomNumber);
                System.out.println("# of attempts: " + attempts);
            }
        } while (guess != randomNumber); // Repeat until correct guess

        // Close the scanner to release resources
        scanner.close();
    }
}
