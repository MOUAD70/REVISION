#include <stdio.h>
#include <string.h>

// Accepting user inputs
int main()
{
    int age = 0; // Age (integer)
    float gpa = 0.0f;  // GPA (floating-point number) | Shouldn't be used in double variables
    char grade = '\0'; // Grade (single character), '\0' means empty character
    char name[30] = ""; // Name (string), up to 29 characters + null terminator

    printf("Please enter your age:");
    scanf("%d", &age); // Read an integer from the user and store it in 'age'

    printf("Please enter your gpa:");
    scanf("%f", &gpa); // Read a float from the user and store it in 'gpa'

    printf("Please enter your grade:");
    scanf(" %c", &grade); // Read a single character (note the space before %c to skip any newline)

    // Clear the input buffer (remove leftover newline after previous scanf)
    getchar();
    printf("Please enter your name:");
    fgets(name, sizeof(name), stdin); // Read a line of text into 'name' (up to 29 characters)
    // Remove the newline character at the end of the string if it exists
    name[strlen(name) - 1] = '\0';

    // Display all the collected information
    printf("Your age is: %d \n", age);
    printf("Your gpa is: %f \n", gpa);
    printf("Your grade is: %c \n", grade);
    printf("Your name is: %s \n", name);

    return 0;
}