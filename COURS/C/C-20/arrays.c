#include <stdio.h>

// Arrays in c.
int main()
{
    // Initialize an array with numbers from 1 to 10
    int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    // Calculate how many elements are in the array
    int length = sizeof(numbers) / sizeof(numbers[0]);

    // Loop through the array and print each number
    for (int i = 0; i < length; i++)
    {
        printf("%d ", numbers[i]);
    }

    return 0;
}
