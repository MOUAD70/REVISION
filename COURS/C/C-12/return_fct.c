#include <stdio.h>   // For input/output functions like printf
#include <stdbool.h> // For using bool, true, and false

// Function that returns the square of a number
int square(int num)
{
    return num * num;
}

// Function that checks if age is 18 or older
bool ageCheck(int age)
{
    return age >= 18;  // Returns true if age >= 18
}

// Function that returns the maximum of two integers
int getMax(int x, int y)
{
    return x >= y ? x : y;  // Ternary operator to return the greater value
}

int main()
{
    // Test the square function
    int x = square(2); // 2^2 = 4
    int y = square(3); // 3^2 = 9
    int z = square(4); // 4^2 = 16

    // Test the getMax function
    int max = getMax(11, 9);

    // Test age check
    int age = 20;

    // Print results
    printf("Squares:\n");
    printf("X: %d\n", x);
    printf("Y: %d\n", y);
    printf("Z: %d\n", z);

    printf("\nAge check:\n");
    if (ageCheck(age))
    {
        printf("You may sign up.\n");
    }
    else
    {
        printf("You must be 18 or older to sign up.\n");
    }

    printf("\nMaximum value: %d\n", max);

    return 0;
}
