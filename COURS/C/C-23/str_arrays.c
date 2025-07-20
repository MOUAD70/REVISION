#include <stdio.h>
#include <string.h>

int main()
{
    // Declare a 2D array of strings with 3 fruits, each string can hold up to 9 characters + null terminator
    char fruits[][10] = {"Apple", "Banana", "Coconut"};

    // Calculate how many fruits are in the array
    int length = sizeof(fruits) / sizeof(fruits[0]);

    // Change the first letter of "Apple" to 'e' → now it's "epple"
    fruits[0][0] = 'e';

    // Change the last letter of "epple" (index 4) to 'A' → now it's "epplA"
    fruits[0][4] = 'A';

    // Loop to print all the fruit names
    for (int i = 0; i < length; i++)
    {
        printf("%s ", fruits[i]);  // Print each fruit followed by a space
    }

    return 0;
}
