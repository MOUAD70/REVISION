import java.util.Scanner;

public class BankingProgram {
    // Create a Scanner object to read user input
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Initialize starting balance
        double balance = 10000;

        // Flag to control the loop
        boolean isRunning = true;

        // Variable to store user choice
        int choice;

        // Main menu loop
        while (isRunning) {
            // Display menu
            System.out.println("***** WELCOME TO YOUR BANK ACCOUNT *****");
            System.out.println("1. Check balance");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Exit");

            // Prompt for user input
            System.out.print("Choose an option (1 - 4): ");
            choice = scanner.nextInt();

            // Perform action based on user choice
            switch (choice) {
                case 1 -> showBalance(balance);              // Show balance
                case 2 -> balance += deposit();              // Add deposit to balance
                case 3 -> balance -= withdraw(balance);      // Subtract withdrawal from balance
                case 4 -> isRunning = false;                 // Exit the loop
                default -> System.out.println("Invalid choice."); // Handle invalid input
            }
        }

        // Close the scanner after use
        scanner.close();
    }

    // Method to show current balance
    static void showBalance(double balance) {
        System.out.println("Your balance is: " + balance);
    }

    // Method to handle deposit
    static double deposit() {
        double amount;

        System.out.print("Enter the amount to be deposited: ");
        amount = scanner.nextDouble();

        // Validate deposit amount
        if (amount < 0) {
            System.out.println("Amount can't be negative.");
            return 0;
        } else {
            System.out.println(amount + "$ added.");
            return amount;
        }
    }

    // Method to handle withdrawal
    static double withdraw(double balance) {
        double amount;

        System.out.print("Enter the amount to be withdrawn: ");
        amount = scanner.nextDouble();

        // Validate withdrawal amount
        if (amount > balance) {
            System.out.println("INSUFFICIENT FUNDS");
            return 0;
        } else if (amount < 0) {
            System.out.println("Amount can't be negative.");
            return 0;
        } else {
            System.out.println(amount + "$ withdrawn.");
            return amount;
        }
    }
}
