#include <stdio.h> // For input/output functions like printf and scanf

// Calculator program using if-else conditions
int main()
{
    char operator = '\0'; // Variable to store the operator (+, -, *, /), initialized to null char
    double x = 0;         // First number (double to allow decimals)
    double y = 0;         // Second number
    double result = 0.0;  // To store the result of the calculation

    // User interface
    printf("---- Calculator Program ----\n");

    // Get first number from user
    printf("Enter the first number (x): \n");
    scanf("%lf", &x); // %lf for reading a double

    // Get operator from user
    printf("Enter your operator (+, -, *, /): \n");
    scanf(" %c", &operator); // Notice the space before %c to skip any leftover newline

    // Get second number from user
    printf("Enter the second number (y): \n");
    scanf("%lf", &y);

    // METHOD 1:
    // if (operator == '+')
    // {
    //     result = x + y;
    // }
    // else if (operator == '-')
    // {
    //     result = x - y;
    // }
    // else if (operator == '*')
    // {
    //     result = x * y;
    // }
    // else if (operator == '/')
    // {
    //     if (y == 0)
    //     {
    //         printf("You can't divide by 0\n");
    //     }
    //     else
    //     {
    //         result = x / y;
    //     }
    // }
    // else
    // {
    //     // If the user entered an invalid operator
    //     printf("Invalid operator.\n");
    //     return 1;
    // }

    // METHOD 2:
    switch (operator)
    {
    case '+':
        result = x + y;
        break;
    case '-':
        result = x - y;
        break;
    case '*':
        result = x * y;
        break;
    case '/':
        if (y == 0)
        {
            printf("You can't divide by zero!\n");
        }
        else
        {
            result = x / y;
        }
        break;

    default:
        printf("Invalid operator.\n");
        break;
    }

    // Print the result with 2 decimal places
    printf("Result: %.2lf\n", result);

    return 0;
}
