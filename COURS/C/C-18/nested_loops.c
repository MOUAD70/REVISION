#include <stdio.h>

// Nested loops in c.
int main()
{
    for (int i = 1; i < 10; i++) // Outer loop: numbers 1 to 9
    {
        printf("------ Multiplication table of %d ------\n", i);
        for (int j = 1; j < 10; j++) // Inner loop: numbers 1 to 9
        {
            printf("%d x %d = %d\n", i, j, i * j);
        }
    }

    return 0;
}
