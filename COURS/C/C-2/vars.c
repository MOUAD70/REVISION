#include <stdio.h>
#include <stdbool.h>

// Variables in C
int main()
{
    // Integer variables
    int age = 20;

    // Float variables
    float gpa = 2.5;

    // Double variables (used to store floating-point (decimal) numbers with double precision, it is more precise than float)
    double pi = 3.141592653589793; // We can store 15 ~ 16 digit after the decimal

    // Character variabled (used to store a single character)
    // (must be written inside single quotes)
    char grade = 'A';
    char symbol = '!';
    char currency = '$';

    // String variables
    char name[] = "MOUNJIB Mouad";
    char email[] = "mouad@example.com";

    // Boolean variables
    bool isOnline = false;

    printf("Hey, i'm %d years old , my gpa is: %.1f \n", age, gpa);

    // Default C behaviour is to display 6 digits after the decimal so we need to configure it manually
    printf("The value of pi is %.15lf \n", pi); // %lf => long float => double

    // Displaying character variables
    printf("My grade is %c \n", grade);
    // To display the ASCII value of this character
    printf("The ASCII value of %c is %d \n", grade, grade);

    // Display string variables
    printf("Hey, my full name is %s, feel free to check my email: %s \n", name, email);

    // Display boolean variables
    // printf("Is my facebook account online: %d", isOnline); (normal procedure returns 0 => false, 1 => true)
    if (isOnline)
    {
        printf("Is my facebook account online: True");
    }
    else
    {
        printf("Is my facebook account online: False");
    }

    return 0;
}