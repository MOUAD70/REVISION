#include <stdio.h>

// 2D arrays in c.
int main()
{
    // Declare and initialize a 2D array with 2 rows and 3 columns
    int numbers[][3] = {
        {1, 2, 3},
        {4, 5, 6}};

    // Loop through each row
    for (int i = 0; i < 2; i++)
    {
        // Loop through each column of the current row
        for (int j = 0; j < 3; j++)
        {
            // Print the current element followed by a space
            printf("%d ", numbers[i][j]);
        }
        printf("\n");
    }

    return 0;
}
