import java.util.Random;
import java.util.Scanner;

public class DiceRollingProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // For reading user input
        Random random = new Random();             // For generating random numbers
        int numOfDice;                            // Number of dice to roll
        int total = 0;                            // Total value of all dice rolls

        System.out.print("Enter the number of dice to roll: ");
        numOfDice = scanner.nextInt(); // Read user input

        if (numOfDice > 0) {
            // Loop through the number of dice
            for (int i = 0; i < numOfDice; i++) {
                int roll = random.nextInt(1, 7); // Roll the dice (random number 1–6)
                System.out.println("You rolled: " + roll);
                printDie(roll);                  // Display visual die based on roll
                total += roll;                   // Add roll to total
            }
            System.out.println("Total: " + total); // Print final total
        } else {
            System.out.println("Number of dice must be > 0."); // Handle invalid input
        }

        scanner.close(); // Close the scanner to free up resources
    }

    // Function that prints a visual representation of a die face based on roll
    static void printDie(int roll) {
        String dice1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;

        String dice2 = """
                 -------
                | ●     |
                |       |
                |     ● |
                 -------
                """;

        String dice3 = """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
                """;

        String dice4 = """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
                """;

        String dice5 = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                """;

        String dice6 = """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------
                """;

        // Display the correct die face based on roll value
        switch (roll) {
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("Invalid roll"); // Fallback (should never happen)
        }
    }
}
