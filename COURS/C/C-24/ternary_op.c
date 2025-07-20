#include <stdio.h> // Include standard input/output library

// Demonstrating ternary operators in C
int main()
{
    int x = 2;
    int y = 4;

    // Use ternary operator to find the greater number between x and y
    int max = (x > y) ? x : y;
    printf("%d\n", max); // Prints the greater value (4)

    int age = 21;

    // Check if age is greater than 18 and print "Adult" or "Child"
    printf("%s", (age > 18) ? "Adult\n" : "Child\n"); // Prints "Adult"

    int hours = 11;
    int minutes = 3;

    // Print time in HH:MM format with leading zeros and AM/PM suffix
    printf("%02d:%02d %s", hours, minutes, (hours < 12) ? "AM\n" : "PM\n");

    return 0;
}
