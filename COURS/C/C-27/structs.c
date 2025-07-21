#include <stdio.h>
#include <stdbool.h> // For using true/false
#include <string.h>  // For string functions like strcpy()

// Define a new structure type called "Student"
typedef struct
{
    char name[50];   // Student's name (string up to 49 characters + null terminator)
    int age;         // Student's age
    float gpa;       // Student's grade point average
    bool isFullTime; // Whether the student is full-time (true/false)
} Student;

int main()
{
    // Create a student and initialize directly
    Student student1 = {"Mouad", 20, 3, true};

    // Create an empty student (all fields default to 0/false/empty)
    Student student2 = {0};

    // Set values manually
    strcpy(student2.name, "Simo"); // Set name
    student2.age = 21;             // Set age
    student2.gpa = 3.5;            // Set GPA
    student2.isFullTime = true;    // Set full-time status

    // Print student2 information
    printf("%s\n", student2.name);                      // Output: Simo
    printf("%d\n", student2.age);                       // Output: 21
    printf("%.1f\n", student2.gpa);                     // Output: 3.5
    printf("%s\n", student2.isFullTime ? "Yes" : "No"); // Output: Yes

    return 0;
}
