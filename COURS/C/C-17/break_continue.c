#include <stdio.h> // For printf

// Demonstrating break and continue in a for loop
int main()
{
    // Loop from 1 to 10
    for (int i = 1; i <= 10; i++)
    {
        if (i == 3)
        {
            continue; // Skip the rest of the loop when i == 3
        }
        else if (i == 9)
        {
            break; // Exit the loop when i == 9
        }

        printf("%d\n", i); // Print the current value of i
    }

    return 0;
}
