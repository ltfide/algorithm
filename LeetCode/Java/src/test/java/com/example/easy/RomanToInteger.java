package com.example.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class RomanToInteger {

    public char charAt(String s, int i) {
        if (s.length() <= i)
            return '0';

        return s.charAt(i);
    }

    public int romanToInt(String s) {
        int output = 0;

        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        for (int i = 0; i < s.length(); i++) {
            char in = s.charAt(i);
            if (in == 'I') {
                if (charAt(s, i + 1) == 'V') {
                    output += map.get(charAt(s, i + 1)) - map.get(in);
                    i++;
                } else if (charAt(s, i + 1) == 'X') {
                    output += map.get(charAt(s, i + 1)) - map.get(in);
                    i++;
                } else {
                    output += map.get(in);
                }
            } else if (in == 'X') {
                if (charAt(s, i + 1) == 'L') {
                    output += map.get(charAt(s, i + 1)) - map.get(in);
                    i++;
                } else if (charAt(s, i + 1) == 'C') {
                    output += map.get(charAt(s, i + 1)) - map.get(in);
                    i++;
                } else {
                    output += map.get(in);
                }
            } else if (in == 'C') {
                if (charAt(s, i + 1) == 'D') {
                    output += map.get(charAt(s, i + 1)) - map.get(in);
                    i++;
                } else if (charAt(s, i + 1) == 'M') {
                    output += map.get(charAt(s, i + 1)) - map.get(in);
                    i++;
                } else {
                    output += map.get(in);
                }
            } else {
                output += map.get(in);
            }
        }

        return output;
    }

    public int romanToIntOpt(String s) {
        int[] values = new int[26]; // Maksimum 26 karakter (A-Z)
        values['I' - 'A'] = 1;
        values['V' - 'A'] = 5;
        values['X' - 'A'] = 10;
        values['L' - 'A'] = 50;
        values['C' - 'A'] = 100;
        values['D' - 'A'] = 500;
        values['M' - 'A'] = 1000;

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int currentVal = values[s.charAt(i) - 'A'];

            if (i < s.length() - 1) {
                int nextVal = values[s.charAt(i + 1) - 'A'];

                if (currentVal < nextVal) {
                    result -= currentVal;
                } else {
                    result += currentVal;
                }
            } else {
                result += currentVal;
            }
        }

        return result;
    }

    @Test
    void test() {
        String sample1 = "III";
        String sample2 = "LVIII";
        String sample3 = "MCMXCIV";
        System.out.println('I' - 'A');

        System.out.println(romanToIntOpt(sample1));
        System.out.println(romanToIntOpt(sample2));
        System.out.println(romanToIntOpt(sample3));

        assertEquals(3, romanToInt(sample1));
        assertEquals(58, romanToInt(sample2));
        assertEquals(1994, romanToInt(sample3));
    }
}
