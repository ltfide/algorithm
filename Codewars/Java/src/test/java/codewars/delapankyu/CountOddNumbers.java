package codewars.delapankyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CountOddNumbers {

    /**
     * 7 -> 3 (because odd numbers below 7 are [1, 3, 5])
     * 15 -> 7 (because odd numbers below 15 are [1, 3, 5, 7, 9, 11, 13])
     */
    public static int oddCount(int n) {
        return n / 2;
    }

    @Test
    void tests() {
        System.out.println(oddCount(7));
        System.out.println(oddCount(15));
        System.out.println(oddCount(15023));
    }

    @Test
    public void fixedTests() {
        assertEquals(7, oddCount(15));
        assertEquals(7511, oddCount(15023));
    }

}
