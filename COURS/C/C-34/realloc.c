#include <stdio.h>
#include <stdlib.h>

int main()
{

    // realloc() = Reallocation.
    //             Permet de redimensionner un bloc de mémoire précédemment alloué.
    //             Syntaxe : realloc(ptr, nombre_de_bytes)

    int number = 0;
    printf("Enter the number of prices: ");
    scanf("%d", &number);

    // Allocation dynamique initiale avec malloc()
    float *prices = malloc(number * sizeof(float));

    // Vérification si l'allocation a échoué
    if (prices == NULL)
    {
        printf("Memory allocation failed!\n");
        return 1;
    }

    // Remplir le tableau avec les prix initiaux
    for (int i = 0; i < number; i++)
    {
        printf("Enter price #%d: ", i + 1);
        scanf("%f", &prices[i]);
    }

    int newNumber = 0;
    printf("Enter a new number of prices: ");
    scanf("%d", &newNumber);

    // Réallocation de mémoire avec realloc()
    float *temp = realloc(prices, newNumber * sizeof(float));

    // Vérifier si la réallocation a échoué
    if (temp == NULL)
    {
        printf("Could not reallocate memory!\n");
    }
    else
    {
        // Si succès, on assigne le nouveau pointeur à prices
        prices = temp;
        temp = NULL; // on évite les pointeurs suspendus

        // On demande les nouvelles valeurs si la taille a augmenté
        for (int i = number; i < newNumber; i++)
        {
            printf("Enter price #%d: ", i + 1);
            scanf("%f", &prices[i]);
        }

        // Affichage de tous les prix
        for (int i = 0; i < newNumber; i++)
        {
            printf("$%.2f ", prices[i]);
        }
    }

    // Libération de la mémoire
    free(prices);
    prices = NULL;

    return 0;
}
