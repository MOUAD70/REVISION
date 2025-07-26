// Main class
public class OverloadedCons {
    public static void main(String[] args) {
        // Creating users using overloaded constructors with different parameters
        User user1 = new User("MOUAD"); // Only username provided
        User user2 = new User("SIMO", "simo@example.com"); // Username and email provided
        User user3 = new User("ILIAS", "iliasmario@example.com", 21); // All fields provided

        // Print details of user1
        System.out.println(user1.username); // Output: MOUAD
        System.out.println(user1.email);    // Output: Not Provided
        System.out.println(user1.age);      // Output: 0

        // Print details of user2
        System.out.println(user2.username); // Output: SIMO
        System.out.println(user2.email);    // Output: simo@example.com
        System.out.println(user2.age);      // Output: 0

        // Print details of user3
        System.out.println(user3.username); // Output: ILIAS
        System.out.println(user3.email);    // Output: iliasmario@example.com
        System.out.println(user3.age);      // Output: 21
    }
}

// User class demonstrating constructor overloading
class User {
    // Fields for the user
    String username;
    String email;
    int age;

    // Constructor with only username
    User(String username) {
        this.username = username;
        this.email = "Not Provided"; // Default email
        this.age = 0;                // Default age
    }

    // Constructor with username and email
    User(String username, String email) {
        this.username = username;
        this.email = email;
        this.age = 0;                // Default age
    }

    // Constructor with username, email, and age
    User(String username, String email, int age) {
        this.username = username;
        this.email = email;
        this.age = age;
    }
}
