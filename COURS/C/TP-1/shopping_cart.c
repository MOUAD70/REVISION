#include <stdio.h>
#include <string.h>

// Shopping cart program
int main()
{
    char item[50] = "";
    float price = 0.0f;
    int quantity = 0;
    float result = 0.0f;
    char currency = '$';

    printf("What item would you like to buy ? ");
    fgets(item, sizeof(item), stdin);
    item[strlen(item) - 1] = '\0';

    printf("What is the price for each ? ");
    scanf("%f", &price);

    printf("How many would you like ? ");
    scanf("%d", &quantity);

    result = price * quantity;
    printf("you have bought %d %s(s)\n", quantity, item);
    printf("Your total is: %c%.2f", currency, result);

    return 0;
}