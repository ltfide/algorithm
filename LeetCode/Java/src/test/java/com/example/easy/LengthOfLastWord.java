package com.example.easy;

import org.junit.jupiter.api.Test;

public class LengthOfLastWord {

    private int lengthOfLastWord(String s) {
        String[] words = s.trim().split(" ");
        String lastWord = words[words.length - 1];

        return lastWord.length();
    }

    @Test
    void test() {
        lengthOfLastWord("   fly me   to   the moon  ");
    }
}
