#include <stdio.h>    // For input/output functions like printf, scanf, fgets
#include <string.h>   // For string handling functions like strlen

// Functions in c to print a birthday message
void happyBirthday(char name[], int age)
{
    // Print birthday greeting using name and age
    printf("Happy Birthday %s! You're %d years old!\n", name, age);
}

int main()
{
    char name[30] = "";  // Declare a string (char array) to store the name
    int age = 0;         // Declare an integer to store the age

    // Ask for the user's name
    printf("Enter your name: \n");
    fgets(name, sizeof(name), stdin);  // Read input including spaces

    // Remove newline character from name if it exists
    name[strcspn(name, "\n")] = '\0';  // Safer than name[strlen(name) - 1]

    // Ask for the user's age
    printf("Enter your age: ");
    scanf(" %d", &age);  // Read an integer; space before %d skips leftover newlines

    // Call the birthday function
    happyBirthday(name, age);

    return 0; 
}
