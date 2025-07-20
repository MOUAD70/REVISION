#include <stdio.h>

// Weight Conversion program.
int main()
{
    int choice = 0;
    float pounds = 0.0f;
    float kilograms = 0.0f;

    printf("---- Weight Conversion Program ----\n");
    printf("<-- 1 --> KG to POUNDS.\n");
    printf("<-- 2 --> POUNDS to KG.\n");
    printf("Enter your choice: ");
    scanf("%d", &choice);

    if (choice == 1)
    {
        // KG --> POUNDS
        printf("Enter the wight in KG: \n");
        scanf("%f", &kilograms);
        pounds = kilograms * 2.20462;
        printf("%.2f KG is equal to %.2f POUND\n", kilograms, pounds);
    }
    else if (choice == 2)
    {
        // POUNDS --> KG
        printf("Enter the wight in POUNDS: \n");
        scanf("%f", &pounds);
        kilograms = pounds / 2.20462;
        printf("%.2f POUNDS is equal to %.2f KG\n", pounds, kilograms);
    }
    else
    {
        // INVALID CHOICE
        printf("You have to choose either 1 or 2.\n");
    }

    return 0;
}