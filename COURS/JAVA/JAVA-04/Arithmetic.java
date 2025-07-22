public class Arithmetic {
    public static void main(String[] args) {

        // Declare and initialize variables
        int x = 2;
        int y = 4;
        int z;

        // BASIC ARITHMETIC OPERATORS
        z = x + y;      // Addition
        // z = x - y;   // Subtraction
        // z = x * y;   // Multiplication
        // z = x / y;   // Integer Division (result = 0 if x < y)
        // z = x % y;   // Modulus (remainder)

        // AUGMENTED ASSIGNMENT OPERATORS
        // x += y;  // same as x = x + y
        // x -= y;  // same as x = x - y
        // x *= y;  // same as x = x * y
        // x /= y;  // same as x = x / y
        // x %= y;  // same as x = x % y

        // INCREMENT & DECREMENT OPERATORS
        // x++;  // Post-increment (adds 1 after using x)
        // x--;  // Post-decrement (subtracts 1 after using x)

        // ORDER OF OPERATIONS: [P-E-M-D-A-S]
        // Parentheses > Exponents > Multiplication > Division > Addition > Subtraction

        // Example using order of operations
        double result = 3 + 4 * (7 - 5) / 2.0;
        // => 3 + 4 * 2 / 2.0
        // => 3 + 8 / 2.0
        // => 3 + 4.0 = 7.0

        // OUTPUT
        System.out.println("z: " + z);
        System.out.println("result: " + result);
    }
}
