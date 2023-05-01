package codewars.tujuhkyu;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * @author Lutfi Dendiansyah
 * @created 01/05/2023 08:43
 */
public class FindTheStrayNumber {

    public static int stray(int[] numbers) {
        Arrays.sort(numbers);
        if (numbers[0] != numbers[1]) {
            return numbers[0];
        } else {
            return numbers[numbers.length - 1];
        }
    }

    @Test
    void test() {
        int[] numbers = {17, 17, 3, 17, 17, 17};
        System.out.println(stray(numbers));
    }
}
