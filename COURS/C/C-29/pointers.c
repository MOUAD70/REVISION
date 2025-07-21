#include <stdio.h> // For printf function

// Function prototype that takes a pointer to an integer (age)
void birthday(int *age);

int main()
{
    int age = 20;     // Declare and initialize an integer variable 'age'
    int *pAge = &age; // Declare a pointer 'pAge' and store the address of 'age'

    birthday(pAge);                     // Call the birthday function, passing the pointer or the memory adress
    printf("You're %d years old", age); // Print the updated age

    return 0;
}

// Function definition that increments the value at the memory address
void birthday(int *age)
{
    (*age)++; // Dereference the pointer and increment the value (age++)
}
