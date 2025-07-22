public class StrMethods {
    public static void main(String[] args) {

        // Initialize the string
        String name = "Bro Code";

        // Get the length of the string
        int length = name.length(); // 8

        // Get the first character
        char letter = name.charAt(0); // 'B'

        // Get the index of the first space character
        int index = name.indexOf(" "); // 3

        // Get the index of the last occurrence of 'o'
        int lastIndex = name.lastIndexOf("o"); // 5

        // Convert string to uppercase
        name = name.toUpperCase(); // "BRO CODE"

        // Convert string to lowercase
        name = name.toLowerCase(); // "bro code"

        // Remove leading and trailing spaces
        name = name.trim(); // still "bro code"

        // Replace all 'o' with 'a'
        name = name.replace("o", "a"); // "bra cade"

        // Check if string is empty
        if (name.isEmpty()) {
            System.out.println("Your name is empty");
        } else {
            System.out.println("Hello " + name);
        }

        // Check if string contains a space
        if (name.contains(" ")) {
            System.out.println("Your name contains a space");
        } else {
            System.out.println("Your name DOESN'T contain any spaces");
        }

        // Check if string equals "password" (ignoring case)
        if (name.equalsIgnoreCase("password")) {
            System.out.println("Your name can't be password");
        } else {
            System.out.println("Hello " + name);
        }
    }
}
