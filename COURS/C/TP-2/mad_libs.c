#include <stdio.h>
#include <string.h>

// Mad libs program
int main()
{
    char noun[50] = "";
    char verb[50] = "";
    char adv1[50] = "";
    char adv2[50] = "";
    char adv3[50] = "";

    printf("enter an adjective (description): ");
    fgets(adv1, sizeof(adv1), stdin);
    adv1[strlen(adv1) - 1] = '\0';

    printf("enter a noun (animal or person): ");
    fgets(noun, sizeof(noun), stdin);
    noun[strlen(noun) - 1] = '\0';

    printf("enter an adjective (description): ");
    fgets(adv2, sizeof(adv2), stdin);
    adv2[strlen(adv2) - 1] = '\0';

    printf("enter a verb (ending w/ -ing): ");
    fgets(verb, sizeof(verb), stdin);
    verb[strlen(verb) - 1] = '\0';


    printf("enter an adjective (description): ");
    fgets(adv3, sizeof(adv3), stdin);
    adv3[strlen(adv3) - 1] = '\0';

    printf("\nToday i went to a %s zoo.\n", adv1);
    printf("In an exhibit, I saw a %s.\n", noun);
    printf("%s was %s and %s.\n", noun, adv2, verb);
    printf("I was %s.\n", adv3);
    
    return 0;
}