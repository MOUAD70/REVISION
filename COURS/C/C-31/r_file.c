#include <stdio.h> // Required for file handling and I/O functions

int main()
{
    // Open the file "input.txt" in read mode ("r")
    FILE *pFile = fopen("input.txt", "r");

    // A buffer to temporarily store each line from the file (up to 1023 characters + '\0')
    char buffer[1024] = {0};

    // Check if the file was successfully opened
    if (pFile == NULL)
    {
        printf("We couldn't open the file :(\n");
        return 1; // Exit the program with an error code
    }

    // Read and print each line from the file until end of file (EOF)
    while (fgets(buffer, sizeof(buffer), pFile) != NULL) {
        printf("%s", buffer); // Output the content to the console
    }

    // Close the file to free system resources
    fclose(pFile);

    return 0;
}
