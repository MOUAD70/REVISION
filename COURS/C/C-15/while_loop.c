#include <stdio.h>      // Standard input/output functions
#include <string.h>     // For string manipulation functions

// While loop in c.
int main()
{
    // int number = 0;   // (commented) Placeholder for number input logic

    char name[30] = "";  // Declare an empty string to store user's name

    printf("Enter your name: ");
    fgets(name, sizeof(name), stdin);  // Read full name including spaces
    name[strlen(name) - 1] = '\0';     // Remove the newline character at the end

    // Keep asking if the name is empty
    while (strlen(name) == 0)
    {
        printf("Name cannot be empty! Enter your name:  ");
        fgets(name, sizeof(name), stdin);
        name[strlen(name) - 1] = '\0'; // Remove newline again
    }

    printf("Hello %s", name); // Greet the user

    // --- Number input section (commented out) ---

    // while (number <= 0)
    // {
    //     printf("Enter a positive number: ");
    //     scanf("%d", &number);
    // }

    // do
    // {
    //     printf("Enter a positive number: ");
    //     scanf("%d", &number);
    // } while (number <= 0);

    return 0;
}
