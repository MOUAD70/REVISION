#include <stdio.h>   // For input/output functions like printf
#include <stdbool.h> // To use 'bool', 'true', and 'false'

// Demonstrating logical operators in C
int main()
{
    int temp = 40;       // Temperature in degrees
    bool isSunny = true; // A boolean indicating whether it's sunny

    // Check if temperature is in the "good" range using logical AND (&&)
    if (temp > 0 && temp < 30)
    {
        // Both conditions must be true for this block to execute
        printf("The temperature is GOOD\n");
    }
    else
    {
        // If either condition is false
        printf("The temperature is BAD\n");
    }

    // Check if it's NOT sunny using logical NOT (!)
    if (!isSunny)
    {
        // This block runs if isSunny is false
        printf("It is CLOUDY outside\n");
    }
    else
    {
        // This block runs if isSunny is true
        printf("It is SUNNY outside\n");
    }

    return 0;
}
