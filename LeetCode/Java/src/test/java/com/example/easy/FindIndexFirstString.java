package com.example.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FindIndexFirstString {

    private int strStr(String haystack, String needle) {
        int haystackLen = haystack.length();
        int needleLen = needle.length();

        if (needleLen == 0)
            return 0;
        if (haystackLen < needleLen)
            return -1;

        for (int i = 0; i <= haystackLen - needleLen; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                String subStr = haystack.substring(i, i + needleLen);
                if (subStr.equals(needle))
                    return i;
            }
        }
        return -1;
    }

    @Test
    void test() {
        String haystack1 = "sadbutsad";
        String needle1 = "sad";
        assertEquals(0, strStr(haystack1, needle1));

        String haystack2 = "leetcode";
        String needle2 = "leeto";
        assertEquals(-1, strStr(haystack2, needle2));

        String haystack3 = "leetlutfiasd";
        String needle3 = "lutfi";
        assertEquals(4, strStr(haystack3, needle3));

        String haystack4 = "a";
        String needle4 = "a";
        assertEquals(0, strStr(haystack4, needle4));
    }
}
