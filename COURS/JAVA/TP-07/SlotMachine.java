import java.util.Random;
import java.util.Scanner;

public class SlotMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int balance = 100; // Initial balance for the player
        int bet;           // Amount the player chooses to bet
        int payout;        // Amount the player wins (if any)
        String[] row;      // Array representing the result of the slot spin
        String playAgain;  // Stores whether the player wants to play another round

        // Welcome message and instructions
        System.out.println("**************************");
        System.out.println(" Welcome to JAVA slots ");
        System.out.println("Symbols: $ % # * !");
        System.out.println("**************************");

        // Main game loop - continues as long as the player has money
        while (balance > 0) {
            System.out.println("Current balance: $" + balance);
            System.out.print("Place your bet amount: ");
            bet = scanner.nextInt(); // Read the player's bet
            scanner.nextLine(); // Consume newline left from nextInt()

            // Check for invalid bets
            if (bet > balance) {
                System.out.println("INSUFFICIENT FUNDS");
                continue;
            } else if (bet <= 0) {
                System.out.println("Bet must be greater than 0");
                continue;
            } else {
                balance -= bet; // Deduct the bet from the balance
            }

            // Spin the slot machine
            System.out.println("Spinning...");
            row = spinRow();       // Generate 3 random symbols
            printRow(row);         // Display the result
            payout = getPayout(row, bet); // Calculate winnings

            // Check if the player won
            if (payout > 0) {
                System.out.println("You won $" + payout);
                balance += payout; // Add winnings to balance
            } else {
                System.out.println("Sorry you lost this round");
            }

            // Ask if the player wants to continue
            System.out.println("Do you want to play again ? (Y/N)");
            playAgain = scanner.nextLine().toUpperCase();

            if (!playAgain.equals("Y")) {
                break; // Exit the game loop
            }
        }

        // Game over message
        System.out.println("GAME OVER! Your final balance is $" + balance);

        scanner.close(); // Close the scanner resource
    }

    // Generates and returns an array of 3 random slot symbols
    static String[] spinRow() {
        Random random = new Random();
        String[] symbols = { "$", "%", "#", "*", "!" };
        String[] row = new String[3];

        for (int i = 0; i < 3; i++) {
            row[i] = symbols[random.nextInt(symbols.length)];
        }

        return row;
    }

    // Displays the result of the spin in a stylized format
    static void printRow(String[] row) {
        System.out.println("***********");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("***********");
    }

    // Calculates the payout based on the spin result and bet amount
    static int getPayout(String[] row, int bet) {
        // Jackpot: All 3 symbols match
        if (row[0].equals(row[1]) && row[1].equals(row[2])) {
            return switch (row[0]) {
                case "!" -> bet * 3;
                case "*" -> bet * 4;
                case "#" -> bet * 5;
                case "%" -> bet * 10;
                case "$" -> bet * 20;
                default -> 0;
            };
        }

        // Partial match: First 2 or last 2 symbols match
        else if (row[0].equals(row[1]) || row[1].equals(row[2])) {
            return switch (row[0]) {
                case "!" -> bet * 2;
                case "*" -> bet * 3;
                case "#" -> bet * 4;
                case "%" -> bet * 5;
                case "$" -> bet * 10;
                default -> 0;
            };
        }

        // No match: No winnings
        return 0;
    }
}
