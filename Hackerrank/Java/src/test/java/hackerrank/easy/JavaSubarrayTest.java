package hackerrank.easy;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class JavaSubarrayTest {

    @Test
    void subArray() throws IOException {
        Scanner sc = new Scanner(Path.of("sample/sub_array.txt"));

        /**
         * [1:1] => -2
         * [2:2] => -1
         * [0:1] => 1 + -2 = -1
         * [1:2] => -2 + -1 = -3
         * [0:2] => 1 + -2 + -1 = -2
         */
        int[] arr = new int[sc.nextInt()];
        int index = 0;
        while (sc.hasNext()) {
            arr[index] = sc.nextInt();
            index++;
        }
        int counter = 0;
        for (int k = 0; k < arr.length; k++) {
            int sum = 0;
            for (int j = k; j < arr.length; j++) {
                // 0 + 1 = 1
                // 1 + -2 = -1
                // -1 + -1 = -2
                // 0 + -2 = -2
                // -2 + -1 = -3
                // 0 + -1 = -1
                sum = sum + arr[j];
                if (sum < 0) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
