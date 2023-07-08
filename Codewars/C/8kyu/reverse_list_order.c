#include <stdio.h>
#include <stdlib.h>

int *reverse_list(const int *array, size_t length)
{
    int *reversed_array = malloc(length * sizeof(int));
    for (size_t i = 0; i < length; i++)
    {
        reversed_array[i] = array[length - i - 1];
    }

    return reversed_array;
}

int main()
{
    int array[] = {1, 2, 3, 4, 5};
    size_t length = sizeof(array) / sizeof(array[0]);

    int *reversed = reverse_list(array, length);

    for (size_t i = 0; i < length; i++)
    {
        printf("%d", reversed[i]);
    }
    printf("\n");

    free(reversed);
    return 0;
}