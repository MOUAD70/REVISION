public class TernaryOp {
    public static void main(String[] args) {
        // Define a test score
        int score = 55;

        // Use a ternary operator to determine if the score is a pass or fail
        // If score >= 60, assign "Pass" to passOrFail, otherwise assign "Fail"
        String passOrFail = (score >= 60) ? "PASS" : "FAIL";

        // Print the result
        System.out.println(passOrFail);
    }
}
