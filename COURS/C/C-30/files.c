#include <stdio.h> // For file handling and printf

int main()
{
    // Open (or create) a file called "output.txt" for writing ("w" mode)
    FILE *pFile = fopen("output.txt", "w");

    // Text that we want to write into the file
    char text[] = "Hi, I am writing this text from C language.\n";

    // Check if the file couldn't be opened
    if (pFile == NULL)
    {
        printf("We couldn't open the file :(\n");
        return 1; // Exit the program with error
    }

    // Write the text to the file
    fprintf(pFile, "%s", text);

    // Always close the file after you're done
    fclose(pFile);

    return 0;
}
