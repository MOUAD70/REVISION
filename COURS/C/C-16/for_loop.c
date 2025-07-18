#include <stdio.h>   // For input/output functions like printf
#include <windows.h> // For Sleep() function (Windows only)

// Countdown using a for loop in c.
int main()
{
    // Loop from 10 down to 0
    for (int i = 10; i >= 0; i--)
    {
        Sleep(1000);       // Wait 1 second (1000 ms)
        printf("%d\n", i); // Print the current number
    }

    printf("Happy New Year!!"); // Print celebration message

    return 0;
}
