import java.util.Arrays;

public class ArraysInJava {
    public static void main(String[] args) {

        // Declare and initialize an array of fruits
        String[] fruits = { "Apple", "Banana", "Avocado" };

        // Sort the array alphabetically (though overwritten next)
        Arrays.sort(fruits);

        // Fill the entire array with "Pineapple", replacing all previous values
        Arrays.fill(fruits, "Pineapple");

        // Traditional for loop to print each element in the array
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        // Enhanced for loop (for-each) to print each element in the array
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

    }
}
