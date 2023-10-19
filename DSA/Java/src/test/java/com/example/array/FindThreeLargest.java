package com.example.array;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

/**
 * Find the largest three elements in an array
 */
public class FindThreeLargest {

    private void findLargestI(int[] arr, int arrSize) {
        int first, second, third;

        if (arrSize < 3) {
            System.out.println("Invalid Input");
            return;
        }

        first = second = third = Integer.MIN_VALUE;
        for (int i = 0; i < arrSize; i++) {

            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            } else if (arr[i] > second) {
                third = second;
                second = arr[i];
            } else if (arr[i] > third) {
                third = arr[i];
            }
        }

        System.out.println("The largest elements are " + first + " " + second + " " + third);

        /**
         * output
         * The largest elements are 35 34 13
         */
    }

    private void findLargestII(int[] arr, int arrSize) {
        Arrays.sort(arr);

        System.out.print(arr[arrSize - 1] + " ");
        System.out.print(arr[arrSize - 2] + " ");
        System.out.print(arr[arrSize - 3]);

        /**
         * output
         * 35 34 13
         */
    }

    @Test
    void test() {
        int arr[] = { 12, 13, 1, 10, 34, 35 };
        int n = arr.length;

        findLargestI(arr, n);
        findLargestII(arr, n);
    }
}
