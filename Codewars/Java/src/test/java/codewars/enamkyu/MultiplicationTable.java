package codewars.enamkyu;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

/**
 * URL
 * https://www.codewars.com/kata/534d2f5b5371ecf8d2000a08
 */
public class MultiplicationTable {

    /**
     * size = 3
     * [1,2,3]
     * [2,4,6]
     * [3,6,9]
     */
    public static int[][] multiplicationTable(int n) {
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = (i + 1) * (j + 1);
            }
        }
        return result;
    }

    @Test
    void tests() {
        System.out.println(multiplicationTable(3));
    }

    @Test
    void testMultiplicationTable() {
        int[][] test = { { 1, 2, 3 }, { 2, 4, 6 }, { 3, 6, 9 } };
        assertArrayEquals(test, multiplicationTable(3));

        int[][] test1 = { { 1 } };
        assertArrayEquals(test1, multiplicationTable(1));
    }

    @Test
    void showNestedArray() {
        int[][] arr = { { 1, 2, 3 }, { 2, 4, 6 }, { 3, 6, 9 } };

        for (int[] is : arr) {
            System.out.println(Arrays.toString(is));
        }
    }

}
