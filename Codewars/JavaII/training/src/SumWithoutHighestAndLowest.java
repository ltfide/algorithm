import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class SumWithoutHighestAndLowest {
    public static void main(String[] args) {
        System.out.println(sum(new int[] { 6, 2, 1, 8, 10}));
    }

    public static int sum(int[] numbers)
    {
        if (numbers == null || numbers.length <= 1) return 0;
        int min = Arrays.stream(numbers).min().getAsInt();
        int max = Arrays.stream(numbers).max().getAsInt();
        int sum = Arrays.stream(numbers).sum();

        return sum - min - max;
    }
}
