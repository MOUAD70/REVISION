public class NestedIf {
    public static void main(String[] args) {

        // Initialize customer information
        boolean isStudent = true; // true if the person is a student
        boolean isSenior = true;  // true if the person is a senior (e.g. age 60+)
        double price = 9.99;      // base price of the ticket

        // Check if the person is a student
        if (isStudent) {
            // Inside student block, check if also a senior
            if (isSenior) {
                // Both student and senior → apply 10% + 20% = 30% total discount
                System.out.println("You get a senior discount of 20%");
                System.out.println("You get a student discount of 10%");
                price *= 0.7; // Apply 30% discount
            } else {
                // Only student → apply 10% discount
                System.out.println("You get a student discount of 10%");
                price *= 0.9;
            }
        } else {
            // Not a student
            if (isSenior) {
                // Only senior → apply 20% discount
                System.out.println("You get a senior discount of 20%");
                price *= 0.8;
            } else {
                // Not student, not senior → no discount
                price *= 1; // No change
            }
        }

        // Print the final price formatted to 2 decimal places
        System.out.printf("The price of a ticket is: $%.2f", price);
    }
}
