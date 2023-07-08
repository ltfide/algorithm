#include <stdio.h>
#include <stddef.h>

size_t str_count(const char *str, char letter)
{
    int counter = 0;
    for (size_t i = 0; str[i] != '\0'; i++)
    {
        if (str[i] == letter)
        {
            counter++;
        }
    }

    return counter;
}

int main()
{
    printf("%d\n", str_count("", 'l'));
    printf("%d\n", str_count("hello", 'l'));
    return 0;
}