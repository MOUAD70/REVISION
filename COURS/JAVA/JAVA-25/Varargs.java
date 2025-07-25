public class Varargs {
    public static void main(String[] args) {
        // Call the average method with 4 numbers and print the result
        System.out.println(average(1, 2, 3, 4));
    }

    // Method that accepts a variable number of double arguments (varargs)
    static double average(double... numbers) {
        double sum = 0;  // Variable to store the total sum of all numbers

        // If no arguments are passed, return 0 to avoid division by zero
        if (numbers.length == 0) {
            return 0;
        }

        // Loop through each number and add it to the sum
        for (double number : numbers) {
            sum += number;
        }

        // Return the average by dividing sum by the number of elements
        return sum / numbers.length;
    }
}
