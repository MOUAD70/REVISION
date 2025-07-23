public class NestedLoops {
    public static void main(String[] args) {
        // Outer loop runs 5 times (i from 0 to 4)
        for (int i = 0; i < 5; i++) {

            // Inner loop runs 3 times for each iteration of the outer loop (j from 0 to 2)
            for (int j = 0; j < 3; j++) {
                System.out.print(j + " "); // Print the value of j followed by a space
            }

            // After the inner loop finishes, print a blank line
            System.out.println(); // This creates a line break between each outer loop cycle
        }
    }
}
