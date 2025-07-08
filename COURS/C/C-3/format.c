#include <stdio.h>

// Format specifier in C
int main()
{
    // Width
    int num = 1;
    int sec_num = -10;

    // This specifies the minimum number of characters to print
    printf("%3d\n", num);

    // This specifies the minimum number of characters to print but left specified
    printf("%-3d\n", num);

    // Rather than having spaces before the value we'll have zero's
    printf("%03d\n", num);

    // Show the sign of the number, whether it’s positive or negative
    printf("%+d\n", sec_num);

    // Presicion
    float price = 19.99;

    // Amount of digits to display after the decimal
    printf("%.2f\n", price);

    // Minimum amount/width to display + the sign
    printf("%+7.2f\n", price);

    return 0;
}