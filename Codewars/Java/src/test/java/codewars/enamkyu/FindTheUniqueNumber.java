package codewars.enamkyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

/*
 * URL
 * https://www.codewars.com/kata/585d7d5adb20cf33cb000235
 */
public class FindTheUniqueNumber {

    public static double findUniq(double arr[]) {
        Arrays.sort(arr); // [0.0, 0.0, 1.0]
        if (arr[0] != arr[1]) {
            return arr[0];
        }
        return arr[arr.length - 1];
    }

    @Test
    void tests() {
        System.out.println(findUniq(new double[] { 0, 1, 0 }));
        System.out.println(findUniq(new double[] { 0, 1, 1 }));
    }

    @Test
    public void sampleTestCases() {
        assertEquals(1.0, findUniq(new double[] { 0, 1, 0 }));
        assertEquals(2.0, findUniq(new double[] { 1, 1, 1, 2, 1, 1 }));
    }

}
