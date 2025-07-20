#include <stdio.h>

void checkBalance(float balance);
float deposit();
float withdraw(float balance);

// Bancking program in c.
int main()
{
    int choice = 0;
    float balance = 0.0f;

    printf("*** Welcome to the bank ***");

    do
    {
        printf("\n-- Select an option: --\n");
        printf("1. Check balance\n");
        printf("2. Deposit money\n");
        printf("3. Withdraw money\n");
        printf("4. exit\n");

        printf("Enter you choice: \n");
        scanf("%d", &choice);

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
            printf("\nInvalid choice please select 1 - 4\n");
            break;
        }
    } while (choice != 4);

    return 0;
}

void checkBalance(float balance)
{
    printf("Your current balance is: $%.2f", balance);
}
float deposit()
{
    float amount = 0.0f;
    printf("Enter the amount to deposit: $");
    scanf("%f", &amount);

    if (amount < 0)
    {
        printf("Invalid amount!\n");
        return 0.0f;
    }
    else
    {
        printf("Successfully deposited $%.2f", amount);
        return amount;
    }
}
float withdraw(float balance)
{
    float amount = 0.0f;
    printf("Enter the amount to whithdray: $");
    scanf("%f", &amount);

    if (amount < 0)
    {
        printf("Invalid amount.\n");
        return 0.0f;
    }
    else if (amount > balance)
    {
        printf("You don't have enough balance.\n");
        return 0.0f;
    }
    else
    {
        printf("Successfully whitdrawed $%.2f", amount);
        return amount;
    }
}