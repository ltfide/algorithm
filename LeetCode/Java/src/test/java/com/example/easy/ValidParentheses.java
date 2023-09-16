package com.example.easy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Stack;

import org.junit.jupiter.api.Test;

public class ValidParentheses {

    private boolean isValid(String s) {
        char[] ar = new char[s.length()];

        int i = 0;
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                ar[i++] = c;
            } else if (c == ')' || c == ']' || c == '}') {
                if (i == 0)
                    return false;

                if (c == ')' && ar[--i] != '(' ||
                        c == ']' && ar[--i] != '[' ||
                        c == '}' && ar[--i] != '{') {
                    return false;
                }
            }
        }
        return i == 0;
    }

    private boolean isValidWithStack(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }

        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }

                char openBracket = stack.pop();
                if ((c == ')' && openBracket != '(') ||
                        (c == ']' && openBracket != '[') ||
                        (c == '}' && openBracket != '{')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    @Test
    void test() {
        String test1 = "()";
        String test2 = "()[]{}";
        String test3 = "[}";
        String test4 = "([)]";
        String test5 = "[[{}]]";
        String test6 = "{[]}";

        assertTrue(isValid(test1));
        assertTrue(isValid(test2));
        assertTrue(isValid(test5));
        assertTrue(isValid(test6));

        assertFalse(isValid(test3));
        assertFalse(isValid(test4));
    }

    @Test
    void testWithStack() {
        String test1 = "()";
        String test2 = "()[]{}";
        String test3 = "[}";
        String test4 = "([)]";
        String test5 = "[[{}]]";
        String test6 = "{[]}";

        assertTrue(isValidWithStack(test1));
        assertTrue(isValidWithStack(test2));
        assertTrue(isValidWithStack(test5));
        assertTrue(isValidWithStack(test6));

        assertFalse(isValidWithStack(test3));
        assertFalse(isValidWithStack(test4));
    }

}
