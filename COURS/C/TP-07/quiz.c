#include <stdio.h>     // For input/output functions
#include <ctype.h>     // For toupper() to handle lowercase answers

// Quiz game in C
int main()
{
    // Array of quiz questions
    char questions[][250] = {
        "What is the capital of Morocco?",
        "What is the largest planet in the solar system?",
        "What is the hottest planet?"};

    // Matching array of options for each question
    char options[][250] = {
        "A. Fes\nB. Dakhla\nC. Rabat\nD. Casablanca",
        "A. Jupiter\nB. Saturn\nC. Uranus\nD. Neptune",
        "A. Mercury\nB. Venus\nC. Earth\nD. Mars"};

    // Correct answers for each question
    char answerKey[] = {'C', 'A', 'B'};

    // Calculate the number of questions
    int length = sizeof(questions) / sizeof(questions[0]);

    char guess = '\0';  // Variable to store user’s answer
    int score = 0;      // To track number of correct answers

    printf("*** QUIZ GAME ***\n");

    // Loop through all questions
    for (int i = 0; i < length; i++)
    {
        // Print question and its options
        printf("\n%s\n", questions[i]);
        printf("\n%s\n", options[i]);

        // Ask for user’s answer
        printf("Enter your choice: ");
        scanf(" %c", &guess);  // Space before %c skips leftover newlines

        guess = toupper(guess);  // Convert guess to uppercase for consistency

        // Check if the guess is correct
        if (guess == answerKey[i])
        {
            printf("CORRECT!\n");
            score += 1;
        }
        else
        {
            printf("WRONG!\n");
        }
    }

    // Display final score
    printf("\n*** Your score is: %d/%d ***\n", score, length);

    return 0;
}
