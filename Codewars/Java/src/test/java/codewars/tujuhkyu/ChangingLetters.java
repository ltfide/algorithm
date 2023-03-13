package codewars.tujuhkyu;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * capitalize all vowels
 * Note: Y is not a vowel in this kata.
 */
public class ChangingLetters {

    /**
     * Input : "Hello World!"
     * Output : "HEllO WOrld!"
     */
    public static String swap(String st) {
        String result = "";

        Set<Character> vowels = Set.of('a', 'i', 'u', 'e', 'o');
        for (int i = 0; i < st.length(); i++) {
            if (vowels.contains(st.charAt(i))) {
                result += st.toUpperCase().charAt(i);
            } else {
                result += st.charAt(i);
            }
        }
        return result;
    }

    @Test
    void tests() {
        System.out.println(swap("HelloWorld"));
    }

    @Test
    public void swap_1() {
        assertEquals("HEllOWOrld!", swap("HelloWorld!"));
    }

    @Test
    public void swap_2() {
        assertEquals("SUndAy", swap("Sunday"));
    }
}

