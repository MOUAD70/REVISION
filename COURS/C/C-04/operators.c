#include <stdio.h>

// Arithmetic operators
int main()
{
    int x = 4;
    int y = 2;
    int sum = 0;
    int subtraction = 0;
    int multiplication = 0;
    int division = 0;
    float module = 0;

    // ( + , - , * , / )

    sum = x + y;
    subtraction = x - y;
    multiplication = x * y;
    division = x / y;
    module = x % y;

    printf("Result: %d\n", sum);
    printf("Result: %d\n", subtraction);
    printf("Result: %d\n", multiplication);
    printf("Result: %d\n", division);
    printf("Result: %d\n", module);

    // Increment x++ => x = x + 1
    x++;
    printf("%d\n", x);
    // Decrement x-- => x = x - 1
    x--;
    printf("%d\n", x);

    // Shortcuts
    x += 2; // x = x + 2
    x -= 2; // x = x - 2
    x *= 2; // x = x * 2
    x /= 2; // x = x / 2

    return 0;
}