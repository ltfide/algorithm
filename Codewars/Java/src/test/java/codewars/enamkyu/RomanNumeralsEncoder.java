package codewars.enamkyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * URL:
 * https://www.codewars.com/kata/51b62bf6a9c58071c600001b/train/java
 */
public class RomanNumeralsEncoder {

    /**
     * 1990 => 1000 = M, 900 = CM, 90 = XC => MCMXC
     * 2008 => 2000 = MM, 8 = VIII => MMVIII
     * Symbol Value
     * I => 1
     * V => 5
     * X => 10
     * L => 50
     * C => 100
     * D => 500
     * M => 1,000
     */
    public static String solution(int n) {
        StringBuilder sb = new StringBuilder();
        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

        int index = 0;
        while (n > 0) {
            if (n >= values[index++]) {
                sb.append(symbols[--index]);
                n -= values[index];
            }
        }

        return sb.toString();
    }

    @Test
    void tests() {
        System.out.println(solution(1990));
    }

    @Test
    void shouldConvertToRoman() {
        assertEquals("I", solution(1));
        assertEquals("IV", solution(4));
        assertEquals("VI", solution(6));
    }

}
