package hackerrank.easy;

import java.io.IOException;
import java.nio.file.Path;
import java.util.BitSet;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class JavaBitSetTest {

    @Test
    void test() throws IOException {
        Scanner sc = new Scanner(Path.of("sample/java_bitset.txt"));
        int n = sc.nextInt();
        int m = sc.nextInt();
        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);

        for (int i = 0; i < m; i++) {
            String op = sc.next();
            int x = sc.nextInt();
            int y = sc.nextInt();

            switch (op) {
                case "AND":
                    if (x == 1) {
                        b1.and(b2);
                    } else {
                        b2.and(b1);
                    }
                    break;
                case "OR":
                    if (x == 1) {
                        b1.or(b2);
                    } else {
                        b2.or(b1);
                    }
                    break;
                case "XOR":
                    if (x == 1) {
                        b1.xor(b2);
                    } else {
                        b2.xor(b1);
                    }
                    break;
                case "SET":
                    if (x == 1) {
                        b1.set(y);
                    } else {
                        b2.set(y);
                    }
                    break;
                case "FLIP":
                    if (x == 1) {
                        b1.flip(y);
                    } else {
                        b2.flip(y);
                    }
                    break;
            }
            System.out.println(b1.cardinality() + " " + b2.cardinality());
        }
    }
}
