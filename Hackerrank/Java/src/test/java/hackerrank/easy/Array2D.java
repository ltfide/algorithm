package hackerrank.easy;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class Array2D {

    public static void solution() throws IOException {
        File file = new File("sample2.txt");
        Scanner scanner = new Scanner(file);

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2]
                        + arr[i + 1][j + 1] +
                        arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                maxSum = Math.max(maxSum, sum);
            }
        }

        List<List<Integer>> arr2 = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < 6; j++) {
                temp.add(arr[i][j]);
            }
            arr2.add(temp);
        }

        int maxSum2 = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int sum = arr2.get(i).get(j) + arr2.get(i).get(j + 1) + arr2.get(i).get(j + 2)
                        + arr2.get(i + 1).get(j + 1)
                        + arr2.get(i + 2).get(j) + arr2.get(i + 2).get(j + 1) + arr2.get(i + 2).get(j + 2);
                maxSum2 = Math.max(maxSum2, sum);
            }
        }

        System.out.println(maxSum2);

        scanner.close();
    }

    @Test
    void testName() throws IOException {
        solution();
    }
}
