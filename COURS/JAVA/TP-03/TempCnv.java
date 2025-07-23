import java.util.Scanner;

public class TempCnv {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        double temp;     // Variable to store the original temperature
        double newTemp;  // Variable to store the converted temperature
        String unit;     // Variable to store the unit to convert to ("C" or "F")

        // Prompt the user to enter a temperature value
        System.out.print("Enter the Temperature: ");
        temp = scanner.nextDouble();

        // Ask the user which unit they want to convert to (Celsius or Fahrenheit)
        System.out.print("Convert to (C or F)?: ");
        unit = scanner.next().toUpperCase();  // Convert input to uppercase for consistency

        // Use a ternary operator to perform the appropriate conversion
        // If the unit is "C", convert from Fahrenheit to Celsius
        // Otherwise, convert from Celsius to Fahrenheit
        newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 9 / 5) + 32;

        // Print the result rounded to 1 decimal place along with the unit
        System.out.printf("%.1f %s", newTemp, unit);

        // Close the scanner to free up resources
        scanner.close();
    }
}
