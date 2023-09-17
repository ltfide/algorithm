package com.example.easy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PalindromeNumber {

    public boolean isPalindrome(int num) {
        if (num < 0)
            return false;

        int originalNum = num;
        int reversedNum = 0;

        // Reverse the number
        while (num != 0) {
            int remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }

        return originalNum == reversedNum;
    }

    @Test
    void test() {
        assertTrue(isPalindrome(121));
        assertFalse(isPalindrome(123));
        assertFalse(isPalindrome(-123));
    }
}
