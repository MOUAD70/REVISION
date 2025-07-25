public class TwoDimArrays {
    public static void main(String[] args) {
        // Define 1D arrays for each category of groceries
        String[] fruits = {"Apple", "Banana", "Avocado"};
        String[] vegetables = {"Potato", "Onion", "Carrot"};
        String[] meats = {"Chicken", "Beef", "Fish"};

        // Combine the 1D arrays into a 2D array (an array of arrays)
        String[][] groceries = {fruits, vegetables, meats};

        // Modify the first element of the 'fruits' array
        groceries[0][0] = "Pineapple";  // Replaces "Apple" with "Pineapple"

        // Loop through each category (fruits, vegetables, meats)
        for (String[] foods : groceries) {
            // Loop through each item in the current category
            for (String food : foods) {
                System.out.print(food + " ");  // Print the food followed by a space
            }
            System.out.println();  // Newline after each category
        }
    }    
}
