#include <stdio.h>

// Function declarations
void checkBalance(float balance);
float deposit();
float withdraw(float balance);

// Banking program in C
int main()
{
    int choice = 0;
    float balance = 0.0f;

    printf("*** Welcome to the Bank ***");

    do
    {
        // Display menu
        printf("\n\n-- Select an option: --\n");
        printf("1. Check balance\n");
        printf("2. Deposit money\n");
        printf("3. Withdraw money\n");
        printf("4. Exit\n");

        printf("Enter your choice: ");
        scanf("%d", &choice);

        // Handle user choice
        switch (choice)
        {
        case 1:
            checkBalance(balance);
            break;
        case 2:
            balance += deposit();
            break;
        case 3:
            balance -= withdraw(balance);
            break;
        case 4:
            printf("\nThank you for using the bank!\n");
            break;
        default:
            printf("\nInvalid choice. Please select 1 - 4.\n");
            break;
        }
    } while (choice != 4);

    return 0;
}

// Function to display the current balance
void checkBalance(float balance)
{
    printf("Your current balance is: $%.2f\n", balance);
}

// Function to handle deposit
float deposit()
{
    float amount = 0.0f;
    printf("Enter the amount to deposit: $");
    scanf("%f", &amount);

    if (amount <= 0)
    {
        printf("Invalid amount! Deposit must be positive.\n");
        return 0.0f;
    }

    printf("Successfully deposited $%.2f\n", amount);
    return amount;
}

// Function to handle withdrawal
float withdraw(float balance)
{
    float amount = 0.0f;
    printf("Enter the amount to withdraw: $");
    scanf("%f", &amount);

    if (amount <= 0)
    {
        printf("Invalid amount. Withdrawal must be positive.\n");
        return 0.0f;
    }
    else if (amount > balance)
    {
        printf("Insufficient balance.\n");
        return 0.0f;
    }

    printf("Successfully withdrawn $%.2f\n", amount);
    return amount;
}
