public class MathClasses {
    public static void main(String[] args) {

        // 🔢 Common Math constants
        System.out.println("PI: " + Math.PI);     // ≈ 3.14159
        System.out.println("E: " + Math.E);       // ≈ 2.71828
        // Math.TAU is not standard in all versions, but if available:
        // System.out.println("TAU: " + Math.TAU); // ≈ 6.28318

        double result; // Used to store results from Math methods

        // Common Math methods:

        // result = Math.pow(2, 3);       // 2^3 = 8.0
        // result = Math.abs(-2);         // Absolute value = 2.0
        // result = Math.sqrt(9);         // Square root = 3.0
        // result = Math.round(3.14);     // Round to nearest int = 3.0
        // result = Math.floor(2.9);      // Round down = 2.0
        // result = Math.ceil(2.4);       // Round up = 3.0
        // result = Math.max(10, 20);     // Larger of two = 20.0
        result = Math.min(10, 20);     // Smaller of two = 10.0

        System.out.println("Result: " + result);
        System.out.printf("Result: %.2f", result); // Using printf like C.

    }
}
