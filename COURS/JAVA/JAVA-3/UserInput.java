import java.util.Scanner; // Import Scanner class to read user input

public class UserInput {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their full name
        System.out.print("Enter your name: ");
        // Use nextLine() to allow spaces in the name
        String name = scanner.nextLine();

        // Prompt the user to enter their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Prompt the user to enter their GPA
        System.out.print("Enter your GPA: ");
        double gpa = scanner.nextDouble();

        // Fix for nextLine() bug after nextInt()/nextDouble():
        // Consume the remaining newline character
        scanner.nextLine();

        // Prompt the user to confirm if they are a student
        System.out.print("Are you a student (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        // Close the scanner to free resources
        scanner.close();

        // Display the collected information
        System.out.println("\nSummary:");
        System.out.println("Your name is " + name + " and you're " + age + " years old!");
        System.out.println("Your GPA is " + gpa);

        // Display student status using a condition
        if (isStudent) {
            System.out.println("You're a student.");
        } else {
            System.out.println("You're not a student.");
        }
    }
}
