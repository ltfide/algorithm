#include <stdio.h>
#include <ctype.h>

char *make_upper_case(char *string)
{
    char *ptr = string;

    while (*ptr != '\0')
    {
        *ptr = toupper(*ptr);
        ptr++;
    }
    return string;

    /**
     * solution without ctype.h
     *  int i = 0;

        while (string[i])
        {
            if (string[i] >= 'a' && string[i] <= 'z')
                string[i] -= 32;
            i++;
        }
        return string;
    */
}

int main()
{
    char hello[] = "hello";
    printf("lowercase: %s\n", hello);
    printf("uppercase: %s\n", make_upper_case(hello));

    return 0;
}