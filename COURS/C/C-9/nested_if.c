#include <stdio.h>    // For printf
#include <stdbool.h>  // To use boolean expressions

// Nested if-else statement in c.
int main()
{
    float price = 10.00;         // Original price of the ticket
    bool isStudent = true;       // Is the user a student? (10% discount if true)
    bool isSenior = true;        // Is the user a senior? (20% discount if true)

    // Check if the user is a student
    if (isStudent)
    {
        // If the user is also a senior
        if (isSenior)
        {
            printf("You got a student discount of 10%%\n");
            printf("You got a senior discount of 20%%\n");
            price *= 0.7;  // Apply combined discount: 10% + 20% = 30%
        }
        else
        {
            printf("You got a student discount of 10%%\n");
            price *= 0.9;  // Apply only student discount
        }
    }
    else
    {
        // If not a student, check if the user is a senior
        if (isSenior)
        {
            printf("You got a senior discount of 20%%\n");
            price *= 0.8;  // Apply only senior discount
        }
        // Else: no discounts applied
    }

    // Show final price after discounts
    printf("The price of the ticket is: $%.2f\n", price);

    return 0;
}
