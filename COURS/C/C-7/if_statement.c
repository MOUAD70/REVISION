#include <stdio.h>   // For printf, scanf, fgets
#include <stdbool.h> // For using true/false with bool
#include <string.h>  // For strlen, etc.

// if-else logic using age and student status
int main()
{
    char name[30] = "";     // Stores the name input from the user
    int age = 0;            // Stores the age
    bool isStudent = false; // Initial value: not a student

    // Ask for the user's name
    printf("Enter your name: ");
    fgets(name, sizeof(name), stdin);
    // Remove the newline character from name if it's there
    name[strlen(name) - 1] = '\0';

    // Ask for the user's age
    printf("Enter your age: ");
    scanf("%d", &age);

    // Check if name is too short
    if (strlen(name) < 1)
    {
        printf("You should enter your name first.\n");
        return 0; // Exit the program early if no name
    }

    // Example input for isStudent
    int studentInput = 0;
    printf("Are you a student? (1 for Yes, 0 for No): ");
    scanf("%d", &studentInput);
    isStudent = (studentInput == 1); // Convert int to bool

    printf("\nHello %s!\n", name); // Greet the user by name

    // Now apply the logic based on age and student status
    if (age >= 65 && !isStudent)
    {
        printf("You are a senior, so you're no longer a student.");
    }
    else if (age >= 18 || isStudent)
    {
        printf("You're an adult, you could be a student.");
    }
    else if (age == 0 && !isStudent)
    {
        printf("You are a newborn, you need to be 5 years old to be a student.");
    }
    else if (age < 0 && !isStudent)
    {
        printf("You haven't been born yet.");
    }
    else
    {
        printf("You're a child, maybe a student too.");
    }

    return 0;
}
