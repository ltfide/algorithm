package codewars.enamkyu;

import org.junit.jupiter.api.Test;

/**
 * URL
 * https://www.codewars.com/kata/541c8630095125aba6000c00
 */
public class DigitalRoot {

    public static int digitalRoot(int n) {
        int result = 0;
        int i = 10;
        while (0 < n) {
            int x = n % i / (i / i);
            result += x;
            i *= i;
            n = n - x;
        }
        return result;
    }

    @Test
    void tests() {
        System.out.println(digitalRoot(16));
    }

}
