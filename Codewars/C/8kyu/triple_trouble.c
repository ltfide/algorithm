#include <stdio.h>
#include <string.h>
#include <stdlib.h>

char *triple_trouble(const char *one, const char *two, const char *three)
{
    size_t length = strlen(one); // asumsing all inputs have the same length

    char *result = (char *)malloc((length * 3 + 1) * sizeof(char));
    size_t index = 0;

    for (size_t i = 0; i < length; i++)
    {
        result[index++] = one[i];
        result[index++] = two[i];
        result[index++] = three[i];
    }

    result[index] = '\0'; // add null-terminator at the end of the result string
    return result;
}

int main()
{
    const char *one = "aa";
    const char *two = "bb";
    const char *three = "cc";

    char *result = triple_trouble(one, two, three);
    printf("Output: %s\n", result);

    free(result);
    return 0;
}