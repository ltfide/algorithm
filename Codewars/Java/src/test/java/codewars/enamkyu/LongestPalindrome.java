package codewars.enamkyu;

import org.junit.jupiter.api.Test;

public class LongestPalindrome {

    public static int longestPalindrome(final String s) {
        int n = s.length();
        if (n < 2) return n;

        int maxLength = 1, start = 0;
        int low, high;

        for (int i = 0; i < n; i++) {
            low = i - 1; // -1 0 1 2 3
            high = i + 1; // 2 3 4 5 6

            while (high < n && s.charAt(high) == s.charAt(i)) high++;
            while (low >= 0 && s.charAt(low) == s.charAt(i)) low--;
            while (low >= 0 && high < n && s.charAt(low) == s.charAt(high)) {
                low--;
                high++;
            }

            int length = high - low - 1;
            if (maxLength < length){
                maxLength = length;
                start = low + 1;
            }
        }
        System.out.println("start: " + start);
        System.out.println("MaxLength: " + maxLength);
        System.out.print("Longest palindrome substring is: ");
        System.out.println(s.substring(start, start + maxLength ));
        return 1;
    }

    @Test
    void tests() {
        longestPalindrome("babad");
    }

    @Test
    void testString() {
        String text = "sample";
        System.out.println(text.charAt(2) == text.charAt(1));
        String s = "HelloWorld";
        String x = new String("HelloWorld");
        System.out.println(s.equals(x));
        System.out.println(s == x);
    }
}
