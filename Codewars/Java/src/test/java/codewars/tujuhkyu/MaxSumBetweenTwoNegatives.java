package codewars.tujuhkyu;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * @author Lutfi Dendiansyah
 * @created 30/04/2023 05:12
 */
public class MaxSumBetweenTwoNegatives {

    public static int maxSum(int[] arr) {
        boolean start = false;
        int sum = 0;
        int maxSum = -1;
        for (int curr : arr) {
            if (curr < 0) {
                if (start) {
                    maxSum = Math.max(maxSum, sum);
                    sum = 0;
                }
                start = true;
            } else {
                if (start) {
                    sum += Math.max(curr, 0);
                }
            }
        }
        return maxSum;
    }

    @Test
    void test() {
        int[] numbers = { 4, -1, 6, -2, 3, 5, -7, 7 };
        System.out.println(maxSum(numbers));
    }

    @Test
    void testBasic() {
        assertEquals(8, maxSum(new int[] { -1, 6, -2, 3, 5, -7 }));
        assertEquals(0, maxSum(new int[] { 5, -1, -2 }));
        assertEquals(-1, maxSum(new int[] { 1, -2 }));
    }
}
