package codewars.tujuhkyu;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * @author Lutfi Dendiansyah
 * @created 05:09
 */
public class ValidParentheses {

    public static boolean validParentheses(String str) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                counter++;
            } else {
                counter--;
            }
            if (counter == -1) return false;
        }
        return counter == 0;
    }

    @Test
    void test() {
        assertTrue(validParentheses(""));
        assertTrue(validParentheses("()"));
        assertTrue(validParentheses("((()))"));
        assertTrue(validParentheses("()()()"));
        assertTrue(validParentheses("(()())()"));
        assertTrue(validParentheses("()(())((()))(())()"));

        assertFalse(validParentheses(")("));
        assertFalse(validParentheses("()()("));
        assertFalse(validParentheses("((())"));
        assertFalse(validParentheses("())(()"));
        assertFalse(validParentheses(")()"));
        assertFalse(validParentheses(")"));
    }
}
