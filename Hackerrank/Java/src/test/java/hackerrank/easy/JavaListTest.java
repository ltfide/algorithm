package hackerrank.easy;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

import org.junit.jupiter.api.Test;

public class JavaListTest {

    @Test
    void javaList() throws IOException {
        Path path = Path.of("sample/java-list-06.txt");
        Scanner sc = new Scanner(path);

        List<Integer> numbers = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        int total = sc.nextInt();
        while (sc.hasNext()) {
            String opt = sc.next();
            if ("Insert".equals(opt)) {
                numbers.add(sc.nextInt(), sc.nextInt());
            } else if ("Delete".equals(opt)) {
                int z = sc.nextInt();
                numbers.remove(z);
            }
        }

        for (Integer num : numbers) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
