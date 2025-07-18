#include <stdio.h>  // Includes the standard input/output library so we can use functions like printf()

// Variable scope in c.

// Function to add two integers
int add(int x, int y) {
    int result = x + y;   // Add x and y, then store the sum in a variable called 'result'
    return result;        // Return the result back to wherever the function was called from
}

// Function to subtract two integers
int subtract(int x, int y) {
    int result = x - y;   // Subtract y from x, and store the result in 'result'
    return result;        // Return the result
}

int main() {

    int x = 5;  // Declare a variable x and assign it the value 5
    int y = 6;  // Declare a variable y and assign it the value 6

    int result = add(x, y);  // Call the add() function with x and y as arguments
                             // The result (5 + 6 = 11) is stored in the variable 'result'

    printf("%d", result);    // Print the value of 'result' (which is 11) to the screen

    return 0;
}
