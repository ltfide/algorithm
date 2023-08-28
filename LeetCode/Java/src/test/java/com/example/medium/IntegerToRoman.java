package com.example.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class IntegerToRoman {

    private String intToRoman(int num) {
        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

        StringBuilder sb = new StringBuilder();

        int index = 0;
        while (num > 0) {
            if (values[index++] <= num) {
                sb.append(symbols[--index]);
                num -= values[index];
            }
        }
        return sb.toString();
    }

    @Test
    void test() {
        int sample1 = 3;
        int sample2 = 58;
        int sample3 = 1994;

        assertEquals("III", intToRoman(sample1));
        assertEquals("LVIII", intToRoman(sample2));
        assertEquals("MCMXCIV", intToRoman(sample3));
    }
}
