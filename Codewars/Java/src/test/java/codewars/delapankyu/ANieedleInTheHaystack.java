package codewars.delapankyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class ANieedleInTheHaystack {

    public static String findNeedle(Object[] haystack) {
        for (int i = 0; i < haystack.length; i++) {
            String needle = String.valueOf(haystack[i]);
            if ("needle".equals(needle)) {
                return "found the needle at position " + i;
            }
        }
        return "not found";
    }

    @Test
    void test() {
        Object[] args = new Object[] { "hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk" };
        assertEquals("found the needle at position 5", findNeedle(args));
    }

    @Test
    public void tests() {
        Object[] haystack1 = { "3", "123124234", null, "needle", "world", "hay", 2, "3", true, false };
        Object[] haystack2 = { "283497238987234", "a dog", "a cat", "some random junk", "a piece of hay", "needle",
                "something somebody lost a while ago" };
        Object[] haystack3 = { 1, 2, 3, 4, 5, 6, 7, 8, 8, 7, 5, 4, 3, 4, 5, 6, 67, 5, 5, 3, 3, 4, 2, 34, 234, 23, 4,
                234, 324, 324, "needle", 1, 2, 3, 4, 5, 5, 6, 5, 4, 32, 3, 45, 54 };

        assertEquals("found the needle at position 3", findNeedle(haystack1));
        assertEquals("found the needle at position 5", findNeedle(haystack2));
        assertEquals("found the needle at position 30", findNeedle(haystack3));
    }

    @Test
    void testWithArraysUtil() {
        Object[] haystack = { "3", "123124234", null, "needle", "world", "hay", 2, "3", true, false };
        int index = Arrays.asList(haystack).indexOf("needle");
        assertEquals(3, index);
    }
}
