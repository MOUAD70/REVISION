#include <stdio.h>
#include <stdlib.h>

int main() {

    // malloc() = a function in C that dynamically allocates 
    //            a specified number of bytes in memory

    int number = 0;
    printf("Enter the number of grades: ");
    scanf("%d", &number); // Ask user how many grades they want to enter

    // Allocate memory to store 'number' of grades (as characters)
    char *grades = malloc(number * sizeof(char));

    // Check if memory allocation failed
    if (grades == NULL) {
        printf("Memory allocation failed!\n");
        return 1;
    }

    // Loop to input each grade
    for (int i = 0; i < number; i++) {
        printf("Enter grade #%d: ", i + 1);
        scanf(" %c", &grades[i]); // Space before %c skips leftover newline
    }

    // Display all grades entered
    for (int i = 0; i < number; i++) {
        printf("%c ", grades[i]);
    }

    // Free the allocated memory
    free(grades); // release the memory back to the system
    grades = NULL; // good practice to avoid dangling pointer

    return 0;
}
