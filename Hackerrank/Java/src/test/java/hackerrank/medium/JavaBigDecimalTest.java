package hackerrank.medium;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class JavaBigDecimalTest {

    @Test
    void testSortNumber() throws IOException {
        Scanner sc = new Scanner(Path.of("sample/java_big_decimal.txt"));
        int n = sc.nextInt();

        String[] bd = new String[n];
        for (int i = 0; i < n; i++) {
            bd[i] = new String(sc.next());
        }

        Comparator<String> customComparator = (s1, s2) -> {
            if (s1 == null) {
                return 1;
            }
            if (s2 == null) {
                return -1;
            }
            return -new BigDecimal(s1).compareTo(new BigDecimal(s2));
        };
        Arrays.sort(bd, customComparator);

        for (String bd2 : bd) {
            System.out.println(bd2);
        }

    }
}
