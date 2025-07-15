#include <stdio.h> // Standard I/O library for printf and scanf

// switch-case to print day of the week based on a number
int main()
{
    int daysOfWeek = 0; // Variable to store the number representing a day (1 to 7)

    printf("Enter a number (1-7): ");
    scanf("%d", &daysOfWeek); // Read the number from user input

    // Switch statement to match the number with a day
    switch (daysOfWeek)
    {
    case 1:
        printf("Monday.");
        break; // Exit the switch once a case is matched
    case 2:
        printf("Tuesday.");
        break;
    case 3:
        printf("Wednesday.");
        break;
    case 4:
        printf("Thursday.");
        break;
    case 5:
        printf("Friday.");
        break;
    case 6:
        printf("Saturday.");
        break;
    case 7:
        printf("Sunday.");
        break;

    // This block runs if none of the above cases matched (invalid input)
    default:
        printf("The number should be between 1 and 7.");
    }

    return 0;
}
