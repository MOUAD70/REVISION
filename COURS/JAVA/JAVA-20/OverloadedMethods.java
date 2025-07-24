public class OverloadedMethods {
    public static void main(String[] args) {
        // Call the add method with two integer values.
        // Since there's no method with (int, int), Java will promote them to (double, double)
        System.out.print(add(1, 3)); 
    }

    // Method to add two double values
    static double add(double a, double b) {
        return a + b;
    }

    // Overloaded method to add three double values
    static double add(double a, double b, double c) {
        return a + b + c;
    }
}
