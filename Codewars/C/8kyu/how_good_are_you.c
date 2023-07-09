#include <stdio.h>
#include <stdbool.h>

bool better_than_average(const int class_points[], int class_size, int your_point)
{
    int sum = 0;

    for (int i = 0; i < class_size; i++)
    {
        sum += class_points[i];
    }

    int average = sum / class_size;
    return average < your_point;
}

int main()
{
    int array[] = {1, 2, 3, 4, 5};
    int size = 5;
    int your_point = 2;

    printf("result: %d\n", better_than_average(array, size, your_point));

    return 0;
}