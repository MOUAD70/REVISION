#include <stdio.h>
#include <math.h>

int main()
{
    int x = 0;
    int y = 0;
    char operator = '\0';
    float result = 0.0f;

    printf("---- Calculator Program ----\n");
    printf("Enter the first number (x): \n");
    scanf("%d", &x);

    printf("Enter the second number (y): \n");
    scanf("%d", &y);

    printf("Enter your operator (+, -, *, /): \n");
    scanf("%c", &operator);

    if (operator == '+')
    {
        result = x + y;
    }
    else if (operator == '-')
    {
        result = x - y;
    }
    else if (operator == '*')
    {
        result = x * y;
    }
    else
    {
        if (y == 0)
        {
            printf("You can't divide by 0");
        }
        else
        {
            result = x / y;
        }
    }

    printf("Result: %.2f", result);

    return 0;
}