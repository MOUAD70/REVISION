// Class name must match the file name (Variables.java)
public class Variables {

    // The main method is the starting point of the program
    public static void main(String[] args) {

        // VARIABLES = Reusable containers for values
        // A variable acts as if it were the value it holds

        // 🟥 Primitive types = Store simple values directly (on the stack)
        // 🟦 Reference types = Store memory addresses pointing to objects (on the heap)

        // Primitive vs Reference:
        // ┌──────────────┬───────────────┐
        // │ 🟥 Primitive  🟦 Reference  │
        // ├──────────────┼───────────────┤
        // │ int          │ String        │
        // │ double       │ Array         │
        // │ char         │ Object        │
        // │ boolean      │               │
        // └──────────────┴───────────────┘

        // 🟥 PRIMITIVE VARIABLES
        int age = 21;
        int year = 2025;
        int quantity = 1;

        double price = 19999.99;
        double gpa = 3.5;
        double temperature = -12.5;

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = true;

        // 🟦 REFERENCE VARIABLES (Objects)
        String name = "Bro Code";
        String food = "pizza";
        String email = "fake123@gmail.com";
        String car = "Mustang";
        String color = "red";

        // Printing combined string values
        System.out.println("Your choice is a " + color + " " + year + " " + car);
        System.out.println("The price is: " + currency + price);

        // Basic conditional statement
        if (forSale) {
            System.out.println("There is a " + car + " for sale.");
        } else {
            System.out.println("The " + car + " is not for sale.");
        }
    }
}
