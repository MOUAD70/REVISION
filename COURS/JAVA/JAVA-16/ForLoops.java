import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) throws InterruptedException {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user how many seconds to count down from
        System.out.print("How many seconds to countdown from?: ");
        int start = scanner.nextInt(); // Read the user's input as an integer

        // Loop from the starting number down to 1
        for (int i = start; i > 0; i--) {
            System.out.println(i);      // Print the current number
            Thread.sleep(1000);         // Pause the program for 1 second (1000 milliseconds)
        }

        // After the countdown ends, print the celebration message
        System.out.println("HAPPY NEW YEAR!");

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
