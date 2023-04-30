package codewars.tujuhkyu;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * @author Lutfi Dendiansyah
 * @created 01/05/2023 05:15
 */
public class FindIndexSecondString {

    public static int secondSymbol(String str, char c) {
        int times = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                times++;
                if (times == 2) return i;
            }
        }
        return -1;
    }

    public static int secondSymbolII(String str, char c) {
        String letter = Character.toString(c);
        if (!str.contains(letter)) return -1;
        str = str.replaceFirst(letter, "");
        if (!str.contains(letter)) return -1;
        return str.indexOf(c)+1;
    }

    @Test
    void test() {
        String str = "Hello World!!!";
        System.out.println(str.indexOf('l'));
        System.out.println(secondSymbol(str, 'A'));
    }

    @Test
    void sampleTestCases() {
        assertEquals( 3, secondSymbolII("Hello world!!!", 'l'), "Find the index of the second symbol 'l' in the string");
        assertEquals( 7, secondSymbolII("Hello world!!!", 'o'), "Find the index of the second symbol 'o' in the string");
        assertEquals(-1, secondSymbolII("Hello world!!!", 'A'), "The symbol 'A' is not in the string");
        assertEquals(-1, secondSymbolII("", 'q'),"The symbol 'q' is not in the string");
        assertEquals(-1, secondSymbolII("Hello", '!'), "The symbol '!' is not in the string");
    }
}
