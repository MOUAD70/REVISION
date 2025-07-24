import java.util.Scanner; 

public class Methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input

        String name; // Variable to store user's name
        int age;     // Variable to store user's age

        // Ask the user for their name
        System.out.print("Enter Your name: ");
        name = scanner.nextLine(); // Read the full line as the name

        // Ask the user for their age
        System.out.print("Enter Your age: ");
        age = scanner.nextInt(); // Read the integer input as age

        // Call the greeting method with the entered name and age
        greeting(name, age);

        scanner.close(); // Close the scanner to free up system resources
    }

    // This method prints a birthday greeting using the given name and age
    static void greeting(String name, int age) {
        System.out.println("Happy birthday " + name + "! You're " + age + " years old!!!");
    }
}
