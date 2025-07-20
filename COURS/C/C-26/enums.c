#include <stdio.h>

// Define an enum to represent the days of the week
enum Day
{
    SUNDAY,     // 0
    MONDAY,     // 1
    TUESDAY,    // 2
    WEDNESDAY,  // 3
    THURSDAY,   // 4
    FRIDAY,     // 5
    SATURDAY    // 6
};

int main()
{
    // Set the current day to SUNDAY
    enum Day today = SUNDAY;

    // Check if today is the weekend (Sunday or Saturday)
    (today == SUNDAY || today == SATURDAY)
        ? printf("WEEK-END")
        : printf("WEEK-DAY");

    return 0;
}
