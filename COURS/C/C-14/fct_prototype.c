#include <stdio.h>      // For printf
#include <stdbool.h>    // For bool type

// Function prototypes in c.
void hello(char name[], int age);
bool ageCheck(int age);

int main() {
    hello("Spongebob", 30); // Greet the user

    // Check age eligibility
    if(ageCheck(14)) {
        printf("You are old enough to work at the Krusty Krab");
    }
    else {
        printf("You must be 16+ to work at the Krusty Krab");
    }

    return 0;
}

// Prints a greeting
void hello(char name[], int age) {
    printf("Hello %s\n", name);
    printf("You are %d years old\n", age);
}

// Returns true if age >= 16
bool ageCheck(int age) {
    return age >= 16;
}
