package com.example.easy;

import org.junit.jupiter.api.Test;

public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;

        return new StringBuilder(String.valueOf(x)).reverse().toString().equals(String.valueOf(x));
    }

    @Test
    void test() {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-123));
    }
}
