#include <stdio.h>
#include <stdlib.h>
#include <time.h>

// Pseudo random numbers in c.
int main()
{
    srand(time(NULL));  // Seed random number generator

    int min = 1, max = 10;

    // Generate random number between min and max inclusive
    int randomNum = (rand() % max) + min;

    printf("%d", randomNum);

    return 0;
}
