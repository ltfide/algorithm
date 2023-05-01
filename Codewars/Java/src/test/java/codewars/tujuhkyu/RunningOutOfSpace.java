package codewars.tujuhkyu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Lutfi Dendiansyah
 * @created 02/05/2023 04:51
 */
public class RunningOutOfSpace {

    public static String[] spacey(String[] array) {
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i-1] + array[i];
        }
        return array;
    }

    @Test
    void test() {
        String[] spaces = {"i", "have", "no", "space"};
        String[] expected = {"i", "ihave", "ihaveno", "ihavenospace"};
        Assertions.assertArrayEquals(expected, spacey(spaces));
    }
}
