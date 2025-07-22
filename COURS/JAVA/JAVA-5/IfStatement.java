import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask for user's name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Ask for user's age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println(); // Line break for clarity

        // VALIDATE NAME INPUT
        if (name.isEmpty()) {
            System.out.println("You did not enter your name!");
        } else {
            System.out.println("Hello " + name + "!");
        }

        // VALIDATE AGE INPUT
        if (age < 0) {
            System.out.println("You haven't been born yet!");
        } else if (age == 0) {
            System.out.println("You are a baby!");
        } else if (age < 18) {
            System.out.println("You are a child!");
        } else if (age < 65) {
            System.out.println("You're an adult!");
        } else {
            System.out.println("You're a senior!");
        }

        // Close the scanner
        scanner.close();
    }
}
