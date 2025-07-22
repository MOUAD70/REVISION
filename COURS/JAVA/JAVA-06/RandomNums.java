import java.util.Random;

public class RandomNums {
    public static void main(String[] args) {
        // Create a Random object
        Random random = new Random();

        // Declare variables for random values
        int number;           // Random integer
        double secNumber;     // Random decimal number
        boolean isHeads;      // Random boolean

        // Generate random values
        number = random.nextInt(1, 6);        // Integer between [1, 5]
        secNumber = random.nextDouble(1, 6);  // Double between [1.0, 6.0)
        isHeads = random.nextBoolean();                    // true or false

        // Print results
        System.out.println("Random integer [1-5]: " + number);
        System.out.println("Random double [1.0-6.0): " + secNumber);
        System.out.println("Coin flip (isHeads): " + isHeads);
    }
}
