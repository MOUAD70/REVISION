#include <stdio.h> // For printf function

// Define a structure to represent a car
typedef struct
{
    char model[25]; // Car model (string)
    int year;       // Manufacturing year
    int price;      // Price in dollars
} Car;

int main()
{
    // Initialize an array of Car structures
    Car cars[] = {
        {"Mustang", 2025, 32000},
        {"Corvette", 2026, 68000},
        {"Challenger", 2024, 29000}};

    // Loop through the array and print each car's information
    for (int i = 0; i < sizeof(cars) / sizeof(cars[0]); i++)
    {
        printf("%s %d $%d\n", cars[i].model, cars[i].year, cars[i].price);
    }

    return 0;
}
