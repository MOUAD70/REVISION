#include <stdio.h>   
#include <math.h>    // Includes the Math library.

// Math functions in c.
int main()
{
    int x = 2;
    float y = 3.14;

    // x = sqrt(x);       // Calculates the square root of x (√x), returns a float but here stored as int (bad practice)
    // x = pow(x, 2);     // Raises x to the power of 2 (x^2), also returns float
    // x = abs(x);        // Returns the absolute value of x (removes any negative sign)
    // x = log(x);        // Calculates the natural logarithm (base e) of x
    // x = sin(x);        // Calculates the sine of x (x in radians)
    // x = cos(x);        // Calculates the cosine of x (x in radians)
    // x = tan(x);        // Calculates the tangent of x (x in radians)

    // All of the above math functions return **float or double**, 
    // but you're assigning the result to an int (which truncates the decimal part), 
    // so it's better to use a float/double variable instead.

    // y = round(y);      // Rounds y to the nearest integer (returns double)
    // y = ceil(y);       // Rounds y **up** to the nearest integer
    // y = floor(y);      // Rounds y **down** to the nearest integer

    // printf("%d", x);
    printf("%f", y);

    return 0;
}
