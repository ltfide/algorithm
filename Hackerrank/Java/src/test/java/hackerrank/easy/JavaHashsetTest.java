package hackerrank.easy;

import java.io.IOException;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class JavaHashsetTest {

    @Test
    void testHashset() throws IOException {
        Scanner sc = new Scanner(Path.of("sample/java_hashset.txt"));
        int total = sc.nextInt();
        sc.nextLine();

        Set<String> set = new HashSet<>();
        while (sc.hasNextLine()) {
            set.add(sc.nextLine());
            System.out.println(set.size());
        }
        sc.close();
    }
}
