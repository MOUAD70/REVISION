#include <stdio.h>
#include <stdlib.h>

int main() {

    // calloc() = Contiguous Allocation.
    //            Allocates memory dynamically and initializes all bytes to 0.
    //            malloc() is slightly faster, but calloc() reduces the risk of bugs.
    //            Syntax: calloc(number_of_elements, size_of_each_element)

    int number = 0;
    printf("Enter the number of players: ");
    scanf("%d", &number); // Ask the user how many scores to store

    // Allocate memory for 'number' of integers, all initialized to 0
    int *scores = calloc(number, sizeof(int));

    // Check if memory allocation failed
    if (scores == NULL) {
        printf("Memory allocation failed!\n");
        return 1;
    }

    // Input scores from the user
    for (int i = 0; i < number; i++) {
        printf("Enter score #%d: ", i + 1);
        scanf("%d", &scores[i]);
    }

    // Print all the scores
    printf("\nScores entered: ");
    for (int i = 0; i < number; i++) {
        printf("%d ", scores[i]);
    }

    // Free the allocated memory and reset the pointer
    free(scores);
    scores = NULL;

    return 0;
}
