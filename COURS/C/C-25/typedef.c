#include <stdio.h>

// Typedef in C: creating type aliases to make the code more readable
typedef int Number;         // 'Number' is now just another name for 'int'
typedef char String[50];    // 'String' represents a character array of size 50

int main()
{
    Number x = 2;           // Same as: int x = 2
    Number y = 4;           // Same as: int y = 4
    Number z = x + y;       // Add x and y, store result in z

    String name = "Mouad MOUNJIB";  // Declare a string using our alias

    printf("%d\n", z);      // Print the result of the addition (6)
    printf("%s\n", name);   // Print the name

    return 0;
}
