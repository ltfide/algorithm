package codewars.enamkyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ConsecutiveStrings {

    public static String longestConsec(String[] strarr, int k) {
        String result = "";

        for (int i = k - 1; i < strarr.length; i++) {
            String x = "";
            int index = i;
            while (index > i - k) {
                x = strarr[index] + x;
                index--;
            }

            if (result.length() < x.length()) {
                result = x;
            }
        }

        return result;
    }

    @Test
    void tests() {
        String[] strarr = { "tree", "folingxxxxxx", "trashy", "blue", "abcdef", "uvwxyz" };
        int k = 3;

        System.out.println(longestConsec(strarr, k));
    }

    @Test
    void testString() {
        String name = "Lutfi";
        name = "Dendiansyah";

        System.out.println(name); // Dendiansyah
    }

    @Test
    public void test() {
        assertEquals("abigailtheta", longestConsec(
                new String[] { "zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail" }, 2));
        assertEquals("oocccffuucccjjjkkkjyyyeehh", longestConsec(
                new String[] { "ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh" },
                1));
        assertEquals("", longestConsec(new String[] {}, 3));
        assertEquals("wkppqsztdkmvcuwvereiupccauycnjutlvvweqilsfytihvrzlaodfixoyxvyuyvgpck",
                longestConsec(new String[] { "itvayloxrp", "wkppqsztdkmvcuwvereiupccauycnjutlv",
                        "vweqilsfytihvrzlaodfixoyxvyuyvgpck" }, 2));
        assertEquals("wlwsasphmxxowiaxujylentrklctozmymu",
                longestConsec(new String[] { "wlwsasphmxx", "owiaxujylentrklctozmymu", "wpgozvxxiu" }, 2));
        assertEquals("", longestConsec(new String[] { "zone", "abigail", "theta", "form", "libe", "zas" }, -2));
        assertEquals("ixoyx3452zzzzzzzzzzzz",
                longestConsec(new String[] { "it", "wkppv", "ixoyx", "3452", "zzzzzzzzzzzz" }, 3));
        assertEquals("", longestConsec(new String[] { "it", "wkppv", "ixoyx", "3452", "zzzzzzzzzzzz" }, 15));
        assertEquals("", longestConsec(new String[] { "it", "wkppv", "ixoyx", "3452", "zzzzzzzzzzzz" }, 0));
    }

}
