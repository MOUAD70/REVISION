#include <stdio.h>

int main()
{
    // Create an array of 5 integers and initialize all to 0
    int scores[5] = {0};

    // Get the number of elements in the array
    int length = sizeof(scores) / sizeof(scores[0]);

    // Loop to fill the array with user input
    for (int i = 0; i < length; i++)
    {
        printf("Enter a score: ");
        scanf("%d", &scores[i]);
    }

    // Loop to print the scores entered
    for (int i = 0; i < length; i++)
    {
        printf("%d ", scores[i]);
    }

    return 0;
}
